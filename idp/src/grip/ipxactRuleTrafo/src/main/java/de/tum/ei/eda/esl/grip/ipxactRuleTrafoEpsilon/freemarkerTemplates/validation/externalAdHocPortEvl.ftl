<#-- the template input is an "ExternalPortReferenceType" type variable -->
<#-- the template output is an evl for "ExternalPortReferenceType" variable -->
context EObject{
	
	constraint size {		
		check : self->size() = 1 
	}
	
	constraint type {
		guard: self.satisfies("size")		
		check : ExternalPortReferenceType.all.size() = 1		
	}

}

context ExternalPortReferenceType{

	constraint name {
		check: self.portRef = "${getPortRef()}"
	}
}