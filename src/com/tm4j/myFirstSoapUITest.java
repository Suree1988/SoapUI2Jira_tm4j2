package com.tm4j;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class myFirstSoapUITest {
	
	@Given("^Integrating Soapui with Test Management for Jira version$")
	public void integrating_Soapui_with_Test_Management_for_Jira_version() throws Throwable {
		 SoapUITestCaseRunner runner = new SoapUITestCaseRunner(); 
		  runner.setProjectFile( "SoapUI_File/CountryInfo-soapui-project.xml" );
		  runner.run(); 
	    throw new PendingException();
	}

}
