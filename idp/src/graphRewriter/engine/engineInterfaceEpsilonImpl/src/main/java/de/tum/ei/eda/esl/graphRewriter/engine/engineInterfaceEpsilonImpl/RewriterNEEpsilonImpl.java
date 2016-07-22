package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;

public class RewriterNEEpsilonImpl implements RewriterNE{
	private String ident;
	
	public void setIdent(String value) {
	   this.ident = value;
	}
	
	public String getIdent() {
	   return this.ident;
	}
	
	@Override
	public String toString() {
		return this.ident+"(unchange)";
	}
}
