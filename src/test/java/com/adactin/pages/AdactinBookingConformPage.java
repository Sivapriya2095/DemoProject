package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.Utilits.BaseClass;

public class AdactinBookingConformPage extends BaseClass{
	public AdactinBookingConformPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="search_hotel")
	private WebElement searchHotel;

	@FindBy(id="my_itinerary")
	private WebElement myItinerary;

	@FindBy(id="logout")
	private WebElement logOut;

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogOut() {
		return logOut;
	}
}
