<#-- the template input is an "Interface" type variable -->
<#-- the template output is an eol for CreatorNE -->
<#-- the CreatorNE creates output "BusInterfaceType" -->
var busInterface = new BusInterfaceType;
busInterface.name = "${getBusRef()}";
BusInterfaceType.all.add(busInterface);
