package et.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import polyglot.ast.ClassBody;
import polyglot.ast.ClassDecl_c;
import polyglot.ast.Id;
import polyglot.ast.TypeNode;
import polyglot.types.Flags;
import polyglot.util.Position;

public class EPolicyDecl extends ClassDecl_c{
	Map<String, String> policies = new HashMap<String, String>();
	
	public EPolicyDecl(Position pos, Flags flags, Id name, TypeNode superClass,
			List<TypeNode> interfaces, ClassBody body) {
		super(pos, flags, name, superClass, interfaces, body);
	}

	public void setList(List<String> phases) {
		for (String stat : phases) {
			if (stat.contains("->")) {
				String[] two = stat.split("->");
				this.setPolicy(two[0], two[1]);
			}else{
				System.err.println("invalid epolicy decl");
				System.exit(0);
			}
		}
	}
	
	private void setPolicy(String lpolicy, String rpolicy) {
		policies.put(lpolicy, rpolicy);
	}
}
