Install JDK 8 [http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html]

Install Maven [https://maven.apache.org/download.cgi]

cd cucumberpom

mvn clean install

cd src/test

For sign up new account via GUI:
    mvn -Dcucumber.options="--tags @SignUp" test

For sign up new account via API:
    mvn -Dtest=SignUpAPI test
    activate account via email
    mvn -Dcucumber.options="--tags @Login" test



