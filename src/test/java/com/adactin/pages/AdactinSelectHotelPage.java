package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.Utilits.BaseClass;

public class AdactinSelectHotelPage extends BaseClass{
	public AdactinSelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	@FindBy(id="cancel")
	private WebElement cancel;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getCancel() {
		return cancel;
	}
}
