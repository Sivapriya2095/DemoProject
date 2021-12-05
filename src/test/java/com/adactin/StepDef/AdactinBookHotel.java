package com.adactin.StepDef;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class AdactinBookHotel extends AdactinSelectHotel{
	@When("Enter First Name {string}")
	public void enter_first_name(String firstName) {
		WebElement firstname = ab.getFirstName();
		insertValues(firstname, firstName);
	}
	@When("Enter Last Name {string}")
	public void enter_last_name(String lastName) {
		WebElement lastname = ab.getLastName();
		insertValues(lastname, lastName);
	}
	@When("Enter Billing address {string}")
	public void enter_billing_address(String address) {
		WebElement billAddress = ab.getAddress();
		insertValues(billAddress, address);
	}
	@When("Enter Credit card {string}")
	public void enter_credit_card(String cardNo) {
		WebElement ccNum = ab.getCardNum();
		insertValues(ccNum, cardNo);
	}
	@When("Select Credit card type {string}")
	public void select_credit_card_type(String cardType) {
		WebElement card_Type = ab.getCardType();
		selectInDropDownByText(card_Type, cardType);
	}
	@When("Select Expiry month {string}")
	public void select_expiry_month(String expiryMonth) {
		WebElement card_Expiry_Month = ab.getCardExpiryMonth();
		selectInDropDownByText(card_Expiry_Month, expiryMonth);
	}
	@When("Select Expiry year {string}")
	public void select_expiry_year(String expiryYear) {
		WebElement card_Expiry_Year = ab.getCardExpiryYear();
		selectInDropDownByText(card_Expiry_Year, expiryYear);
	}
	@When("Enter CVV {string}")
	public void enter_cvv(String cvv) {
		WebElement cvvNum = ab.getCvvNum();
		insertValues(cvvNum, cvv);
	}
	@When("Click book now")
	public void click_book_now() {
		WebElement bookNow = ab.getBookNow();
	    bookNow.click();
	}
}
