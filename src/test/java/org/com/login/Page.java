package org.com.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Page extends BaseClassLearning{
	
	public Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({@FindBy(xpath="//input[@id='email']"),@FindBy(id="email")})
	private WebElement username;

	public WebElement getPassword() {
		return password;
	}
	@FindBys({@FindBy(id="pass"),@FindBy(xpath="//input[@id='pass']")})
	private WebElement password;
	public WebElement getUsername() {
		return username;
	}
	
	

}
