package et.ast;

import cs.types.CSNonGenericType;
import polyglot.ast.AmbReceiver;
import polyglot.ast.Expr;
import polyglot.ast.Id;
import polyglot.ast.Node;
import polyglot.ast.Receiver;
import polyglot.ast.TypeNode;
import polyglot.ext.jl5.ast.JL5Field_c;
import polyglot.ext.jl5.visit.JL5Translator;
import polyglot.types.SemanticException;
import polyglot.util.CodeWriter;
import polyglot.util.Position;
import polyglot.visit.PrettyPrinter;
import polyglot.visit.TypeChecker;

public class ETField_c extends JL5Field_c {
	private String enclosingClassName;

	public ETField_c(Position pos, Receiver target, Id name) {
		super(pos, target, name);
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

	@Override
	public void prettyPrint(CodeWriter w, PrettyPrinter tr) {
		w.begin(0);
		if (!targetImplicit) {
			// explicit target.
			if (target instanceof Expr) {
				printSubExpr((Expr) target, w, tr);
			} else if (target instanceof TypeNode
					|| target instanceof AmbReceiver) {
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
		tr.print(this, name, w);
		w.end();
	}
}
