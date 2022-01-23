package org.com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends BaseClassLearning {
	
	public static void main(String[] args) {
		
		browserLaunch("https://www.facebook.com/");
		Page p=new Page();
		WebElement txtuser = p.getUsername();
		txtuser.sendKeys("sathish");
		WebElement password = p.getPassword();
		password.sendKeys("1234");
		
		
		
	}
	

}
