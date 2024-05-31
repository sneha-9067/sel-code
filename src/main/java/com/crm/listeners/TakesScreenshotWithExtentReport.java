package com.crm.listeners;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TakesScreenshotWithExtentReport extends BaseDemoClass implements ITestListener{
	
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		test.log(Status.INFO, " Welcome to our class...");
		test.log(Status.INFO, "My wonderful fellows...");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, " Your test case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Your test case has failed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Your testcase has skipped");
	}


	@Override
	public void onStart(ITestContext context) {
		
		File path = new File("C:\\Users\\Sneha\\eclipse-workspace\\com.AdvanceSelenium\\ExtentReport/capture.html");
		spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("Capture Screenshot");
		spark.config().setReportName("Sneha");
		spark.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.setSystemInfo("os", "Window-11");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);
		}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("ITest Context o finish");
		report.flush();
	}


}
