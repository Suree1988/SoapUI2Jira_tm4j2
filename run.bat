javac -cp ./src/testCode/;./lib/* mySecondSoapUITest.java TestRunner.java
java -cp ./lib/* org.junit.runner.JUnitCore ./src/testCode/TestRunner
