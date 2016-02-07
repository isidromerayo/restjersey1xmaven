RESTful Web Services with Java
==============================

Demo using Jersey framework 1.x (https://jersey.java.net/) is more than the JAX-RS Reference Implementation.

http://www.javacodegeeks.com/2013/11/restful-web-services-with-java.html

Test it: http://localhost:8080/RestJersey/rest/UserInfoService/name/Pavithra

http://www.hascode.com/2011/09/rest-assured-vs-jersey-test-framework-testing-your-restful-web-services/

https://javaposts.wordpress.com/2012/01/14/maven-rest-jersey-eclipse-tutorial/


Integration test (with Application Server profiles) 
---------------------------------------------------

To run on Tomcat 7 or Jetty 9.x

$ mvn verify -P integration-test,tomcat-7

$ mvn verify -P integration-test,jetty-9


Run application server
----------------------

$ mvn tomcat:run

http://localhost:8080/RestJerseyMaven

$ mvn jetty:run

http://localhost:8080/

Travis CI
---------

Status: [![Build Status](https://travis-ci.org/isidromerayo/restjersey1xmaven.svg?branch=master)](https://travis-ci.org/isidromerayo/restjersey1xmaven)

References
----------

http://cupofjava.de/blog/2013/02/05/integration-tests-with-maven-and-tomcat/

http://blog.code-cop.org/2015/04/maven-integration-tests-extra-folder.html

https://javaposts.wordpress.com/2012/01/14/maven-rest-jersey-eclipse-tutorial/

https://blog.codecentric.de/en/2012/05/writing-lightweight-rest-integration-tests-with-the-jersey-test-framework/

http://www.disasterarea.co.uk/blog/integration-tests-with-selenium-and-tomcat7-maven-plugin/

https://cooldevstuff.wordpress.com/category/integration-testing-using-maven-jetty-plugin-2/

http://mjlex.blogspot.de/2012/04/writing-lightweight-rest-integration.html

http://www.petrikainulainen.net/programming/maven/integration-testing-with-maven/

http://arquillian.org/guides/getting_started/