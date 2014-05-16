package et.ast;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cs.types.CSNonGenericType;
import cs.types.CSObjectType;
import cs.types.csTypeSystem_c;
import cs.util.CSUtil;
import et.linersolve.ETValueHolder;
import et.types.ETTYPE;
import et.types.etTypeSystem_c;

import polyglot.ast.Expr;
import polyglot.ast.If_c;
import polyglot.ast.Node;
import polyglot.ast.Stmt;
import polyglot.ast.Stmt_c;
import polyglot.ast.Term;
import polyglot.ext.jl5.types.JL5ParsedClassType_c;
import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
import polyglot.util.ListUtil;
import polyglot.util.Position;
import polyglot.visit.CFGBuilder;
import polyglot.visit.NodeVisitor;
import polyglot.visit.TypeChecker;

public class Using_c extends Stmt_c {
	protected Expr obj;
	protected UsingBlock_c consequent;
	protected UsingBlock_c alternative;
	
	public Using_c(Position pos, Expr obj, UsingBlock_c consequent, UsingBlock_c alternative) {
		super(pos);
		this.obj = obj;
		this.consequent = consequent;
		this.alternative = alternative;
	}

	public UsingBlock_c consequent() {
		return consequent;
	}

	public UsingBlock_c alternative() {
		return alternative;
	}
	
	public Expr getExpr() {
		return obj;
	}
	
    /** Reconstruct the statement. */
    protected Using_c reconstruct(Expr obj, UsingBlock_c consequent, UsingBlock_c alternative) {
        if (obj != this.obj || consequent != this.consequent
                || alternative != this.alternative) {
            Using_c n = (Using_c) copy();
            n.obj = obj;
            n.consequent = consequent;
            n.alternative = alternative;
            return n;
        }
        return this;
    }

    /** Visit the children of the statement. */
    @Override
    public Node visitChildren(NodeVisitor v) {
    	Node obj = visitChild(this.obj, v);
    	Node consequent = visitChild(this.consequent, v);
    	Node alternative = visitChild(this.alternative, v);
    	return reconstruct((Expr) obj, (UsingBlock_c) consequent, (UsingBlock_c) alternative);
    }
	
	@Override
	public Term firstChild() {
		return obj;
	}

	public Node typeCheck(TypeChecker tc) throws SemanticException {

		ETValueHolder vh = (ETValueHolder) ((csTypeSystem_c) tc.typeSystem()).getValueHolder();
		if (!vh.isDynamicValue(((CSObjectType) obj.type()).getAliasName(), ETTYPE.MODE))
			throw new SemanticException("Using argument must be dynamic", obj.position());
		return this;
	}

	@Override
	public <T> List<T> acceptCFG(CFGBuilder<?> v, List<T> succs) {
		//not sure
		v.visitCFG(consequent, this, EXIT);
		if (alternative != null)
			v.visitCFG(alternative, this, EXIT);
		return succs;
	}
}
