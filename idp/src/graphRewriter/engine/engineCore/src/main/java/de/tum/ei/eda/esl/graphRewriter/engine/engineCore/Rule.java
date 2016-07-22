package de.tum.ei.eda.esl.graphRewriter.engine.engineCore;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
import edu.uci.ics.jung.graph.Graph;

public class Rule {
	
	private String name = null;
	
	private Graph<RewriterNE, RewriterNE> graphletRhs;
	private Graph<PatternNE, PatternNE> graphletLhs;
	
	private Map<String, PatternNE> patternNEIdenti = new HashMap<String, PatternNE>();
	private Map<String, RewriterNE> rewriterNEIdenti = new HashMap<String, RewriterNE>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setGraphletRhs(Graph<RewriterNE, RewriterNE> value) {
	   this.graphletRhs = value;
	   updateRewriterNEIdenti();
	}
	
	public Graph<RewriterNE, RewriterNE> getGraphletRhs() {
	   return this.graphletRhs;
	}
	
	public void setGraphletLhs(Graph<PatternNE, PatternNE> value) {
	   this.graphletLhs = value;
	   updatePatternNEIdenti();
	}
	
	public Graph<PatternNE, PatternNE> getGraphletLhs() {
	   return this.graphletLhs;
	}
	
	public boolean containsPatternNE(String identi) {
		return this.patternNEIdenti.containsKey(identi);
	}
	
	public boolean containsRewriterNE(String identi) {
		return this.rewriterNEIdenti.containsKey(identi);
	}
	
	public PatternNE getPatternNE(String identi) {
		return this.patternNEIdenti.get(identi);			
	}
	
	public RewriterNE getRewriterNE(String identi) {
		return this.rewriterNEIdenti.get(identi);
	}

	private void updatePatternNEIdenti() {
		patternNEIdenti.clear();
		for(Iterator<PatternNE> it=this.graphletLhs.getVertices().iterator(); it.hasNext(); ){
			PatternNE node = it.next();
			patternNEIdenti.put(node.getIdent(), node);
		}
		for(Iterator<PatternNE> it=this.graphletLhs.getEdges().iterator(); it.hasNext(); ){
			PatternNE edge = it.next();
			patternNEIdenti.put(edge.getIdent(), edge);
		}
	}
	
	private void updateRewriterNEIdenti() {
		rewriterNEIdenti.clear();
		for(Iterator<RewriterNE> it=this.graphletRhs.getVertices().iterator(); it.hasNext();) {
			RewriterNE node = it.next();
			rewriterNEIdenti.put(node.getIdent(), node);
		}
		for(Iterator<RewriterNE> it=this.graphletRhs.getEdges().iterator(); it.hasNext();) {
			RewriterNE edge = it.next();
			rewriterNEIdenti.put(edge.getIdent(), edge);
		}
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
