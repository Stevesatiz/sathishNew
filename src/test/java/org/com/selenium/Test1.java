package org.com.selenium;

import org.com.login.BaseClassLearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 extends BaseClassLearning {
	
    @Test
    private void tc1() {
    	browserLaunch("https://www.facebook.com/");
    	Test2 t=new Test2();
    	WebElement username = t.getUsername();
    	username.sendKeys("sathish");
    	driver.navigate().refresh();
    	String attribute = username.getAttribute("id");
    	System.out.println(attribute);
    	WebElement password = t.getPassword();
    	password.sendKeys("12345");
    	t.getLogin().click();
    	
	}



		
	}
	
	
  


