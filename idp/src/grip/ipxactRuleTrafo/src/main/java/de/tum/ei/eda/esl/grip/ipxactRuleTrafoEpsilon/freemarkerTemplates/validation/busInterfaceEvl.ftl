<#-- the template input is an "Interface" type variable -->
<#-- the template output is an evl for "BusInterfaceType" variable -->
context EObject{
	
	constraint size {		
		check : self->size() = 1 
	}
	
	constraint type {
		guard: self.satisfies("size")		
		check : BusInterfaceType.all.size() = 1		
	}

}

context BusInterfaceType{

	constraint name {
		check: self.name = "${getBusRef()}"
	}
}