package org.com.selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Test4 implements IRetryAnalyzer{
    	int min=0; int max=3;
	public boolean retry(ITestResult result) {
		if (max>min) {
			min++;
			return true;
		}
		return false;
	}

}
