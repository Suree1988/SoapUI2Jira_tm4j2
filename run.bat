javac -cp ./lib/*  src/testCode/mySecondSoapUITest.java src/testCode/TestRunner.java
java -cp ./lib/* org.junit.runner.JUnitCore ./src/testCode/TestRunner
