package org.com.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass {
	@Test(dependsOnMethods = "tc6",alwaysRun = false)
   private void tc4() {
    System.out.println("test4");
	}
	@Test
	private void tc5() {
		System.out.println("test5");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods = "tc5")
	private void tc6() {
     System.out.println("test6");
     Assert.assertTrue(false);
	}
	
	
	
//	    @Test(priority =20)
//		private void tc1() {
//			System.out.println("test1");
//
//		}
//		@Test(invocationCount = 3,priority = 0)
//		private void tc2() {
//		System.out.println("test2");
//		}
//		@Test(priority = 30,expectedExceptions = AssertionError.class)
//		private void tc3() {
//			
//        System.out.println("test3");
//        //Assert.assertEquals(false, true);
//        SoftAssert s=new SoftAssert();
//        s.assertTrue(false);
//        System.out.println("testing");
//        s.assertAll();
//		}
		
		
		
	}


