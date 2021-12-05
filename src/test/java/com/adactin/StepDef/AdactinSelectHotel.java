package com.adactin.StepDef;

import org.openqa.selenium.WebElement;

import com.adactin.pages.AdactinSearchPage;

import io.cucumber.java.en.When;

public class AdactinSelectHotel extends AdactinSearch{
	@When("Click the hotel")
	public void click_the_hotel() {
		WebElement selectHotel = ah.getRadioButton();
	    selectHotel.click();
	}

	@When("Click the submit button")
	public void click_the_submit_button() {
		WebElement selectHotel = ah.getContinueButton();
	    selectHotel.click();
	}
}
