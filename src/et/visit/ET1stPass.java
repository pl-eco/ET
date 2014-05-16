package et.visit;

import java.util.List;
import java.util.Stack;

import cs.data.ConstraintContainer;
import cs.data.constraint.CallConstraint;
import cs.data.constraint.FlowConstraint;
import cs.data.id.ID;
import cs.data.id.InstID;
import cs.data.id.LocalID;
import cs.data.id.SpecialID;
import cs.data.id.StaticID;
import cs.data.id.VariableGenerator;
import cs.data.reflect.ReflectionHandler;
import cs.data.thread.ThreadHandler;
import cs.types.CSNonGenericType;
import cs.types.CSObjectType;
import cs.util.CSUtil;
import cs.util.EasyDebugger;
import cs.visit.CS1stPass;
import polyglot.ast.Assign;
import polyglot.ast.Call;
import polyglot.ast.Call_c;
import polyglot.ast.Cast;
import polyglot.ast.ClassDecl;
import polyglot.ast.Conditional;
import polyglot.ast.ConstructorCall;
import polyglot.ast.Expr;
import polyglot.ast.Field;
import polyglot.ast.Local;
import polyglot.ast.LocalDecl;
import polyglot.ast.MethodDecl;
import polyglot.ast.New;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Return;
import et.ast.Adapt_c;
import et.ast.Attribute_c;
import et.ast.ECMClassDecl_c;
import et.ast.ECMMethodDecl_c;
import et.ast.ETField_c;
import et.ast.ETLocal_c;
import et.ast.MPattern;
import et.ast.MPatternApp;
import et.ast.MPattern_Init_c;
import et.ast.MPtnAppID;
import et.ast.Reconstruct_c;
import et.ast.UsingBlock_c;
import et.ast.Using_c;
import et.data.AdaptID;
import et.data.AttributeID;
import et.data.ReconstructID;
import et.data.constraint.UsingBlockConstraint;
import et.data.constraint.UsingBlockConstraintContainer;
import et.data.constraint.WhereConstraint;
import et.types.ETTYPE;
import et.types.etTypeSystem_c;
import polyglot.ext.jl5.types.JL5MethodInstance;
import polyglot.ext.jl5.types.JL5ParsedClassType_c;
import polyglot.frontend.Job;
import polyglot.types.ArrayType;
import polyglot.types.ClassType;
import polyglot.types.Context_c;
import polyglot.types.MethodInstance;
import polyglot.types.ProcedureInstance;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.visit.NodeVisitor;

public class ET1stPass extends CS1stPass {

	static Stack<UsingBlockConstraintContainer> usingStack
		= new Stack<UsingBlockConstraintContainer>();
	ConstraintContainer wholeSetOriginal = wholeSet;
	
	public ET1stPass(Job job, TypeSystem ts, NodeFactory nf) {
		super(job, ts, nf);
	}

	@Override
	protected NodeVisitor enterCall(Node parent, Node n)
			throws SemanticException {
		final NodeVisitor m = super.enterCall(parent, n);
		if (n instanceof UsingBlock_c) {
			ID id = CSUtil.getID(((Using_c) parent).getExpr().type());
			UsingBlockConstraintContainer container
				= new UsingBlockConstraintContainer(id, ((UsingBlock_c)n).getType());
			usingStack.push(container);
			super.wholeSet = container;
		}
		return m;
	}
	
	@Override
	public Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		final Node m = super.leaveCall(parent, old, n, v);
			
		if (m instanceof Adapt_c) {
			Adapt_c adapt = (Adapt_c) m;
			ID adaptee = CSUtil.getID(adapt.getExpr().type());

			/*
			 * ((adapt)c).m();
			 * 
			 * ((adapt[xx])c).m();
			 */
			// set adapt ID to type
			AdaptID adaptID = new AdaptID(adapt.toString(), "to", adapt
					.position().toString(), adaptee);

			CSUtil.setID(adapt, adaptID);
		} else if (m instanceof Attribute_c) {
			Attribute_c att = (Attribute_c) m;
			ID exprID = CSUtil.getID(att.getExpr().type());

			AttributeID attID = new AttributeID(m.toString(), m.position()
					.toString(), exprID);

			CSUtil.setID(att, attID);
		} else if (m instanceof Reconstruct_c) {
			Reconstruct_c recon = (Reconstruct_c) m;
			ID exprID = CSUtil.getID(recon.getExpr().type());
			ReconstructID reconID = new ReconstructID(m.toString(), m
					.position().toString(), exprID);

			CSUtil.setID(recon, reconID);
		} else if (m instanceof MPatternApp) {
			MPatternApp app = (MPatternApp) m;
			ID exprID = CSUtil.getID(app.getExpr().type());
			MPtnAppID mptnAppID = new MPtnAppID(m.toString(), m.position()
					.toString(), exprID);

			CSUtil.setID(app, mptnAppID);
		} else if (m instanceof MPattern_Init_c) {
			String var = VariableGenerator.nextAlias();
			LocalID id = new LocalID(var, "mpattern" + var, var + "pos");
			CSUtil.setID((Expr) m, id);
		} else if (m instanceof ECMMethodDecl_c) {
			ECMMethodDecl_c mDecl = (ECMMethodDecl_c) m;

			// add "where" statement to constraint set
			for (WhereConstraint cons : mDecl.getConstraintList()) {
				wholeSet.addConstraint(cons, (Context_c) context);
			}
		} else if (m instanceof UsingBlock_c) {
			UsingBlockConstraintContainer ubcc = usingStack.pop();
			if (usingStack.empty()) {
				wholeSet = wholeSetOriginal;
				wholeSet.addConstraint(ubcc.getUsingBlockConstraint(), (Context_c) context);
			} else {
				wholeSet = usingStack.peek();
				wholeSet.addConstraint(ubcc.getUsingBlockConstraint(), (Context_c) context);
			}
		}
		return m;
	}
}
