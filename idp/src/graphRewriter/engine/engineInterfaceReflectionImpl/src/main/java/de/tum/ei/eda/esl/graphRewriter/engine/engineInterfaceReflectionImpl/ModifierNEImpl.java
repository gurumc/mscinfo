package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.ModifierNE;


public class ModifierNEImpl<T> extends RewriterNEImpl implements ModifierNE<T> {
	private Set<Method> modifyMethods = new HashSet<Method>();
	private Map<Method,Object> newValues = new HashMap<Method, Object>();
	
	public void addModification(Method method, Object value) {
		modifyMethods.add(method);
		newValues.put(method, value);
	}
	
	public T modify(T element) {
		for(Iterator<Method> it=this.modifyMethods.iterator(); it.hasNext();) {
			Method modifyMethod = it.next();
			Object newValue = newValues.get(modifyMethod);
			
			if(modifyMethod.getDeclaringClass().isInstance(element)) {
				try {
					modifyMethod.invoke(element, newValue);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			} else {
				System.err.println("element cannot be modified due to class mismatch !");
			}	
		}
		
		return element;
	}
}
