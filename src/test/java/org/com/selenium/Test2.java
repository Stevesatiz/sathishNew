package org.com.selenium;

import org.com.login.BaseClassLearning;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Test2 extends BaseClassLearning {
	
	public Test2() {
	PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
	private WebElement username;
	
	@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@name='pass1']")})
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	

}
