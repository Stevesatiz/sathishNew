package org.com.login;

import org.openqa.selenium.WebElement;

public class Launch extends BaseClassLearning{

	public static void main(String[] args) {
		BaseClassLearning b=new BaseClassLearning();
		b.browserLaunch("https://www.facebook.com/");
		FacebookL f=new FacebookL();

		try {
			WebElement username = f.getUsername();
			username.sendKeys("sathish");
		} 
		catch (Exception e) {
			System.out.println("NullpointException");
		}	
		
		
		
		
	}
}
