package et.ast;

/*
 * This is a type node representing the mpattern type
 */

import cs.ast.CSCanonicalTypeNode_c;
import cs.types.CSNonGenericType;
import cs.types.csTypeSystem_c;
import et.types.etTypeSystem_c;
import et.util.Names;
import polyglot.ast.Ambiguous;
import polyglot.ast.Node;
import polyglot.ast.TypeNode;
import polyglot.ast.TypeNode_c;
import polyglot.types.PrimitiveType;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.ClassType;
import polyglot.util.CodeWriter;
import polyglot.util.Position;
import polyglot.visit.AmbiguityRemover;
import polyglot.visit.NodeVisitor;
import polyglot.visit.PrettyPrinter;
import polyglot.visit.TypeChecker;

public class MPattern extends TypeNode_c {
	private TypeNode node;

	public MPattern(Position pos, TypeNode node) {
		super(pos);
		this.node = node;
	}

	public TypeNode getInnerNode() {
		return node;
	}

	protected MPattern reconstruct(TypeNode node) {
		if (node != this.node) {
			MPattern n = (MPattern) copy();
			n.node = node;
			return n;
		}
		return this;
	}

	@Override
	public void prettyPrint(CodeWriter w, PrettyPrinter tr) {
		// mpattern<type> --> $%TYPE%_PATTERN
		w.write(Names.MPTN_CLASS_NAME);
		w.write("<" + node.type().toString() + ">");
	}

	public Node buildTypes(polyglot.visit.TypeBuilder tb)
			throws SemanticException {
		TypeNode node = (TypeNode) super.buildTypes(tb);

		Type type = ((etTypeSystem_c) tb.typeSystem()).createDefaultObjectType(
				tb.typeSystem().unknownType(node.position()), "mpattern");
		return node.type(type);
	}

	public Node visitChildren(NodeVisitor v) {
		TypeNode node = (TypeNode) visitChild(this.node, v);
		return reconstruct(node);
	}

	public Node disambiguate(AmbiguityRemover ar) throws SemanticException {
		((CSNonGenericType) this.type()).setType(this.node.type());

		return this.type(this.type());
	}

	@Override
	public Node typeCheck(TypeChecker tc) throws SemanticException {
		Node ret = super.typeCheck(tc);
		String extendFrom = null;
		if(this.node.type() instanceof PrimitiveType){
			extendFrom = (node.type()).toString();
		}
		else{
			extendFrom = ((ClassType) this.node.type()).fullName();
		}
		ECMClassDecl_c.addMPatternClassToClass(extendFrom);

		return ret;
	}

	@Override
	public boolean isDisambiguated() {
		return !(this instanceof Ambiguous) && type != null
				&& node.type().isCanonical();
	}
}
