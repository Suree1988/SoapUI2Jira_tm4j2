javac -cp ./lib/*  src/com/zephyr/TestRunner.java src/com/zephyr/myFirstSoapUITest.java
java -cp ./src;./lib/* org.junit.runner.JUnitCore com.zephyr.TestRunner
