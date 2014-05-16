package et.parse;

import java.util.Map;

import cs.ast.csNodeFactory_c;
import cs.linearsolver.CSTYPE;
import et.types.ETTYPE;
import polyglot.ast.Id;
import polyglot.ast.NodeFactory;
import polyglot.ast.TypeNode;
import polyglot.ext.jl5.parse.JL5Name;
import polyglot.parse.Name;
import polyglot.types.TypeSystem;
import polyglot.util.Position;

public class ETName extends JL5Name {
	private Map<ETTYPE, ?> typeValues;

	public ETName(NodeFactory nf, TypeSystem ts, Position pos, Id name,
			Map<ETTYPE, ?> typeValues) {
		this(nf, ts, pos, null, name, typeValues);
	}

	public ETName(NodeFactory nf, TypeSystem ts, Position pos, Name prefix,
			Id name, Map<ETTYPE, ?> typeValues) {
		super(nf, ts, pos, prefix, name);
		assert typeValues != null;
		this.typeValues = typeValues;
	}

	// type
	public TypeNode toType() {
		if (prefix == null) {
			return ((csNodeFactory_c) nf).AmbTypeNode(pos, null, name,
					typeValues);
		}
		return ((csNodeFactory_c) nf).AmbTypeNode(pos, prefix.toQualifier(),
				name, typeValues);
	}
}
