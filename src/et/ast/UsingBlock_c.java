package et.ast;

import cs.data.ConstraintContainer;
import cs.data.constraint.Constraint;
import cs.data.id.LocalID;
import cs.util.CSUtil;
import et.data.constraint.UsingBlockConstraint;
import polyglot.ast.Block;
import polyglot.ast.Block_c;
import polyglot.lex.Identifier;
import polyglot.parse.Name;
import polyglot.types.Context_c;

public class UsingBlock_c extends Block_c {

	public enum Type {
		THEN, ELSE;
	}

	Type type;

	public UsingBlock_c(Block block, Type type) {
		super(block.position(), block.statements());
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
}
