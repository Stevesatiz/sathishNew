package org.com.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookL extends BaseClassLearning{
	
	public FacebookL() {
		PageFactory.initElements(driver, this);
	 
	}
	@FindBy(id="email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

}
