<#-- the template input is an "ComponentInstanceType" type variable -->
<#-- the template output is an evl for "ComponentInstanceType" variable -->
context EObject{
	
	constraint size {		
		check : self->size() = 1 
	}
	
	constraint type {
		guard: self.satisfies("size")		
		check : ComponentInstanceType.all.size() = 1		
	}

}

context ComponentInstanceType{

	constraint version {
		check: self.componentRef.version = "${getComponentRef().getVersion()}"
	}	

	constraint name {
		check: self.componentRef.name = "${getComponentRef().getName()}"
	}
	
	constraint lib {
		check: self.componentRef.library = "${getComponentRef().getLibrary()}"
	}
	
	constraint vendor {
		check: self.componentRef.vendor = "${getComponentRef().getVendor()}"
	}
}