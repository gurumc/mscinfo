<#-- the template input is an "InternalPortReferenceType" type variable -->
<#-- the template output is an evl for "InternalPortReferenceType" variable -->
context EObject{
	
	constraint size {		
		check : self->size() = 1 
	}
	
	constraint type {
		guard: self.satisfies("size")		
		check : InternalPortReferenceType.all.size() = 1		
	}

}

context InternalPortReferenceType{

	constraint name {
		check: self.portRef = "${getPortRef()}"
	}
}