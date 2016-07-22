package org.de.tum.ei.eda.esl.graphRewriter.isomorphism;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon.JungNodestoPatternNE;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.util.Pair;

public class VF2State implements State{
	
	private Graph<EObject, EClass> source;
	
	private Graph<EObject, EClass> target;
	
	private ArrayList<Pair<EObject>> candidates;
	private ArrayList<EObject> sourcePath;
	private ArrayList<EObject> targetPath;
	
	private EObject startNode;
	
	private Map<EObject, PatternNE> eobjectToPatternNE;
	public Map<EObject, Set<EObject>> matchedNodeCandidates;
	
	// Map between source nodes to target nodes
	private Map<EObject, EObject> map;
	
	public VF2State(Graph<EObject, EClass> source, Graph<EObject, EClass> target)
	{
		this.map = new HashMap(); 
	
		this.sourcePath = new ArrayList<EObject>();
		this.targetPath = new ArrayList<EObject>();
		
		this.candidates = new ArrayList<Pair<EObject>>();
		this.source = source;
		this.target = target;
	
		JungNodestoPatternNE jungNodestoPatternNE = new JungNodestoPatternNE();
		this.eobjectToPatternNE = jungNodestoPatternNE.transformToPatterNE(target);
		this.matchedNodeCandidates = getIndividualNodeMatches(); 
		if(matchedNodeCandidates == null){
			return;
		}

		/*
		 * Generate candidates for initial match
		 */
		loadRootCandidates();
	}
	
	private Map<EObject, Set<EObject>> getIndividualNodeMatches() {
		Map<EObject, Set<EObject>> matchedNodeCandidates = new HashMap<EObject, Set<EObject>>();
		for(EObject t: target.getVertices()){
			Set<EObject> matchedNodes = new HashSet<EObject>();
			matchedNodeCandidates.put(t, matchedNodes);
			
			for(EObject s:source.getVertices()){
				if(matchNodeContent(s,t))
					matchedNodes.add(s);
			}
			
			if(matchedNodes.isEmpty()) {
				System.err.println("Pattern node cannot be matched! " + t);
				return null;
			}
		}
		return matchedNodeCandidates;
	}

private boolean matchNodeContent(EObject snode, EObject tnode) {
		
		if(source.getNeighborCount(snode) != target.getNeighborCount(tnode))
			return false;
		if(tnode instanceof ComponentInstanceType && snode instanceof ComponentInstanceType){
			tnode = (ComponentInstanceType) tnode;
		}
		else if(tnode instanceof BusInterfaceType && snode instanceof BusInterfaceType){
			tnode = (BusInterfaceType) tnode;
		}
		else if (tnode instanceof EClass && snode instanceof EClass){
			tnode = (EClass) tnode;
		}
		else if (tnode instanceof InternalPortReferenceType && snode instanceof InternalPortReferenceType){
			tnode = (InternalPortReferenceType) tnode;
		}
		else if(tnode instanceof ExternalPortReferenceType && snode instanceof ExternalPortReferenceType){
			tnode = (ExternalPortReferenceType) tnode;
		}
		else
			return false;
		/*
		 * Both nodes are of the same type, so we can safely compare these nodes
		 */
		PatternNE patternNode = eobjectToPatternNE.get(tnode);
		if(patternNode != null)
		{
			if(patternNode.match(snode)){
				return true;
			}
		}
		
		return false;
	}

	private void loadRootCandidates() {
		int size = 0;
		EObject stNode;
		for(EObject t: target.getVertices()){
			Set<EObject> matchedNodes = matchedNodeCandidates.get(t);
			size = 0;
			if(matchedNodes.size() == 1)
			{
				for(EObject nbr: target.getNeighbors(t)){
					size += matchedNodeCandidates.get(nbr).size();
					if(matchedNodeCandidates.get(nbr).size() != 1){
						break;
					}
				}
				if(size == target.getNeighborCount(t))
				{	
					Pair<EObject> pair = new Pair(matchedNodes.iterator().next(),t);
					candidates.add(pair);
					startNode = t;
					return;
				}
					
			}
		}
		
		for(EObject s: source.getVertices()){
		for(EObject t: target.getVertices()){
			Pair<EObject> pair = new Pair(s,t);
			candidates.add(pair);
		}
	}

	}
	
	public VF2State(VF2State state, Pair<EObject> pair){
		candidates = new ArrayList<Pair<EObject>>();
		this.sourcePath = new ArrayList<EObject>(state.sourcePath);
		this.targetPath = new ArrayList<EObject>(state.targetPath);
		
		this.map = state.map;
		this.source = state.source;
		this.target = state.target;
		
		
		// Add newpair to the current state
		map.put(pair.getFirst(), pair.getSecond());
		sourcePath.add(pair.getFirst());
		targetPath.add(pair.getSecond());
		this.matchedNodeCandidates = state.matchedNodeCandidates;
		this.eobjectToPatternNE = state.eobjectToPatternNE;
		/*
		 * Generate candidates, given the current match
		 */
		loadCandidates(pair);
		
	}

	private void loadCandidates(Pair<EObject> lastPair) {
		for(EObject sb: source.getNeighbors(lastPair.getFirst())){
			for(EObject tb: target.getNeighbors(lastPair.getSecond())){
				
				Pair<EObject> pair = new Pair(sb,tb);
				
				if(candidateFeasible(pair))
				{
					candidates.add(pair);
				}
			}
		}
		
	}
	
	private boolean candidateFeasible(Pair<EObject> pair) {		
		for(EObject snode: map.keySet())
		{
			if(snode.equals(pair.getFirst()) || map.get(snode).equals(pair.getSecond())){
				return false;
			}
		}
		return true;
	}

	public Graph getGraph1() {
		return source;
	}

	public Graph getGraph2() {
		return target;
	}

	public boolean checkIndividualMatch(){
		if(this.matchedNodeCandidates == null)
			return false;
		return true;
	}
	
	/*
	 * @gmc: check for errors
	 * @see org.de.tum.ei.eda.esl.graphRewriter.isomorphism.State#getVetexMapping()
	 */
	public Map getVetexMapping() {
		return new HashMap(map);
	}
	
	/*
	 * 	(non-Javadoc)
	 * @see org.de.tum.ei.eda.esl.graphRewriter.isomorphism.State#backtrack()
	 */
	public boolean backtrack() {
		if(sourcePath.isEmpty() || isGoal())
		{
			map.clear();
			return true;
		}
		
		if(isHeadMapped())
		{
			return true;
		}
		

		EObject last = targetPath.get(targetPath.size()-1);
	
		if(matchedNodeCandidates.get(last).size() == 1)
		{
			return false;
		}
		
		map.clear();
		
		for(int i = 0; i<sourcePath.size() -1 ; i++)
		{
			map.put(sourcePath.get(i), targetPath.get(i));
		}
		
		return true;
	}
	
	private boolean isHeadMapped() {
		// TODO complete but check and understand more
		
		EObject head = sourcePath.get(sourcePath.size() - 1);
		
		for(EObject neighbor: source.getNeighbors(head))
		{
			if(!map.containsKey(neighbor))
			{
				return false;
			}
		}
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.de.tum.ei.eda.esl.graphRewriter.isomorphism.State#isFeasiblePair(edu.uci.ics.jung.graph.util.Pair)
	 */
	public boolean isFeasiblePair(Pair<EObject> match) {
		
		if(map.containsKey(match.getFirst()) || map.containsValue(match.getSecond()))
		{
			return false;
		}
		Set<EObject> matchedNodes = matchedNodeCandidates.get(match.getSecond());
		
		if(!(matchedNodes.contains(match.getFirst())))
				return false;

		if(!immNbrMatch(match))
		{
			return false;
		}
		
		return true;
	}

	private boolean immNbrMatch(Pair<EObject> match) {
		boolean flag = false;
		for(EObject tb: target.getNeighbors(match.getSecond())){
			Set<EObject> matchedNodes = matchedNodeCandidates.get(tb);
			flag = false;
			for(EObject mnode: matchedNodes)
			{
				if(source.getNeighbors(match.getFirst()).contains(mnode)){
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				return false;
			}
		}
		
		return true;
	}

	/* 
	 * for node implementation matching
	 */
	private boolean matchNodeContent(Node snode, Node tnode) {
		String sn = snode.getName();
		String tn = tnode.getName();
		String classname = snode.eClass().getInstanceClassName();
		if( sn == tn)
			return true;
		
		
		return false;
	}
	
	public boolean isGoal() {
		if( source.getVertexCount() == map.size()){
			System.out.println(map.size());
			//System.out.println(map);
			return true;
		}
		return false;
	}

	public boolean isDead() {
		return source.getVertexCount() > target.getVertexCount();
	}

	public boolean hasNextCandidate() {
		return !candidates.isEmpty();
	}

	public Pair nextCandidate() {
		return candidates.remove(candidates.size() - 1);
	}

	public State nextState(Pair match) {
		return new VF2State(this, match);
	}
	
}
