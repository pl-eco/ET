package et.ast;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import cs.graph.CSGraph;
import cs.types.CSBaseType;
import cs.types.CSNonGenericType;
import cs.types.CSObjectType;
import cs.types.CSParsedClassType_c;
import cs.types.csTypeSystem_c;
import cs.util.CSUtil;
import cs.util.EasyDebugger;
import et.linersolve.ETValueHolder;
import et.types.ETTYPE;
import polyglot.ast.Eval;
import polyglot.ast.Expr;
import polyglot.ast.Id;
import polyglot.ast.Node;
import polyglot.ast.Receiver;
import polyglot.ast.TypeNode;
import polyglot.ext.jl5.ast.JL5Call_c;
import polyglot.ext.jl5.visit.JL5Translator;
import polyglot.types.PrimitiveType_c;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.util.CodeWriter;
import polyglot.util.Position;
import polyglot.visit.PrettyPrinter;
import polyglot.visit.TypeChecker;

public class ECMCall_c extends JL5Call_c {
	private String enclosingClassName;

	// for pretty print
	public Type currentType = null;
	boolean isStatement = false;

	// end

	public ECMCall_c(Position pos, Receiver target, List<TypeNode> typeArgs,
			Id name, List<Expr> arguments) {
		super(pos, target, typeArgs, name, arguments);
	}

	@Override
	public Node typeCheck(TypeChecker tc) throws SemanticException {
		Node ret = super.typeCheck(tc);

		// current class can be null for field decl in annotations
		if (tc.context().currentClass() != null) {
			enclosingClassName = tc.context().currentClass().fullName();
		}
		return ret;
	}

	public Node typeCheckOverride(Node parent, TypeChecker tc)
			throws SemanticException {
		if (parent instanceof Eval) {
			this.isStatement = true;
		}
		currentType = tc.context().currentClass();
		return null;
	}

	// return the call site and context values
	private boolean checkCallSiteValues() {
		ETValueHolder vh = (ETValueHolder) ((csTypeSystem_c) type()
				.typeSystem()).getValueHolder();
		CSGraph g = ((csTypeSystem_c) type().typeSystem()).getGraph();

		// get target's value
		String calleeAlias = CSUtil.getID(target().type()).pgmLabel();
		Set<String> calleeIDs = vh.getUniqueIDs(calleeAlias);
		int tVal = vh.getFinalResult(calleeIDs.iterator().next(), ETTYPE.PHASE,
				g);

		// check if all values are same
		for (String var : calleeIDs) {
			int t = vh.getFinalResult(var, ETTYPE.PHASE, g);
			if (tVal != t) {
				EasyDebugger.debug("inconsistent value: " + tVal + "  " + t);
			}
		}

		// get context's value
		int cVal = -1;
		for (String callee : calleeIDs) {
			String contextID = vh.getContext(callee);
			int t = vh.getFinalResult(contextID, ETTYPE.PHASE, g);
			if (cVal == -1)
				cVal = t;
			else if (cVal != t) {
				EasyDebugger.debug("inconsistent value: " + tVal + "  " + t);
			}
		}

		// result is tVal and cVal;
		return tVal != cVal;
	}

	// return target phase
	private int getTargetPhase() {
		ETValueHolder vh = (ETValueHolder) ((csTypeSystem_c) type()
				.typeSystem()).getValueHolder();
		CSGraph g = ((csTypeSystem_c) type().typeSystem()).getGraph();

		// get target's value
		String calleeAlias = null;

		// if the target is adapt, get the adaptee
		if (target() instanceof Adapt_c) {
			calleeAlias = CSUtil.getID(((Adapt_c) target()).getExpr().type())
					.pgmLabel();
		} else {
			calleeAlias = CSUtil.getID(target().type()).pgmLabel();
		}

		Set<String> calleeIDs = vh.getUniqueIDs(calleeAlias);
		int tVal = vh.getFinalResult(calleeIDs.iterator().next(), ETTYPE.PHASE,
				g);

		// check if all values are same
		for (String var : calleeIDs) {
			int t = vh.getFinalResult(var, ETTYPE.PHASE, g);
			if (tVal != t) {
				EasyDebugger.debug("inconsistent value: " + tVal + "  " + t);
			}
		}
		return tVal;
	}

	// return context phase
	private int getCurPhase() {
		ETValueHolder vh = (ETValueHolder) ((csTypeSystem_c) type()
				.typeSystem()).getValueHolder();
		CSGraph g = ((csTypeSystem_c) type().typeSystem()).getGraph();

		// get target's value
		String calleeAlias = CSUtil.getID(target().type()).pgmLabel();
		Set<String> calleeIDs = vh.getUniqueIDs(calleeAlias);

		// get context's value
		int cVal = -1;
		for (String callee : calleeIDs) {
			String contextID = vh.getContext(callee);
			int t = vh.getFinalResult(contextID, ETTYPE.PHASE, g);
			if (cVal == -1)
				cVal = t;
			else if (cVal != t) {
				EasyDebugger.exit("inconsistent value: " + cVal + "  " + t);
			}
		}
		return cVal;
	}

	public void prettyPrint(CodeWriter w, PrettyPrinter tr) {
		int tPhase = this.getTargetPhase();
		int curPhase = this.getCurPhase();

		if (tPhase != curPhase) {
			String scaleUp = null;
			String scaleBack = null;

			scaleUp = String.valueOf(PhasesDecl.getScale((int) tPhase));
			scaleBack = String.valueOf(PhasesDecl.getScale((int) curPhase));

			String targetName = null;
			String targetType = null;

			if (targetImplicit) {
				targetName = "this";
				if (target == null)
					EasyDebugger.exit("ECMCall_c pretty print: target is null");
			} else {
				targetName = target.toString();
			}

			targetType = target.type().toString();

			w.begin(0);

			/*
			 * print target
			 */
			boolean isVoid = methodInstance().returnType().isVoid();
			if (!isVoid) {
				// if return is not void, cast the return type
				String retType = this.methodInstance().returnType().toString();
				if (!retType.equals("java.lang.Object"))
					w.write("("
							+ csTypeSystem_c.primitiveNameConversion(retType)
							+ ")");
			}

			w.write("new et.util.CallScaler(){");
			w.newline(2);
			w.write("public Object scaleCall(Object target, Object...args){");
			if (!isVoid) {
				w.newline(2);
				w.write("Object ret = null;");
			}
			w.newline(2);
			w.write("et.util.utilScale.scale( \"" + scaleUp + "\" );");
			w.newline(2);
			// if there are arguments
			if (arguments.size() > 0) {
				w.write("int num_arg = " + arguments.size() + ";");
				w.newline();
				w.write("Object[] o = new Object[num_arg];");
				w.newline();
				w.write("int counter = 0;");
				w.newline();
				w.write("for(Object arg: args){    o[counter++] = arg;   }");
			}

			if (!isVoid) {
				w.newline(2);
				w.write("ret = ");
			}
			w.newline();
			w.write("((" + targetType + ")target)." + name);
			// print arguments
			w.write("(");
			if (arguments.size() > 0) {
				w.begin(0);
				int counter = 0;
				for (Iterator i = arguments.iterator(); i.hasNext();) {
					Expr e = (Expr) i.next();
					// cast the type of argument
					w.write("("
							+ csTypeSystem_c.primitiveNameConversion(e.type()
									.toString()) + ")");
					// print(e, w, tr);
					w.write("o[" + counter + "]");

					if (i.hasNext()) {
						w.write(",");
						w.allowBreak(0, " ");
					}
					counter++;
				}
				w.end();
			}
			w.write(");");

			w.newline(2);
			w.write("et.util.utilScale.scale( \"" + scaleBack
					+ "\" ); //scale back");

			w.newline(2);
			if (!isVoid)
				w.write("return ret;");
			else
				w.write("return null;");
			w.write("}");
			w.write("}.scaleCall(");

			// // print voltage
			// w.write("10000, ");

			// print target
			if (!targetImplicit) {
				if (target instanceof Expr) {
					printSubExpr((Expr) target, w, tr);
				} else if (target != null) {
					print(target, w, tr);
				}
				w.allowBreak(2, 3, "", 0);
			} else {
				w.write("this");
			}

			// give arguemnt
			if (arguments.size() > 0) {
				w.write(", ");
				w.begin(0);
				for (Iterator i = arguments.iterator(); i.hasNext();) {
					Expr e = (Expr) i.next();
					print(e, w, tr);

					if (i.hasNext()) {
						w.write(",");
						w.allowBreak(0, " ");
					}
				}
				w.end();
			}
			w.write(")");
			w.end();
		} else {
			this.prettyPrintMPattern(w, tr);
		}
	}

	// preamble & epilogue version
	public void prettyPrintNotTested(CodeWriter w, PrettyPrinter tr) {
		boolean scalingNeeded = false;
		boolean profilingNeeded = false;

		scalingNeeded = checkCallSiteValues();

		Type typeVar = target.type();
		if (!(typeVar instanceof CSObjectType)) {
			prettyPrintMPattern(w, tr);
			return;
		}
		// add by Kenan

		CSObjectType typeObject = (CSObjectType) typeVar;

		if (!scalingNeeded) {
			prettyPrintMPattern(w, tr);
			return;
		}

		ETValueHolder vh = (ETValueHolder) ((csTypeSystem_c) this.type()
				.typeSystem()).getValueHolder();
		CSGraph graph = ((csTypeSystem_c) this.type().typeSystem()).getGraph();

		/******** Anything below requires preamble and epilogue **************/
		CSBaseType targetType = null;

		if (target().type() instanceof CSBaseType) {
			targetType = (CSBaseType) target().type();
		}

		if (isStatement) {
			w.begin(0);
			w.write("MyUtility.preamble(");
			printTarget(w, tr);

			w.write("," + profilingNeeded + "," + scalingNeeded + ",");
			if (targetType != null) {
				w.write("_utilPhases."
						+ vh.getStringEquivalent(targetType.getAliasName(),
								ETTYPE.PHASE, graph));
				// LinearSolverMapper.getMappedPhaseName(targetType
				// .getECMPhase()));
			} else {
				System.out.println("error: targetType is null!");
			}

			w.write(");");
			printTarget(w, tr);
			printPostTarget(w, tr);
			w.write(";");
			w.newline();
			// w.end();
			// if (targetType.getECMMode() == NameIndex.defaultDynamicMode) {
			// w.write("MyUtility.epilogueDynamicObject(");
			// } else {
			w.write("MyUtility.epilogueStaticObject(");
			// }
			printTarget(w, tr);
			w.write(",");
			printTarget(w, tr);
			w.write("," + profilingNeeded + "," + scalingNeeded + ",");
			if (currentType instanceof CSParsedClassType_c) {
				w.write("_utilPhases."
						+ vh.getStringEquivalent(
								((CSParsedClassType_c) currentType).getID()
										.pgmLabel(), ETTYPE.PHASE, graph));
				// LinearSolverMapper
				// .getMappedPhaseName(((ECMParsedClassType_c) currentType)
				// .getECMPhase()));
			}
			w.write(");");
			w.end();
			return;
			// End of all cases of statement
		}

		/********
		 * Anything below requires preamble, epilogue and does not end with
		 * semicolon
		 **************/
		String returnTypeToCast = mi.returnType().toString();
		w.begin(0);
		if (!(mi.returnType() instanceof CSObjectType)) {
			Type t = mi.returnType();
			if (t.isPrimitive()) {

				returnTypeToCast = ((PrimitiveType_c) t).wrapperTypeString(t
						.typeSystem());
			}

		}

		// kenan 8/16/2012
		// if (targetType.getECMMode() != NameIndex.defaultDynamicMode
		// && !targetType.getECMMode().endsWith(NameIndex.defaultMode)) {
		// w.write("(" + returnTypeToCast
		// + ")MyUtility.epilogueStaticObject(MyUtility.preamble(");
		// } else if (targetType.getECMMode() == NameIndex.defaultDynamicMode) {
		w.write("(" + returnTypeToCast
				+ ")MyUtility.epilogueDynamicObject(MyUtility.preamble(");
		// }

		// end kenan 8/16/2012
		printTarget(w, tr);

		w.write("," + profilingNeeded + "," + scalingNeeded + ",");
		if (targetType != null) {
			w.write("_utilPhases."
					+ vh.getStringEquivalent(targetType.getAliasName(),
							ETTYPE.PHASE, graph));
			// LinearSolverMapper.getMappedPhaseName(targetType
			// .getECMPhase()));
		} else {
			System.out.println("error: targetType is null!");
		}

		w.write("),");
		printTarget(w, tr);

		printPostTarget(w, tr);

		w.write("," + profilingNeeded + "," + scalingNeeded + ",");
		if (currentType instanceof CSParsedClassType_c) {
			w.write("_utilPhases."
					+ vh.getStringEquivalent(
							((CSParsedClassType_c) currentType).getID()
									.pgmLabel(), ETTYPE.PHASE, graph));
			// LinearSolverMapper
			// .getMappedPhaseName(((CSParsedClassType_c) currentType)
			// .getECMPhase()));
		}
		w.write(")");
		w.newline();

		w.end();

	}

	private void prettyPrintMPattern(CodeWriter w, PrettyPrinter tr) {
		if (!targetImplicit) {
			if (target instanceof Expr) {
				printSubExpr((Expr) target, w, tr);
			} else if (target != null) {
				if (tr instanceof JL5Translator) {
					JL5Translator jltr = (JL5Translator) tr;
					jltr.printReceiver(target, w);
				} else {
					print(target, w, tr);
				}
			}

			// add short hand case
			if (target().type() instanceof CSNonGenericType
					&& ((CSNonGenericType) target().type()).getTypeLabel()
							.equals("mpattern")) {
				String mptApp = MPatternApp.printMptnApp(ECMClassDecl_c
						.getModeFieldNameOfClass(enclosingClassName));
				w.write(mptApp);

			}
			// end

			w.write(".");
			w.allowBreak(2, 3, "", 0);
		}

		w.begin(0);
		w.write(name + "(");
		if (arguments.size() > 0) {
			w.allowBreak(2, 2, "", 0); // miser mode
			w.begin(0);

			for (Iterator<Expr> i = arguments.iterator(); i.hasNext();) {
				Expr e = i.next();
				print(e, w, tr);

				if (i.hasNext()) {
					w.write(",");
					w.allowBreak(0, " ");
				}
			}

			w.end();
		}
		w.write(")");
		w.end();
	}

	public void printPostTarget(CodeWriter w, PrettyPrinter tr) {
		w.write(".");
		w.write(name + "(");
		if (arguments.size() > 0) {
			w.allowBreak(2, 2, "", 0); // miser mode
			w.begin(0);

			for (Iterator i = arguments.iterator(), j = mi.formalTypes()
					.iterator(); i.hasNext();) {
				Expr e = (Expr) i.next();
				prettyPrintDynamic_c.dPrint(e, (Type) j.next(), w, tr);
				// print(e, w, tr);

				if (i.hasNext()) {
					w.write(",");
					w.allowBreak(0, " ");
				}
			}

			w.end();
		}

		w.write(")");
	}

	public void printTarget(CodeWriter w, PrettyPrinter tr) {
		if (!targetImplicit) {
			if (target instanceof Expr) {
				printSubExpr((Expr) target, w, tr);
			} else if (target != null) {
				print(target, w, tr);
			} else {
				w.write("this");
			}
		}
	}
}
