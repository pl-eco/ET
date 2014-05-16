package et.ast;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import et.util.Names;
import polyglot.ast.ClassBody;
import polyglot.ast.ClassDecl_c;
import polyglot.ast.Id;
import polyglot.ast.TypeNode;
import polyglot.types.Flags;
import polyglot.util.CodeWriter;
import polyglot.util.Position;
import polyglot.visit.PrettyPrinter;

public class ModesDecl extends ClassDecl_c {
	private static Set<String> modes = new TreeSet<String>();

	// low to high
	private static List<String> modesOrder = new LinkedList<String>();

	public ModesDecl(Position pos, Flags flags, Id name, TypeNode superClass,
			List interfaces, ClassBody body) {
		super(pos, flags, name, superClass, interfaces, body);
	}

	public static boolean hasMode(String modeName) {
		return modeName == null ? false : modes.contains(modeName);
	}

	public static Set<String> getModes() {
		return modes;
	}

	public static List<String> getModesOrder() {
		return modesOrder;
	}

	public void setList(List<String> modes) {
		for (String stat : modes) {
			if (stat.contains("<:")) {
				String[] two = stat.split("<:");
				setModeOrderHelper(modesOrder, two[0], two[1]);

				this.setMode(two[0]);
				this.setMode(two[1]);
			} else {
				this.setMode(stat);
			}
		}

	}

	private void setMode(String mode) {
		modes.add(mode);
	}

	public static void setModeOrderHelper(List<String> modesOrder,
			String lMode, String hMode) {
		for (int i = 0; i < modesOrder.size(); i++) {
			String mode = (String) modesOrder.get(i);
			if (mode.equals(lMode)) {
				modesOrder.add(i + 1, hMode);
				break;
			}
			if (mode.equals(hMode)) {
				modesOrder.add(i, lMode);
				break;
			}
		}
		if (!modesOrder.contains(lMode)) {
			modesOrder.add(lMode);
		}
		if (!modesOrder.contains(hMode)) {
			modesOrder.add(hMode);
		}
	}

	public String toString() {
		return "{ mode_body }";
	}

	public void prettyPrint(CodeWriter w, PrettyPrinter tr) {
		w.write("class " + Names.MODE_DECL_CLASS_NAME + "{  \n");

		int counter = 0;
		for (Iterator iter = modes.iterator(); iter.hasNext();) {
			String mode = (String) iter.next();
			w.write("		public static final int " + mode + " = " + counter++
					+ "; \n");
		}
		w.write("} \n");

		// System.out.println("Order: ");
		for (String element : modesOrder) {
			// System.out.println(element + "   ");
		}
	}

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("33");
		set.add("3");
		System.out.println(set.size());
	}
}
