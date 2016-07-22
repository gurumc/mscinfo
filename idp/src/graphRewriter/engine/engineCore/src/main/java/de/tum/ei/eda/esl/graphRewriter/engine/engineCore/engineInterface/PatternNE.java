package de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface;


public interface PatternNE {
public void setIdent(String value);

public String getIdent();

public boolean match(Object element);

}
