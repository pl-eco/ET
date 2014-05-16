package et.ast;

import java.util.LinkedList;
import java.util.List;

import et.data.constraint.WhereConstraint;
import polyglot.ast.Block;
import polyglot.ast.Formal;
import polyglot.ast.Id;
import polyglot.ast.TypeNode;
import polyglot.ext.jl5.ast.AnnotationElem;
import polyglot.ext.jl5.ast.JL5MethodDecl_c;
import polyglot.ext.jl5.ast.ParamTypeNode;
import polyglot.types.Flags;
import polyglot.util.Position;

public class ECMMethodDecl_c extends JL5MethodDecl_c {
	private List<String> whereOrder;

	public ECMMethodDecl_c(Position pos, Flags flags,
			List<AnnotationElem> annotations, TypeNode returnType, Id name,
			List<Formal> formals, List<TypeNode> throwTypes, Block body,
			List<ParamTypeNode> typeParams, List<String> whereOrder) {
		super(pos, flags, annotations, returnType, name, formals, throwTypes,
				body, typeParams);
		this.whereOrder = whereOrder;
	}

	public ECMMethodDecl_c(Position pos, Flags flags,
			List<AnnotationElem> annotations, TypeNode returnType, Id name,
			List<Formal> formals, List<TypeNode> throwTypes, Block body,
			List<String> whereOrder) {
		super(pos, flags, annotations, returnType, name, formals, throwTypes,
				body);
		this.whereOrder = whereOrder;
	}

	public List<WhereConstraint> getConstraintList() {
		List<WhereConstraint> ret = new LinkedList<WhereConstraint>();
		for (String relation : whereOrder) {
			String[] two = relation.split("<:");
			assert two.length == 2;
			ret.add(new WhereConstraint(two[0], two[1]));
		}
		return ret;
	}
}
