package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections15.Transformer;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;


public class PatternNEImpl implements PatternNE {

	private Class<?> matchClass;
	private Set<Transformer> transformers = new HashSet<Transformer>();
	private Map<Transformer, Object> matchValues = new HashMap<Transformer, Object>();
	private String ident;
	
	public void setMatchClass(Class<?> value) {
	   this.matchClass = value;
	}
	
	public Class<?> getMatchClass() {
	   return this.matchClass;
	}

	public void setIdent(String value) {
		this.ident = value;
	}

	public String getIdent() {
	   return this.ident;
	}
	
	public void addMatchConstraint(Class<?> elementClass, Transformer trans, Object value) {
		this.matchClass = elementClass;
		this.transformers.add(trans);
		this.matchValues.put(trans, value);
	}
	
	public boolean match(Object element) {
		
		if(element == null) {
			return false;
		} else if(matchClass == null) {
			return true;
		}
		
		if(!matchClass.isInstance(element)) {
			return false;
		} else {
			for(Iterator<Transformer> it=this.transformers.iterator(); it.hasNext();) {
				Transformer transformer = it.next();
				if(transformer.transform(element)==null) {
					return false;
				} else if( !transformer.transform(element).equals(this.matchValues.get(transformer))) {
					return false;
				}
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		String pattern = new String(this.ident+":");
		for(Iterator<Object> it = this.matchValues.values().iterator(); it.hasNext();) {
			pattern = pattern + it.next().toString();
		}
		return pattern;
	}
	
}
