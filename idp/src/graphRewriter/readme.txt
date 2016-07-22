GraphRewriter project is built with Maven

To configure and run the project:

1.(compulsory) Install Maven: 
-- maven: https://maven.apache.org/
-- after successful install, you can run "mvn -v" to check if environment variables are set correctly

2.(compulsory) Download epsilon tool and install with Maven
-- epsilon: http://www.eclipse.org/epsilon/download/
-- alternatively copy from: /nfs/TUEIEDAprojects/SystemDesign/tools/Epsilon/org.eclipse.epsilon
-- go to downloaded folder(org.eclipse.epsilon) and install to local repository with "mvn install"
-- it might take a few minutes to compile and install, the default folder for maven is ~/.m2/repository

	git clone git://git.eclipse.org/gitroot/epsilon/org.eclipse.epsilon.git
	cd org.eclipse.epsilon
	mvn install

3.(optional) Download eclipse(Luna is recommanded, Kepler also works) and install "Maven Integration for Eclipse" plugin

4. The project can then be compiled/packaged with Maven or import to eclipse workspace with "Import->Existing Maven Project"
  
  



