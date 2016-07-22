package de.tum.ei.eda.esl.graphRewriter.engine.engineCore;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.util.EdgeType;


public class GraphMatcher<V, E> {
	
	private Graph<PatternNE, PatternNE> lhs = null;
	private EdgeType lhsEdgeType = null;
	private Graph<V,E> hostGraph = null;
	private Set<Match<V, E>> matches = null;
	private Set<PatternNE> unmatchedNodes = null;
	private Set<PatternNE> matchedNodes = null;
	
	public Set<Match<V, E>> matchLHS(Graph<V,E> inputHostGraph, Rule rule) {
	
		this.matches = new HashSet<Match<V, E>>();
		this.hostGraph = inputHostGraph;
		this.lhs = rule.getGraphletLhs();
		this.unmatchedNodes = new HashSet<PatternNE>();
		this.matchedNodes = new HashSet<PatternNE>();
		this.lhsEdgeType = lhs.getDefaultEdgeType();
		for(Iterator<PatternNE> it = lhs.getEdges().iterator(); it.hasNext();){
			this.lhsEdgeType = lhs.getEdgeType(it.next());
			break;
		}
		this.lhsEdgeType = lhs.getEdgeType((PatternNE) lhs.getEdges().toArray()[0]);
		
		// get candidates for each pattern node
		long time = System.nanoTime();
		Map<PatternNE, Set<V>> matchedNodeCandidates = getIndividualNodeMatches(lhs, hostGraph);
		System.out.println(System.nanoTime() - time);
		if(matchedNodeCandidates == null) {
			return matches;
		}
		
		/**
		 *  pattern nodes are split into two sets: not match yet, matched but not all connected nodes are matched
		 *  if a node and its all connected nodes are matched, then this node is removed from sets because we do not care about it any more
		 *  the removal can save time on finding next pattern node and speed up the growing 
		 */		 
		unmatchedNodes.addAll(lhs.getVertices());		
		
		// start from the node with highest degree and keep growing
		PatternNE startNode = getStartPatternNode(lhs);
		for(Iterator<V> it=matchedNodeCandidates.get(startNode).iterator(); it.hasNext();) {
			V hostNode = it.next();
			Match<V, E> match = new Match<V, E>();
			match.addMatchingNode(startNode, hostNode);
			matches.add(match);
		}
		if(matches.isEmpty()) {
			System.out.println("start node: "+startNode);
			System.out.println("There exists no matching pattern in the host graph(start node match failed) !!!");
			return null;
		} else {
			// System.out.println("start node: "+startNode);
			matchedNodes.add(startNode);
			unmatchedNodes.remove(startNode);
		}
		
		// match the next pattern node
		Pair<PatternNE, PatternNE> nextPair = getNextPatternNode(lhs, matchedNodes, unmatchedNodes);
		while(nextPair != null) {
			
			PatternNE parentNode = nextPair.getLeft();
			PatternNE nextNode = nextPair.getRight();
			
			boolean matchFound = matchNextNodeAndEdges(parentNode, nextNode, matchedNodeCandidates);
			if(matchFound == false) {
				matches= new HashSet<Match<V, E>>() ;
				return matches;
			}
					
			nextPair = getNextPatternNode(lhs, matchedNodes, unmatchedNodes);
		}

		return matches;
	}
	
	private Map<PatternNE, Set<V>> getIndividualNodeMatches(Graph<PatternNE, PatternNE> lhs, Graph<V,E> hostGraph) {
		Map<PatternNE, Set<V>> matchedNodeCandidates = new HashMap<PatternNE, Set<V>>();
		
		for(Iterator<PatternNE> it = lhs.getVertices().iterator(); it.hasNext();) {
			PatternNE patternNode = it.next();
			Set<V> matchedNodes = new HashSet<V>();
			matchedNodeCandidates.put(patternNode, matchedNodes);
			
			for(Iterator<V> itHostGraph= hostGraph.getVertices().iterator(); itHostGraph.hasNext();) {
				V node = itHostGraph.next();
				if(patternNode.match(node)) {
					matchedNodes.add(node);
				}
			}
			
			if(matchedNodes.isEmpty()) {
				System.err.println("Pattern node cannot be matched! "+patternNode);
				return null;
			}
		}	
		return matchedNodeCandidates;
	}
	
	private PatternNE getStartPatternNode(Graph<PatternNE, PatternNE> lhs) {
		int maxDegree = 0;
		PatternNE startNode = null;
		for(Iterator<PatternNE> it = lhs.getVertices().iterator(); it.hasNext();) {
			PatternNE node = it.next();
			int degree = lhs.degree(node);
			if( degree > maxDegree) {
				maxDegree = degree;
				startNode = node;
			}
		}
		return startNode;
	}
	
	// return next pattern node as right value and its parent node as left value
	private Pair<PatternNE, PatternNE> getNextPatternNode(Graph<PatternNE, PatternNE> lhs,
			Set<PatternNE> matchedNodes, Set<PatternNE> unmatchedNodes) {
		
		Pair<PatternNE, PatternNE> pair = new Pair<PatternNE, PatternNE>();
		PatternNE nextNode = null;
		PatternNE parentNode = null;
		for(Iterator<PatternNE> it=matchedNodes.iterator(); it.hasNext();) {
			parentNode = it.next();
			for(Iterator<PatternNE> itNeighbor = lhs.getNeighbors(parentNode).iterator(); itNeighbor.hasNext();) {
				PatternNE neighbor = itNeighbor.next();
				if(unmatchedNodes.contains(neighbor)) {
					nextNode = neighbor;
					break;
				}
			}
			
			if(nextNode != null) {
				break;
			}
		}
		
		if(nextNode == null) {
			return null;	
		} else {
			pair.setLeft(parentNode);
			pair.setRight(nextNode);
			return pair;
		}		
	}

	private boolean matchNextNodeAndEdges(PatternNE parentNode, PatternNE nextNode, 
			Map<PatternNE, Set<V>> matchedNodeCandidates) {
		
		// each match might branch to more than one when multiple candidates can be chosen
		Set<Match<V, E>> branchMatches = new HashSet<Match<V, E>>();
		Boolean matchFound = false;
		
		// traverse all current match and each is a growing point
		for(Iterator<Match<V, E>> itMatch=matches.iterator(); itMatch.hasNext();) {
			Match<V, E> match = itMatch.next();
						
			Map<V, Map<PatternNE, E>> matchedNextNodeAndEdges = new HashMap<V, Map<PatternNE, E>>();
			// get all match candidate nodes that are not used in current match
			// each candidate can possibly create one branch
			for(Iterator<V> itCandidate=matchedNodeCandidates.get(nextNode).iterator(); itCandidate.hasNext();) {
				V nextNodeHost = itCandidate.next(); 
				if(match.containsHostNode(nextNodeHost)) {
					continue;
				}
				
				Map<PatternNE, E> newlyMatchedEdges = matchEdgesOnCandidate(nextNode, nextNodeHost, match);
				if(newlyMatchedEdges != null) {
					matchedNextNodeAndEdges.put(nextNodeHost, newlyMatchedEdges);
				} else {
					//System.out.println("edges are not matched for candidate "+nextNodeHost);
				}
			}
			
			// create branches and remove current match if it stop growing
			if(matchedNextNodeAndEdges.isEmpty()) {
				itMatch.remove();
			} else {
				for(Iterator<V> itMatchNode = matchedNextNodeAndEdges.keySet().iterator(); itMatchNode.hasNext();) {
					V matchedNode = itMatchNode.next();
					Map<PatternNE, E> matchedEdges = matchedNextNodeAndEdges.get(matchedNode);
					// if we have more candidates, we need create branches based on current match
					if(itMatchNode.hasNext()) {
						Match<V, E> branchMatch = new Match<V, E>();
						branchMatch.addAllMatching(match);
						branchMatch.addMatchingNode(nextNode, matchedNode);
						branchMatch.addMatchingEdges(matchedEdges);
						branchMatches.add(branchMatch);
						matchFound = true;
					} else {
						match.addMatchingNode(nextNode, matchedNode);
						match.addMatchingEdges(matchedEdges);
						matchFound = true;
					}
				}
			}
		}
		
		if(matchFound == false) {
			System.err.println("edges cannot be completely matched !");
			//System.exit(0);
		} else {
			matches.addAll(branchMatches);
			matchedNodes.add(nextNode);
			unmatchedNodes.remove(nextNode);
		}
		
		return matchFound;
	}
	
	private Map<PatternNE, E> matchEdgesOnCandidate(PatternNE patternNode, V hostNode, Match<V, E> match) {
		Map<PatternNE, E> edgeMatches = new HashMap<PatternNE, E>();
		
		// check edges to all neighbors, as long as one is not matched then return null
		for(Iterator<PatternNE> itNeighbors = lhs.getNeighbors(patternNode).iterator(); itNeighbors.hasNext();) {
			PatternNE neighbor = itNeighbors.next();
			if(matchedNodes.contains(neighbor)) {
				PatternNE forwardPatternEdge = lhs.findEdge(patternNode, neighbor);
				PatternNE backwardPatternEdge = lhs.findEdge(neighbor, patternNode);
				E forwardHostEdge = hostGraph.findEdge(hostNode, match.getMatchedNode(neighbor));
				E backwardHostEdge = hostGraph.findEdge(match.getMatchedNode(neighbor), hostNode);
				
				if(forwardPatternEdge != null) {
					if(forwardPatternEdge.match(forwardHostEdge)) {
						edgeMatches.put(forwardPatternEdge, forwardHostEdge);
						
						if(forwardHostEdge== null) {
							System.out.println();
						}
					} else {
						return null;
					}
				}
				
				if(backwardPatternEdge != null && backwardPatternEdge != forwardPatternEdge) {
					if(backwardPatternEdge.match(backwardHostEdge)) {
						edgeMatches.put(backwardPatternEdge, backwardHostEdge);
						//System.out.println("backedge "+backwardPatternEdge+" match "+backwardHostEdge);
						if(backwardHostEdge== null) {
							System.out.println();
						}
					}
					else {
						return null;
					}
				}
			}
		}
		return edgeMatches;
	}
}