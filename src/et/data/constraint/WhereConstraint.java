package et.data.constraint;

import cs.data.constraint.Constraint;
import cs.graph.CSGraph;
import cs.graph.GraphBuilder;
import cs.linearsolver.ValueHolder;
import cs.linearsolver.CPlexWrapper.Operator;
import cs.visit.AnalysisContext;
import et.linersolve.ETCplexSolver;

/*
 * The constraint representing "where" statement in method header
 */
public class WhereConstraint implements Constraint, GraphBuilder {
	private String less;
	private String greater;

	public WhereConstraint(String less, String greater) {
		this.less = less;
		this.greater = greater;
	}

	@Override
	public Constraint refresh(AnalysisContext context) {
		// if starts with ? or !, should be refreshed since it is still a
		// variable. Otherwise, it is a constant value and doesn't need to be
		// refreshed
		String l = less.startsWith("?") || less.startsWith("!") ? context
				.refreshID(less.substring(1, less.length())) : less;
		String g = greater.startsWith("?") || greater.startsWith("!") ? context
				.refreshID(greater.substring(1, greater.length())) : greater;
		return new WhereConstraint(l, g);
	}

	@Override
	public String toString(ValueHolder vh) {
		return less + " <: " + greater;
	}

	public void addEquations(ETCplexSolver solver) {
		solver.addEquation(less, Operator.LE, greater);
	}

	@Override
	public void buildGraph(CSGraph graph) {
		this.addEquations((ETCplexSolver) graph.getCPlexSolver());
	}
}
