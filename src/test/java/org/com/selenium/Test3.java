package org.com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {

	@Test(groups = "Regresstion")
	private void tc1() {
     System.out.println("testA");
	}
	@Test(groups = "Regresstion")
	private void tc2() {
     System.out.println("testB");
	}
	@Test(groups = "Smoke" )
	private void tc3() {
     System.out.println("testC");
     Assert.assertTrue(false);
     System.out.println("testFail");
	}
	@Test(groups = "sanity")
	private void tc4() {
     System.out.println("testD");
	}
}
