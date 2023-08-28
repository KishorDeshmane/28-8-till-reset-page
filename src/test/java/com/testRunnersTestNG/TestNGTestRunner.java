package com.testRunnersTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/features",
//		features = "src/test/resources/A_features/B_Super_admin",
//		features = "src/test/resources/A_features/B_Administrator/C_Super_admin",
//		features = "src/test/resources/A_features/B_Administrator/D_Admin",
//		features = "src/test/resources/A_features/G_Partner",
		
		
//		tags="@Landing_page",
		tags="@Regressions",
		
//		tags="@Admin_log_in_page or @Super_admin_log_in_page or @Executive_log_in_page",
		
		glue = {"stepDefinitions","com/applicationHooks"},
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
			"html:target/html_report/cucumber_reports.html",
			"junit:target/junit_report/junit_reports.xml",
			"json:target/json_report/json_reports.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	
}
