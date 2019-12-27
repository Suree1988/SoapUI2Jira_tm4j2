package com.tm4j;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features= {"bdd-export3958336676467726768/TM-T2.feature"},
glue= {"com.tm4j"},
format= {"junit:Test-soaui_report.xml","json:target/cucumber/tm4j_result.json"})		

public class TestRunner {

}
