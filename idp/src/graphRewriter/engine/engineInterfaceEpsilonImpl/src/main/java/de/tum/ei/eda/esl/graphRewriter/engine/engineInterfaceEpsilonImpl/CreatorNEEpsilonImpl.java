package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.CreatorNE;

public class CreatorNEEpsilonImpl<T extends EObject> extends RewriterNEEpsilonImpl implements CreatorNE<T> {
	private String eolFileName;
	
	public void setEolFileName(String value) {
	   this.eolFileName = value;
	}
	
	public String getEolFileName() {
	   return this.eolFileName;
	}
	
	private List<IModel> getModels() {
		List<IModel> models = new ArrayList<IModel>();
		Resource resource = (new ResourceFactoryImpl()).createResource(null);
		
		InMemoryEmfModel model = new InMemoryEmfModel(resource);
		models.add(model);
		return models;
	}
	
	public T create() {
		T newElement = null;
		
		try {			
			if(this.getEolFileName() == null) {
				System.err.println("eol filename cannot be null !"+this.getIdent());
				return null;
			}

			EolModule module = new EolModule();
			List<Variable> parameters = new ArrayList<Variable>();
			
			File eolFile = new File(this.getEolFileName());
			
			module.parse(eolFile);
		
			if (module.getParseProblems().size() > 0) {
				System.err.println("Parse errors occured...");
				for (ParseProblem problem : module.getParseProblems()) {
					System.err.println(problem.toString());
				}
				return null;
			}

			for (IModel model : getModels()) {
				module.getContext().getModelRepository().addModel(model);
			}
			for (Variable parameter : parameters) {
				module.getContext().getFrameStack().put(parameter);
			}
			module.execute();
			if(module.getContext().getModelRepository().getModels().size() !=1) {
				System.err.println("Output model number is not correct! (should only be one)");
			}
			InMemoryEmfModel outputModel = (InMemoryEmfModel) module.getContext().getModelRepository().getModels().get(0);
			Resource resource2 = outputModel.getResource();
			
			newElement = (T) resource2.getContents().get(0);
			
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newElement;
	}
	
	@Override
	public String toString() {
		if(this.getEolFileName() == null) {
			return new String("noEol");
		} else {
			return this.getEolFileName();
		}
	}
}
