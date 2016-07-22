package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;


public class PatternNEEpsilonImpl implements PatternNE{

	private String ident;
	private String evlFileName; 
	private EvlModule module;
	private List<Variable> parameters = new ArrayList<Variable>();
	
	public void setEvlFileName(String value) {
	   this.evlFileName = value;
	}
	
	public String getEvlFileName() {
	   return this.evlFileName;
	}
	
	public void setIdent(String value) {
		this.ident = value;
	}
	
	public String getIdent() {
	   return this.ident;
	}	
	
	private List<IModel> getModels(EObject element) throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		
		Resource resource = (new ResourceFactoryImpl()).createResource(null); 
		resource.getContents().add(element);
		InMemoryEmfModel model = new InMemoryEmfModel(resource);
		models.add(model);
		return models;
	}

	private File getFile(String fileName) throws URISyntaxException {		
		return new File(fileName);
	}

	public boolean match(Object element) {
		try {
			if( !(element instanceof EObject)) {
				return false;
			}
			
			if(this.getEvlFileName() == null) {
				System.err.println("evl filename cannot be null !");
				return true;
			}

			module = new EvlModule();
			module.parse(getFile(this.getEvlFileName()));
		
			if (module.getParseProblems().size() > 0) {
				System.err.println("Parse errors occured...");
				for (ParseProblem problem : module.getParseProblems()) {
					System.err.println(problem.toString());
				}
				return false;
			}

			for (IModel model : getModels((EObject) element)) {
				module.getContext().getModelRepository().addModel(model);
			}
			for (Variable parameter : parameters) {
				module.getContext().getFrameStack().put(parameter);
			}

			module.execute();
			
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
		
		if (unsatisfied.size() > 0) {
			/*
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied");
			for (EvlUnsatisfiedConstraint uc : unsatisfied) {
				System.err.println(uc.getConstraint().getName()+" is not satisfied");
				System.err.println(uc.getMessage());
			}
			*/
			return false;
		}
		else {
			return true;
		}		
	}
	
	@Override
	public String toString() {
		return this.getIdent();
	}

}
