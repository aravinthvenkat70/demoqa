package org.runner;

import org.junit.AfterClass;

import org.junit.runner.RunWith;
import org.stepdef.ReportGenerator;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.junit.SanityChecker;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\cucu.feature"},tags="@E2E",plugin= {"pretty","json:C:\\Users\\lenovo\\eclipse-workspace\\Cucumber\\target\\hi.json"},snippets=SnippetType.CAMELCASE,glue= {"org.stepdef"})
public class TestRunner {





@AfterClass
public static void afterClass() {
ReportGenerator.adactinreport("C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\Cucumber\\\\target\\\\hi.json");

	
	
	
}	
}