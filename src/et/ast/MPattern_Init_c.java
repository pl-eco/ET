package et.ast;

import java.util.List;

import cs.types.CSNonGenericType;
import cs.types.csTypeSystem_c;
import et.ast.mswitch.MSwitchGroup;
import et.types.etTypeSystem_c;
import et.util.Names;
import polyglot.ast.Expr;
import polyglot.ast.Expr_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.SwitchElement;
import polyglot.ast.Switch_c;
import polyglot.ast.Term;
import polyglot.ext.jl5.types.JL5ParsedClassType_c;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.util.CodeWriter;
import polyglot.util.CollectionUtil;
import polyglot.util.ListUtil;
import polyglot.util.Position;
import polyglot.visit.CFGBuilder;
import polyglot.visit.NodeVisitor;
import polyglot.visit.PrettyPrinter;
import polyglot.visit.TypeChecker;

public class MPattern_Init_c extends Expr_c {
	private List<MPatternElement> list;

	public MPattern_Init_c(Position pos, List<MPatternElement> list) {
		super(pos);
		this.list = ListUtil.copy(list, true);
	}

	// Add by steve 6/16/11
	public Node typeCheck(TypeChecker tc) throws SemanticException {
		// check the consistency of each element's type
		Type mostSuperType = null;
		if (list.size() > 0) {
			mostSuperType = list.get(0).getExpr().type();

			TypeSystem ts = type().typeSystem();

			for (int i = 1; i < list.size(); i++) {
				Type curType = list.get(i).getExpr().type();
				if (ts.isSubtype(mostSuperType, curType)) {
					mostSuperType = curType;
				}
			}

			for (int i = 0; i < list.size(); i++) {
				if (!ts.isSubtype(list.get(i).getExpr().type(), mostSuperType)) {
					throw new SemanticException(
							"Non-uniform types in patter branchs", position());
				}
			}
		} else {
			throw new SemanticException("The patter cannot be empty",
					position());
		}

		if (mostSuperType instanceof CSNonGenericType)
			((CSNonGenericType) mostSuperType).setTypeLabel("mpattern");

		return type(mostSuperType);
	}

	public Node visitChildren(NodeVisitor v) {
		List<MPatternElement> list = visitList(this.list, v);
		return reconstruct(list);
	}

	/** Reconstruct the statement. */
	protected MPattern_Init_c reconstruct(List<MPatternElement> list) {
		if (!CollectionUtil.equals(list, this.list)) {
			MPattern_Init_c n = (MPattern_Init_c) copy();
			n.list = ListUtil.copy(list, true);
			return n;
		}

		return this;
	}

	@Override
	public Term firstChild() {
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	@Override
	public <T> List<T> acceptCFG(CFGBuilder<?> v, List<T> succs) {
		v.visitCFGList(list, this, EXIT);
		return succs;
	}

	public void prettyPrint(CodeWriter w, PrettyPrinter pp) {
		/*
		 * {lofi: new A(), hifi: new A()} --> new $A_pattern(new A().setMode(1
		 * (value of lofi)),new A().setMode(2 (value of hifi)));
		 */

		StringBuilder sb = new StringBuilder("");
		String className = type().toString();
		if (type().isPrimitive()) {
			className = csTypeSystem_c.primitiveNameConversion(type()
					.toString());
		}

		sb.append("new ").append(Names.MPTN_CLASS_NAME).append("<")
				.append(className).append(">").append("(");
		w.write(sb.toString());
		sb.setLength(0);

		// print args
		for (int i = 0; i < list.size(); i++) {
			MPatternElement element = list.get(i);

			sb.append(Names.MODE_DECL_CLASS_NAME).append(".")
					.append(element.getLabel()).append(", ");
			// insert "," only when it is not the last parameter
			w.write(sb.toString());
			sb.setLength(0);

			this.print(element.getExpr(), w, pp);

			sb.append(i == list.size() - 1 ? "" : ",");
		}

		sb.append(")"/* end of args */).append(";");
		w.write(sb.toString());
	}

	@Override
	public Node copy(NodeFactory nf) {
		return ((etNodeFactory) nf).MPattern_Init(this.position, this.list);
	}
}
