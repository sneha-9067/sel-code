package com.crm.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Dws_Login implements ITestListener {
	
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("ITest Result");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("ITest Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("ITest Result");
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
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("ITest Context o finish");
	}
	
	

}
