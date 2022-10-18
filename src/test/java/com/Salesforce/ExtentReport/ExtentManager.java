package com.Salesforce.ExtentReport;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

	private static ExtentReports extentReports;
	static ExtentHtmlReporter htmlReporter;
	ExtentTest logger;

	public static ExtentReports createInstance() {
		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/test-output/" + getReportName() + ".html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(htmlReporter);
		extentReports.setSystemInfo("Host Name", "Pravin Salunke");
		extentReports.setSystemInfo("Environment", "Salesforce Test");
		extentReports.setSystemInfo("User Name", "Automation Team");
		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
		return extentReports;
	}

	public static String getReportName() {
		Date d = new Date();
		String fileName = "AutomationReport_" + d.toString().replace(":", "_").replace(" ", "_");
		return fileName;
	}
}
