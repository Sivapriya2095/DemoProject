package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.Utilits.BaseClass;

public class AdactinLoginPage extends BaseClass{
	
	public AdactinLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement userName;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="login")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}


}
