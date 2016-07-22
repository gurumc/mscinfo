package de.tum.ei.eda.esl.graphRewriter.searchTreeExploration;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.rits.cloning.Cloner;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;

public class RuleTree<V, E> {
	
	private V rootNode = null;
	private Graph<V, Integer> tree = null;
	private RuleExecutor<V, E> ruleExecutor = null;
	private NodeComparator<V> nodeComparator = null;
	
	private Map<Integer, E> edgeIdToRuleMap = null;
	private Cloner cloner = new Cloner();
	
	public RuleExecutor<V, E> getRuleExecutor() {
		return ruleExecutor;
	}

	public void setRuleExecutor(RuleExecutor<V, E> ruleExecutor) {
		this.ruleExecutor = ruleExecutor;
	}

	public NodeComparator<V> getNodeComparator()
	{
		return nodeComparator;
	}
	
	public void setNodeComparator(NodeComparator<V> nodeComparator)
	{
		this.nodeComparator = nodeComparator;
	}
	
	public Graph<V, Integer> createTree(V seed, Set<E> rules, int deepthLimit) {
		tree = new SparseGraph<V, Integer>();
		rootNode = cloner.deepClone(seed);
		edgeIdToRuleMap = new HashMap<Integer, E>();
		tree.addVertex(rootNode);
				
		Set<V> nodes = new HashSet<V>();
		nodes.add(rootNode);
		for(int i = 1; i < deepthLimit; i++) {
			System.out.println("growing a new layer...");
			nodes = growOneLayer(nodes,rules);
		}
		
		System.out.println("tree is created");
		return tree;
	}
	
	private Set<V> growOneLayer(Set<V> nodes, Set<E> rules) {
		boolean flag = false;
		Set<V> newNodes = new HashSet<V>();
		for(Iterator<V> itNodes = nodes.iterator(); itNodes.hasNext();) {
			V node = itNodes.next();
			for(Iterator<E> itRules = rules.iterator(); itRules.hasNext(); ) {
				E rule = itRules.next();
				V newNode = ruleExecutor.execute(node, rule);
				if(newNode != null) {
					//gmc
					for(V oldNode:tree.getVertices()){
						long st = System.nanoTime();
						if(nodeComparator.compare(oldNode, newNode))
						{
							System.out.println("time for comparison" + (st-System.nanoTime()));
							Integer edgeId = new Integer(tree.getEdgeCount());
							edgeIdToRuleMap.put(edgeId, rule);	
							tree.addEdge(edgeId, node, oldNode, EdgeType.DIRECTED);
							System.out.println("add edge "+edgeId+" with "+rule);
							flag = true; 
							break;
						}
					} 
					if(!flag){
						Integer edgeId = new Integer(tree.getEdgeCount());
						edgeIdToRuleMap.put(edgeId, rule);	

						tree.addVertex(newNode);
						tree.addEdge(edgeId, node, newNode, EdgeType.DIRECTED);

						newNodes.add(newNode);
						System.out.println("add edge "+edgeId+" with "+rule);
					}
					flag = false;
				}				
			}	
		}
		
		return newNodes;
	}
	/*
	private Set<Set<E> > getAppliedRules(V node) {
		Set<Set<E> > appliedRules = new HashSet<Set<E> >();
		Collection<V> predecessors = tree.getPredecessors(node);
		
		if(predecessors.size() == 0) {
			return null;
		} else {
			for(Iterator<V> it=predecessors.iterator(); it.hasNext();) {
				V predecessor = it.next();	
				Set<Set<E> > 
			}
		}
		
		return appliedRules;
	}
*/
}
