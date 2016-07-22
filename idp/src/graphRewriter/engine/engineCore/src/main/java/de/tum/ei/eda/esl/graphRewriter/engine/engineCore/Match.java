package de.tum.ei.eda.esl.graphRewriter.engine.engineCore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import edu.uci.ics.jung.graph.Graph;


public class Match<V, E> {
	private Map<PatternNE, V> matchedNodes = new HashMap<PatternNE, V>();
	private Map<PatternNE, E> matchedEdges = new HashMap<PatternNE, E>();
	private Map<PatternNE, V> getMatchedNodes() {
		return matchedNodes;
	}
	//gmc:change from private to public
	public Map<PatternNE, E> getMatchedEdges() {
		return matchedEdges;
	}
	
	public void addMatchingNodes(Map<PatternNE, V> matchNodes) {
		this.matchedNodes.putAll(matchNodes);
	}
	
	public void addMatchingEdges(Map<PatternNE, E> matchEdges) {
		this.matchedEdges.putAll(matchEdges);
	}
	
	public void addMatchingNode(PatternNE patternNode, V hostNode) {
		this.matchedNodes.put(patternNode, hostNode);
	}
	
	public void addMatchingEdge(PatternNE patternEdge, E hostEdge) {
		this.matchedEdges.put(patternEdge, hostEdge);
	}
	
	public void addAllMatching(Match<V, E> match) {
		this.matchedNodes.putAll(match.getMatchedNodes());
		this.matchedEdges.putAll(match.getMatchedEdges());
	}
	
	public V getMatchedNode(PatternNE patternNode) {
		if(this.matchedNodes.containsKey(patternNode)) {
			return this.matchedNodes.get(patternNode);
		} else {
			System.err.println("pattern element "+patternNode+" is not found in the Node matching function !!!");
			return null;
		}
	}
	
	public E getMatchedEdge(PatternNE patternEdge) {
		if(this.matchedEdges.containsKey(patternEdge)) {
			return this.matchedEdges.get(patternEdge);
		} else {
			System.err.println("pattern element "+patternEdge+" is not found in the Edge matching function !!!");
			return null;
		}
	}
	
	public boolean containsPatternNode(PatternNE patternNode) {
		return this.matchedNodes.containsKey(patternNode);
	}
	
	public boolean containsPatternEdge(PatternNE patternEdge) {
		return this.matchedEdges.containsKey(patternEdge);
	}
	
	public boolean containsHostNode(V hostNode) {
		return this.matchedNodes.containsValue(hostNode);
	}
	
	public boolean containsHostEdge(E hostEdge) {
		return this.matchedEdges.containsValue(hostEdge);
	}
	
	public void printMatch() {
		for(Iterator<PatternNE> it = this.matchedEdges.keySet().iterator(); it.hasNext(); ) {
			PatternNE key = it.next();
			System.out.println(key.getIdent()+" is matched to "+this.matchedEdges.get(key));
		}
		for(Iterator<PatternNE> it = this.matchedNodes.keySet().iterator(); it.hasNext(); ) {
			PatternNE key = it.next();
			System.out.println(key.getIdent()+" is matched to "+this.matchedNodes.get(key));
		}
	}
	
	public boolean testMatchedLhs(Graph<PatternNE, PatternNE> lhs) {
		boolean pass = true;
		for(Iterator<PatternNE> it=lhs.getVertices().iterator(); it.hasNext();) {
			PatternNE node = it.next();
			if(!containsPatternNode(node)) {
				pass = false;
				System.out.println("node missing: "+node.getIdent());
			}
		}
		for(Iterator<PatternNE> it=lhs.getEdges().iterator(); it.hasNext();) {
			PatternNE edge = it.next();
			if(!containsPatternEdge(edge)) {
				pass = false;
				System.out.println("edge missing: "+edge.getIdent());
				System.out.println("connecting "+lhs.getEndpoints(edge).getFirst().getIdent()+
						" and "+lhs.getEndpoints(edge).getSecond().getIdent());
			}
		}
		if(pass == false) {
			System.out.println("match test fail !");
		}
		return pass;
	}
}