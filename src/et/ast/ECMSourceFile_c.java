package et.ast;

import java.util.LinkedList;
import java.util.List;

import polyglot.ast.Import;
import polyglot.ast.Import_c;
import polyglot.ast.PackageNode;
import polyglot.ast.SourceFile_c;
import polyglot.ast.TopLevelDecl;
import polyglot.util.CodeWriter;
import polyglot.util.ListUtil;
import polyglot.util.Position;
import polyglot.visit.PrettyPrinter;

/*
 * This extension is to add extra import statement to the class file
 */
public class ECMSourceFile_c extends SourceFile_c {

	public ECMSourceFile_c(Position pos, PackageNode package_,
			List<Import> imports, List<TopLevelDecl> decls) {
		super(pos, package_, imports, decls);
	}

	// add import statement here
	@Override
	public void prettyPrint(CodeWriter w, PrettyPrinter tr) {
		w.write("<<<< " + source + " >>>>");
		w.newline(0);

		if (package_ != null) {
			w.write("package ");
			print(package_, w, tr);
			w.write(";");
			w.newline(0);
			w.newline(0);
		}

		for (Import im : imports) {
			print(im, w, tr);
		}

		print(new Import_c(this.position().startOf(), Import.CLASS,
				"et.util.CallScaler"), w, tr);
		print(new Import_c(this.position().startOf(), Import.CLASS,
				"et.util.utilScale"), w, tr);

		if (!imports.isEmpty()) {
			w.newline(0);
		}

		for (TopLevelDecl d : decls) {
			print(d, w, tr);
		}
	}
}
