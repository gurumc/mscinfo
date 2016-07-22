package org.de.tum.ei.eda.esl.graphRewriter.isomorphism;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.util.Pair;

public interface State {

	Graph getGraph1();

	Graph getGraph2();

	/*
	 * returns true if another candidate match can be found 
	 * or false otherwise
	 */
	boolean hasNextCandidate();

	/*
	 * Returns next candidates
	 */
	@SuppressWarnings("rawtypes")
	Pair nextCandidate();

	/*
	 * Return true if mapping node1 to node2 would preserve the isomorphism between
	 * the graphs
	 */
	@SuppressWarnings("rawtypes")
	boolean isFeasiblePair(Pair<EObject> pair);

	/*
	 * Returns true if the all vertices have been mapped. Similarly
	 * return true if the graphs are isomorphic 
	 */
	boolean isGoal();

	/*
	 * Returns true if the current state of mapping cannot proceed because
	 * some invalid mapping has occurred and no further pairs would result 
	 * in an isomorphic match 
	 */
	boolean isDead();

	/*
	 * Returns a state after adding the match to current mappings
	 */
	State nextState(Pair<EObject> match);
	/*
	 * Returns map of current vertex map
	 */
	Map<EObject, EObject> getVetexMapping();

	/*
	 * Undo the mapping added in the prior call to nextState
	 * If the node added has different node match then we can remove the pair from node mapping
	 */
	boolean backtrack();

	/*
	 * Checks if we can find a match of vertices between source and target
	 * else we can avoid running the algorithm
	 */
	public boolean checkIndividualMatch();
}
