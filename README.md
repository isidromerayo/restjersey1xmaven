RESTful Web Services with Java
==============================

Demo using Jersey framework 1.x (https://jersey.java.net/) is more than the JAX-RS Reference Implementation.

http://www.javacodegeeks.com/2013/11/restful-web-services-with-java.html

Test it: http://localhost:8080/RestJersey/rest/UserInfoService/name/Pavithra

http://www.hascode.com/2011/09/rest-assured-vs-jersey-test-framework-testing-your-restful-web-services/

https://javaposts.wordpress.com/2012/01/14/maven-rest-jersey-eclipse-tutorial/


Integration test
----------------

To run on Tomcat 7 or Jetty 9.x

$ mvn verify -P integration-test,tomcat-7

$ mvn verify -P integration-test,jetty-9


Travis CI
---------

Status: [![Build Status](https://travis-ci.org/isidromerayo/restjersey1xmaven.svg?branch=master)](https://travis-ci.org/isidromerayo/restjersey1xmaven)
