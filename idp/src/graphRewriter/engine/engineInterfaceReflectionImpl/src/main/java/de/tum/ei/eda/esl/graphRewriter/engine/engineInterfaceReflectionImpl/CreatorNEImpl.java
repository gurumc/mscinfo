package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.CreatorNE;


public class CreatorNEImpl<T> extends RewriterNEImpl implements CreatorNE<T> {
	private Class<?> newElementClass;
	private Set<Method> initialMethods = new HashSet<Method>();
	private Map<Method, Object> initialValues = new HashMap<Method, Object>();
	
	public void setNewElementClass(Class<?> value) {
	   this.newElementClass = value;
	}
	
	public Class<?> getNewElementClass() {
	   return this.newElementClass;
	}

	public void addInitialValue(Method method, Object value) {
		this.initialMethods.add(method);
		this.initialValues.put(method, value);
	}
	
	public T create() {
		T newElement = null;
		try {
			newElement= (T) this.newElementClass.newInstance();
			for(Iterator<Method> it=initialMethods.iterator(); it.hasNext();) {
				Method method = it.next();
				method.invoke(newElement, initialValues.get(method));
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return newElement;
	}
}
