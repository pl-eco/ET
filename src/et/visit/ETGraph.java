package et.visit;

import cs.graph.CSSimpleGraph;
import et.data.constraint.UsingBlockConstraint;
import et.data.constraint.WhereConstraint;
import et.linersolve.ETCplexSolver;
import et.types.etTypeSystem_c;

public class ETGraph extends CSSimpleGraph {

	public ETGraph(etTypeSystem_c ts) {
		super(ts);
	}

	public void addUsingBlockConstraint(UsingBlockConstraint using){
		using.addEquations((ETCplexSolver) this.cplex);
	}
}
