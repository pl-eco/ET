package et.ast;

import et.util.Names;
import polyglot.ast.Expr;
import polyglot.ast.Node;
import polyglot.ast.Return_c;
import polyglot.types.CodeInstance;
import polyglot.types.MethodInstance;
import polyglot.types.SemanticException;
import polyglot.util.CodeWriter;
import polyglot.util.Position;
import polyglot.visit.PrettyPrinter;
import polyglot.visit.TypeChecker;

public class ECMReturn_c extends Return_c {
	private boolean isForAttributer = false;
	private String currentClassName = null;

	public ECMReturn_c(Position pos, Expr expr) {
		super(pos, expr);
	}

	@Override
	/*
	 * label the field if it is for attributer method
	 */
	public Node typeCheck(TypeChecker tc) throws SemanticException {
		Node ret = super.typeCheck(tc);

		CodeInstance ci = tc.context().currentCode();
		if (ci instanceof MethodInstance
				&& ((MethodInstance) ci).name().equals(
						Names.ATTRIBUTER_METHOD_NAME)) {
			isForAttributer = true;
		}
		this.currentClassName = tc.context().currentClass().name();

		return ret;
	}

	@Override
	/*
	 * Modify the return statement when it is for the "$attributer" method
	 * 
	 * Modification: return x; --> ((A) this.clone()).setMode(x);
	 */
	public void prettyPrint(CodeWriter w, PrettyPrinter tr) {
		if (this.isForAttributer) {
			// modification code
			w.write("try{");
			w.write(" return ((" + this.currentClassName + ") this.clone())."
					+ Names.SET_MODE_METHOD_NAME + "(");
			print(expr, w, tr);
			w.write(");");
			w.write("}catch (CloneNotSupportedException e) { e.printStackTrace(); System.exit(1); }");
			w.write("return null");
		} else {
			// copy from super method
			w.write("return");
			w.write(" ");
			if (expr != null) {
				print(expr, w, tr);
			}
		}
		w.write(";");
	}

}
