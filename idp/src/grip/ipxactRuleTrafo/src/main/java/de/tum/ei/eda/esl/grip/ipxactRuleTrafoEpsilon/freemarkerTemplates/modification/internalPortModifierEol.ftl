<#-- the template input is an "InternalPortReferenceType" type variable -->
<#-- the template output is an eol for ModifierNE -->
<#-- the ModifierNE changes InternalPortReferenceType-->
if(InternalPortReferenceType.all.size() == 1) {
	var port = InternalPortReferenceType.all.first();
	port.portRef = "${getPortRef()}";
	<#if ${getLeft().intValue() != 0>
		port.left = new Native("java.math.BigInteger")("${getLeft()}");
	</#if>
	<#if ${getRight().intValue() != 0>
		port.right = new Native("java.math.BigInteger")("${getRight()}");
	</#if>	
} else {
	"Input model must be ONE InternalPortReferenceType model !!!".println();
}