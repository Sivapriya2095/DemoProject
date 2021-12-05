package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.Utilits.BaseClass;

public class AdactinBookHotelPage extends BaseClass{
	public AdactinBookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="first_name")
	private WebElement firstName;

	@FindBy(name="last_name")
	private WebElement lastName;

	@FindBy(name="address")
	private WebElement address;

	@FindBy(name="cc_num")
	private WebElement cardNum;

	@FindBy(name="cc_type")
	private WebElement cardType;

	@FindBy(name="cc_exp_month")
	private WebElement cardExpiryMonth;

	@FindBy(name="cc_exp_year")
	private WebElement cardExpiryYear;

	@FindBy(name="cc_cvv")
	private WebElement cvvNum;

	@FindBy(id="book_now")
	private WebElement bookNow;

	@FindBy(id="cancel")
	private WebElement cancel;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExpiryMonth() {
		return cardExpiryMonth;
	}

	public WebElement getCardExpiryYear() {
		return cardExpiryYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getCancel() {
		return cancel;
	}

}
