package et.ast;

import java.util.List;

import cs.graph.CSGraph;
import cs.types.CSObjectType;
import cs.types.csTypeSystem_c;
import et.linersolve.ETValueHolder;
import et.types.ETTYPE;
import polyglot.ast.Expr;
import polyglot.ast.Expr_c;
import polyglot.ast.Node;
import polyglot.ast.Node_c;
import polyglot.ast.Precedence;
import polyglot.ast.Term;
import polyglot.types.NullType;
import polyglot.types.Type;
import polyglot.util.CodeWriter;
import polyglot.util.Position;
import polyglot.visit.CFGBuilder;
import polyglot.visit.PrettyPrinter;

// add by Kenan
public class prettyPrintDynamic_c {
	static public void dPrint(Expr e, Type castTo, CodeWriter w,
			PrettyPrinter tr) {
		if (!(castTo instanceof CSObjectType)) {
			w.begin(0);
			printSubExpr(e, w, tr);
			w.end();
			return;
		}

		boolean isDynamicModeCheckNeeded = false;
		boolean isDynamicPhaseCheckNeeded = false;
		Type t = e.type();

		ETValueHolder vh = (ETValueHolder) ((csTypeSystem_c) e.type()
				.typeSystem()).getValueHolder();
		CSGraph graph = ((csTypeSystem_c) e.type().typeSystem()).getGraph();

		// add by Steve
		// condition for "field = null;"
		if (t instanceof NullType) {
			e.prettyPrint(w, tr);
			return;
		}

		CSObjectType rhs = (CSObjectType) t;
		CSObjectType lhs = (CSObjectType) castTo;
		if (vh.isDynamicValue(rhs.getAliasName(), ETTYPE.MODE)) {
			if (!vh.isDefaultValue(lhs.getAliasName(), ETTYPE.MODE)) {
				isDynamicModeCheckNeeded = true;
			}
		}
		if (vh.isDynamicValue(rhs.getAliasName(), ETTYPE.PHASE)) {
			if (!vh.isDefaultValue(rhs.getAliasName(), ETTYPE.PHASE)) {
				isDynamicPhaseCheckNeeded = true;
			}
		}

		if (isDynamicModeCheckNeeded && isDynamicPhaseCheckNeeded) {

			String modeLabel = vh.getStringEquivalent(lhs.getAliasName(),
					ETTYPE.MODE, graph);// lhs.getECMMode();
			String phaseLabel = vh.getStringEquivalent(lhs.getAliasName(),
					ETTYPE.PHASE, graph); // lhs.getECMPhase();
			w.write("(");
			w.write(rhs.fullClassName());
			w.write(")");
			w.write("MyUtility.checkMode(");
			w.write("(");
			w.write(rhs.fullClassName());
			w.write(")");
			w.write("MyUtility.checkPhase(");
			printSubExpr(e, w, tr);
			w.write("," + "_utilPhases." + phaseLabel + ")");

			w.write("," + "_utilModes." + modeLabel + ")");
		} else if (isDynamicModeCheckNeeded) {
			String Static_Label = vh.getStringEquivalent(lhs.getAliasName(),
					ETTYPE.MODE, graph);// lhs.getECMMode();
			System.out.println("In Pretty Print Dynamic Mode: " + Static_Label);

			w.write("(");
			w.write(rhs.fullClassName());
			w.write(")");

			w.write("MyUtility.checkMode(");
			printSubExpr(e, w, tr);
			w.write("," + "_utilModes." + Static_Label + ")");
		}

		else if (isDynamicPhaseCheckNeeded) {
			String Static_Label = vh.getStringEquivalent(lhs.getAliasName(),
					ETTYPE.PHASE, graph);// lhs.getECMPhase();
			System.out
					.println("In Pretty Print Dynamic Phase: " + Static_Label);

			w.write("(");
			w.write(rhs.fullClassName());
			w.write(")");
			w.write("MyUtility.checkPhase(");
			printSubExpr(e, w, tr);
			w.write("," + "_utilPhases." + Static_Label + ")");

		} else {
			w.begin(0);
			printSubExpr(e, w, tr);
			w.end();

		}
		return;
	}

	static private void printSubExpr(Expr expr, CodeWriter w, PrettyPrinter pp) {

		w.write("(");
		printBlock(expr, w, pp);
		w.write(")");
	}

	static private void printBlock(Node n, CodeWriter w, PrettyPrinter pp) {
		w.begin(0);
		print(n, w, pp);
		w.end();
	}

	static private void print(Node child, CodeWriter w, PrettyPrinter pp) {
		// Kenan the first argument of print method is never use in
		// prettyprinter
		pp.print(null, child, w);
	}
}
// end
