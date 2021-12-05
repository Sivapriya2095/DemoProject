package com.adactin.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.Utilits.BaseClass;
import com.adactin.pages.AdactinSearchPage;

import io.cucumber.java.en.When;

public class AdactinSearch extends AdactinLogin{
	
	@When("Select location {string}")
	public void enter_location(String locationValue) {
		WebElement location = as.getLocation();
		selectInDropDownByText(location, locationValue);
	   
	}
	@When("Select hotel {string}")
	public void select_hotel(String hotel) {
		WebElement hotelElement = as.getHotels();
		selectInDropDownByText(hotelElement, hotel);
		   
	}
	@When("Select room type {string}")
	public void select_room_type(String roomType) {
		WebElement roomElement = as.getRoom_type();
		selectInDropDownByText(roomElement, roomType);
	}
	@When("Select number of room {string}")
	public void select_number_of_room(String roomNo) {
		WebElement roomNoElement = as.getRoom_nos();
		selectInDropDownByText(roomNoElement, roomNo);
		  
	}
	@When("Enter check in date {string}")
	public void enter_check_in_date(String checkin) {
		WebElement dateIn = as.getDatepick_in();
		dateIn.sendKeys(checkin);
	}
	@When("Enter check out date {string}")
	public void enter_check_out_date(String checkout) {
		WebElement dateOut = as.getDatepick_out();
		   dateOut.sendKeys(checkout);
		  
	}
	@When("Select number of adult {string}")
	public void select_number_of_adult(String adultno) {
		WebElement adultroom = as.getAdult_room();
		   selectInDropDownByText(adultroom, adultno);
		   
	}
	@When("Select number of child {string}")
	public void select_number_of_child(String childno) {
		WebElement childroom = as.getChild_room();
		selectInDropDownByText(childroom, childno);
		
	}
	@When("Click search button")
	public void click_search_button() {
	    WebElement search = as.getSubmit();
	    search.click();
	}
}
