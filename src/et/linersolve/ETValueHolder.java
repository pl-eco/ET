package et.linersolve;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import cs.data.id.InstID;
import cs.graph.CSGraph;
import cs.graph.GraphElement;
import cs.linearsolver.ValueHolder;
import cs.util.CSUtil;
import cs.util.EasyDebugger;
import cs.visit.AnalysisContext;
import et.ETValue;
import et.ast.ModesDecl;
import et.ast.PhasesDecl;
import et.types.ETTYPE;
import et.types.EnergyFlags;

public class ETValueHolder extends ValueHolder<ETTYPE, String> {

	// key: uniqueID value: context of the given uniqueID
	protected Map<String, String> contextFinder = new HashMap<String, String>();
	protected Map<String, Set<String>> idToAlias = new HashMap<String, Set<String>>();

	public void setContext(String uniqueID, String context) {
		contextFinder.put(uniqueID, context);

		// record id to alias name mapping
		String callee = CSUtil.getAliasName(uniqueID);
		if (!idToAlias.containsKey(callee)) {
			idToAlias.put(callee, new TreeSet<String>());
		}
		idToAlias.get(callee).add(uniqueID);

		String caller = CSUtil.getAliasName(context);
		if (!idToAlias.containsKey(caller)) {
			idToAlias.put(caller, new TreeSet<String>());
		}
		idToAlias.get(caller).add(context);
	}

	public Set<String> getUniqueIDs(String alias) {
		assert idToAlias.containsKey(alias):"cannot find " + alias + " in id to alias mapping"; 
		return idToAlias.get(alias);
	}

	public String getContext(String uniqueID) {
		if (!contextFinder.containsKey(uniqueID)) {
			EasyDebugger.exit("cannot find context of " + uniqueID);
			return null;
		}
		return contextFinder.get(uniqueID);
	}

	/*
	 * this method look up both the pre-set value and solved result and return
	 * the value. The value should also be converted to the string
	 * representative
	 * 
	 * Note: because there can be "adapt" applied in flows, so trace back to the
	 * instance of the given ID is a must
	 */
	public int getFinalResult(String uniqueID, ETTYPE type, CSGraph graph) {
		if (!AnalysisContext.isRootContext(uniqueID)) {
			List<InstID> instList = graph.getInstance(uniqueID);
			if (instList.size() == 0) {
				EasyDebugger
						.debug("The given id "
								+ uniqueID
								+ " doesn't have any instance bind to it. The result cannot be retrieved.");
				return 0;
			} else {
				uniqueID = instList.get(0).uniqueID();
			}
		}
		int value = 0;
		if (cplexResult.containsKey(uniqueID + type)) {
			value = cplexResult.get(uniqueID + type);
			return value;
		} else if (aliasToTypeValueMap.containsKey(CSUtil
				.getAliasName(uniqueID))) {
			String ret = aliasToTypeValueMap.get(CSUtil.getAliasName(uniqueID))
					.get(type);
			assert ret != null;
			return this.cplexResult.get(ret);
		} else {
			EasyDebugger.exit("cannot find the value");
			return 0;
		}
	}

	private String convertIntToString(int value, ETTYPE type) {
		assert false;
		return null;
	}

	public ETValue createETValue(GraphElement elmt) {
		String var = elmt.uniqueID();

		String mode = getAliasTypeValue(elmt.uniqueID(), ETTYPE.MODE);
		if (mode == null || mode.equals(EnergyFlags.ANONYMOUS)) {
			mode = var + ETTYPE.MODE;
		} else if (mode.startsWith("?") || mode.startsWith("!")) {
			// static or dynamic variable type
			// replace the variable
			if (elmt.uniqueID().lastIndexOf("|") == -1)
				mode = mode.substring(1, mode.length());
			else
				mode = elmt.uniqueID().substring(0,
						elmt.uniqueID().lastIndexOf("|") + 1)
						+ mode.substring(1, mode.length());
		}

		String phase = getAliasTypeValue(elmt.uniqueID(), ETTYPE.PHASE);
		if (phase == null)
			phase = var + ETTYPE.PHASE;

		return new ETValue(var, mode, phase);
	}

	@Override
	// print the type info by the given aliasName
	public String printValue(GraphElement elmt) {
		StringBuilder sb = new StringBuilder("");

		String value = null;
		for (ETTYPE type : ETTYPE.values()) {
			if ((value = getAliasTypeValue(elmt.uniqueID(), type)) != null) {
				sb.append(type).append(": ").append(value).append(" ");
			}
		}

		return sb.toString();
	}

	@Override
	protected boolean compatible(String objModifier, String classModifier) {
		return objModifier.equals(classModifier);
	}

	public boolean isDynamicValue(String alias, ETTYPE type) {
		Map<ETTYPE, String> map = aliasToTypeValueMap.get(alias);
		if (!map.containsKey(type) || !map.get(type).startsWith("?"))
			return false;
		return true;
	}

	// check if the value is declared, otherwise it is default value
	// dynamic value is considered default as well
	public boolean isDefaultValue(String alias, ETTYPE type) {
		Map<ETTYPE, String> map = aliasToTypeValueMap.get(alias);
		if (map.containsKey(type)) {
			String val = map.get(type);
			if (type.equals(ETTYPE.MODE) && ModesDecl.hasMode(val))
				return false;
			if (type.equals(ETTYPE.PHASE) && PhasesDecl.hasPhase(val))
				return false;
			return false;
		}
		return true;
	}

	// return the literal mode/phase value, such as "hifi", "lofi"
	// the input has to be the unrefreshed value
	public String getStringEquivalent(String alias, ETTYPE type,
			CSGraph graph) {
		String ret = null;

		String uniqueID = this.getUniqueIDs(alias).iterator().next();
		
		Set<String> set = null;
		if (type.equals(ETTYPE.PHASE)) {
			set = PhasesDecl.getPhases();
		} else if (type.equals(ETTYPE.MODE)) {
			set = ModesDecl.getModes();
		} else {
			EasyDebugger.exit("unknown ETTYPE. Have to terminate");
		}

		int val = getFinalResult(uniqueID, type, graph);
		for (String str : set) {
			if (val == this.cplexResult.get(str))
				return str;
		}
		EasyDebugger.debug("Cannot find the " + type + " equivalent for value "
				+ val);
		for (String str : set) {
			EasyDebugger.message(str + ": " + cplexResult.get(str));
		}
		EasyDebugger.exit("Have to terminate");
		return ret;
	}
}
