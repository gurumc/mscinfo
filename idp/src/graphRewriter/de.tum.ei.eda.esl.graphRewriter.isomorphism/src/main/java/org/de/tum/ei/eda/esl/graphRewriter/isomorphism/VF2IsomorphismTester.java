package org.de.tum.ei.eda.esl.graphRewriter.isomorphism;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.util.Pair;

public class VF2IsomorphismTester implements IsomorphismTester{

	private ArrayList<Map<EObject, EObject>> maps;

	
	public VF2IsomorphismTester()
	{
		maps = new ArrayList<Map<EObject,EObject>>();
	}
	/*
	 * Creates empty state (corresponding to VF2)
	 */
	public boolean areIsomorphic(Graph<EObject,EClass> g1, Graph<EObject, EClass> g2) {
		
		State state = new VF2State(g1,g2);
		
		if(!state.checkIndividualMatch())
		{
			System.out.println("VF2: Individual nodes cann't be matched");
			return false;
		}
		
		maps.clear();
		
		match(state);
		
		/* If all the nodes are mapped, then return true */
		if(!maps.isEmpty()){
			if(maps.get(0).size() == g1.getVertexCount()) 
			return true;
		}
		
		return false;
	}

	/*
	 * VF2 algorithm core
	 * Returns true if the graphs are isomorphic
	 */
	@SuppressWarnings("unchecked")
	private boolean match(State s) {
		if(s.isGoal())
		{
			maps.add(s.getVetexMapping());
			return true;
		}
		if(s.isDead())
			return false;
	
		/*
		 * We select start node such that it is a unique node(it has only one matching node in the target graph) 
		 * and continue mapping of its neighbors. If unique node is not available then we chose a random start node.
		 * When nodes all neighbors are mapped, then we backtrack to the previous node
		 * else we remove the mapping and then backtrack  (Only if this node has another match)
		 */
	
		boolean found = false;

		while(!found && s.hasNextCandidate())
		{
			Pair<EObject> candidate = s.nextCandidate();

			if(s.isFeasiblePair(candidate)) {
				State nextState = s.nextState(candidate);

				found = match(nextState);

				if(nextState.backtrack()){
					//do nothing
				}
				else{
					return false;
				}
			}
		}
		return found;
	}
}
