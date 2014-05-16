package et.data.constraint;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import polyglot.ast.Expr;
import polyglot.lex.Identifier;
import polyglot.parse.Name;
import polyglot.types.SemanticException;
import cs.data.constraint.CallConstraint;
import cs.data.constraint.Constraint;
import cs.data.constraint.FlowConstraint;
import cs.data.id.ID;
import cs.data.id.VariableGenerator;
import cs.graph.CSGraph;
import cs.graph.GraphBuilder;
import cs.graph.GraphElement;
import cs.linearsolver.ValueHolder;
import cs.linearsolver.CPlexWrapper.Operator;
import cs.types.csTypeSystem_c;
import cs.util.CSUtil;
import cs.visit.AnalysisContext;
import et.ETValue;
import et.ast.UsingBlock_c;
import et.linersolve.ETCplexSolver;
import et.linersolve.ETValueHolder;
import et.types.ETTYPE;

/*
 * The constraint representing "using" blocks
 */
public class UsingBlockConstraint implements Constraint, GraphBuilder {
	private LinkedList<Constraint> constraints = new LinkedList<Constraint>();
	private ID objID, contextID;
	private UsingBlock_c.Type type;
	
	public UsingBlockConstraint(ID objID, UsingBlock_c.Type type) {
		this.objID = objID;
		this.type = type;
	}
	
	public void addConstraint(Constraint cons) {
		constraints.add(cons);
	}
	
	private void replaceUniqueID(ID id, UsingBlock_c.Type type) {
		if (type == UsingBlock_c.Type.THEN) {
			id.replaceUniqueID(id.uniqueID() + "then");
		} else {
			id.replaceUniqueID(id.uniqueID() + "else");
		}
	}
	
	private Constraint replace(ID id, UsingBlock_c.Type type, AnalysisContext ac) {
		UsingBlockConstraint ubc = new UsingBlockConstraint(this.objID, this.type);
		for (Constraint c : constraints) {
			c = c.refresh(ac);
			if (c instanceof FlowConstraint) {
				ID fromID = ((FlowConstraint) c).getFrom();
				ID toID = ((FlowConstraint) c).getTo();
				if (fromID.uniqueID().equals(id.uniqueID())) {
					replaceUniqueID(fromID, type);
				}
				if (toID.uniqueID().equals(id.uniqueID())) {
					replaceUniqueID(fromID, type);
				}
				ubc.addConstraint(c);
			} else if (c instanceof CallConstraint) {
				ID targetID = ((CallConstraint) c).target();
				if (targetID.uniqueID().equals(id.uniqueID())) {
					replaceUniqueID(targetID, type);
				}
				LinkedList<ID> argumentIDs = (LinkedList<ID>) ((CallConstraint) c).arguments();
				for (ID argumentID : argumentIDs) {
					if (argumentID.uniqueID().equals(id.uniqueID())) {
						replaceUniqueID(targetID, type);
					}
				}
				ubc.addConstraint(c);
			} else if (c instanceof UsingBlockConstraint) {
				ubc.addConstraint(((UsingBlockConstraint)c).replace(id, type, ac));
			}
		}
		return ubc;
	}
	
	@Override
	public Constraint refresh(AnalysisContext ac) {
		ETValueHolder vh = (ETValueHolder) ac.getValueHolder();
		Map<ETTYPE,String> map = new TreeMap<ETTYPE,String>();
		//vh.bindTypeValueToAlias(CSUtil.getAliasName(id.uniqueID()+"then"), map);
		objID = objID.refresh(ac);
		contextID = ac.getInstID();
		return replace(objID, type, ac);
	}

	@Override
	public String toString(ValueHolder vh) {
		String str = "Using (" + objID.getVarName() + ")"
				+ (type == UsingBlock_c.Type.THEN ? " THEN" : " ELSE");
		str += " " + constraints.size() + " statement(s)";
		for (Constraint cons : constraints)
			str += "\n" + cons.toString(vh);
		return str;
	}
	
	public void addEquations(ETCplexSolver solver) {
		ValueHolder valueHolder = solver.getValueHolder();
		String obj = ((ETValueHolder) valueHolder).createETValue((GraphElement) objID).getMode();
		String context = "Main";
		if (contextID != null) {
			//Problem
			context = ((ETValueHolder) valueHolder).createETValue((GraphElement) contextID).getMode();
		}
		solver.addEquation(obj, (type == UsingBlock_c.Type.THEN ? Operator.LE : Operator.GE), context);
	}

	@Override
	public void buildGraph(CSGraph graph) {
		this.addEquations((ETCplexSolver) graph.getCPlexSolver());
		for (Constraint c : constraints) {
			if (c instanceof FlowConstraint) {
				((FlowConstraint) c).buildGraph(graph);
			} else if (c instanceof CallConstraint) {
				((CallConstraint) c).buildGraph(graph);
			} else if (c instanceof UsingBlockConstraint) {
				((UsingBlockConstraint) c).buildGraph(graph);
			}
		}
	}

}
