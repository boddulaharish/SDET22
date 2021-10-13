package com.crm.vlion.GenericUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImp1 implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String tetsName = result.getMethod().getMethodName();
		System.out.println("======listing=======");
		
	}
}
