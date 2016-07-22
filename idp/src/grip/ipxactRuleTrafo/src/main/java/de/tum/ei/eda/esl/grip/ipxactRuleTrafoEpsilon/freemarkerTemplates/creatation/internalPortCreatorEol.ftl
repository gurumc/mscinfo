<#-- the template input is an "InternalPortReferenceType" type variable -->
<#-- the template output is an eol for CreatorNE -->
<#-- the CreatorNE creates output "InternalPortReferenceType" -->
var element = new InternalPortReferenceType;
element.portRef = "${getPortRef()}";
element.left = new Native("java.math.BigInteger")("${getLeft()}");
element.right = new Native("java.math.BigInteger")("${getRight()}");
InternalPortReferenceType.all.add(element);