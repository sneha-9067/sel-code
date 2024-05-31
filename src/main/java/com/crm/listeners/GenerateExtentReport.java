package com.crm.listeners;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport implements ITestListener {
	
	public ExtentReports report;
	public ExtentSparkReporter spark;;
	public ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("ITest Result");
		
		String name = result.getMethod().getMethodName();
		test.log(Status.PASS, name+" is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("ITest Failure");
		String name = result.getMethod().getMethodName();
		test.log(Status.FAIL, name+" is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("ITest Result");
		String name = result.getMethod().getMethodName();
		test.log(Status.SKIP, name+" is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("ITest Reult Failed with Success Percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("ITest Result on Test Failed with Timeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("ITest Context Onstart");
		report = new ExtentReports();
		File path =  new File("C:\\Users\\Sneha\\eclipse-workspace\\com.AdvanceSelenium\\ExtentReport/sample.html");
		spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("M6 Batch");
		spark.config().setTheme(Theme.STANDARD);
		report.setSystemInfo("Os", "Window-11");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("ITest Context o finish");
		report.flush();
	}
	
	
}
