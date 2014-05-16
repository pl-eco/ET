package et.data.constraint;

import java.util.LinkedList;

import polyglot.types.Context_c;

import cs.data.ConstraintContainer;
import cs.data.constraint.Constraint;
import cs.data.id.ID;
import et.ast.UsingBlock_c.Type;

public class UsingBlockConstraintContainer extends ConstraintContainer {
	private UsingBlockConstraint ubc;
	public UsingBlockConstraintContainer(ID id, Type type) {
		ubc = new UsingBlockConstraint(id, type);
	}
	
	@Override
	public void addConstraint(Constraint cons, Context_c context) {
		ubc.addConstraint(cons);
	}
	
	public UsingBlockConstraint getUsingBlockConstraint() {
		return ubc;
	}
}
