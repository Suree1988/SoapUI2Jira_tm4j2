package com.tm4j;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features= {"bdd-export3958336676467726768"},
glue= {"com.tm4j"},
format= {"junit:Test-soaui_report.xml","json:Test-soaui_report.json"})		

public class TestRunner {

}
