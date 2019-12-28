package testCode;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features= {"bdd-export5718803273015028755"},
glue= {"testCode"},
tags= {"@TestCaseKey=TM-T2"},
format= {"junit:target/tm4j/Test-soaui_report.xml","json:target/tm4j/Test-soaui_report.json"})		

public class TestRunner {

}
 