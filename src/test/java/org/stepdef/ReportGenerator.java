package org.stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGenerator {
	public static void adactinreport(String json) {
	File file = new File("C:\\Users\\lenovo\\eclipse-workspace\\Cucumber\\target");
	Configuration configuration= new Configuration(file, "adactintrail");
	configuration.addClassifications("browser", "chrome");
	configuration.addClassifications("sprint", "10");
	configuration.addClassifications("domain", "adactin");
	List<String> list= new ArrayList<String>();
	list.add(json);
	ReportBuilder builder= new ReportBuilder(list, configuration);
	builder.generateReports();
	
	

	}}
