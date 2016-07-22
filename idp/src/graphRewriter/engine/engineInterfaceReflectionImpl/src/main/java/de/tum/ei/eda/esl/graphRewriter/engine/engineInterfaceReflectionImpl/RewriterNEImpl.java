package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;


public class RewriterNEImpl implements RewriterNE{
private String ident;

public void setIdent(String value) {
   this.ident = value;
}

public String getIdent() {
   return this.ident;
}

@Override
public String toString() {
	return this.ident;
}
}
