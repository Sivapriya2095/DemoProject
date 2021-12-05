package com.adactin.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.adactin.Utilits.BaseClass;
import com.adactin.pages.AdactinBookHotelPage;
import com.adactin.pages.AdactinBookingConformPage;
import com.adactin.pages.AdactinLoginPage;
import com.adactin.pages.AdactinSearchPage;
import com.adactin.pages.AdactinSelectHotelPage;

import io.cucumber.cucumberexpressions.GeneratedExpression;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;


public class AdactinLogin extends BaseClass{
	static WebDriver driver;
	static AdactinLoginPage al;
	static AdactinSearchPage  as;
	static AdactinSelectHotelPage ah;
	static AdactinBookHotelPage ab;
	static AdactinBookingConformPage ac;
	
	@Given("Launch the browser")
	public static void launch_the_browser() {
	    driver = getDriver();
	    al= new AdactinLoginPage();
	    as = new AdactinSearchPage();
	    ah = new AdactinSelectHotelPage();
	    ab = new AdactinBookHotelPage();
	    ac = new AdactinBookingConformPage();
	}
	@Given("Open the Adactin hotel Login page")
	public void open_the_adactin_hotel_login_page() {
	    getUrlLink("http://adactinhotelapp.com/");
	    
	}
	
	@When("User enter the login page with valid {string} and {string}")
	public void enter_invalid_and(String username, String password) {
		 WebElement userName = al.getUserName();
		 insertValues(userName, username);
		   
		  WebElement Password = al.getPassword();
		  insertValues(Password, password);
	}
	
	@When("Click login button")
	public void click_login_button() {
	    WebElement login = al.getLogin();
	    login.click();
	}
	@Then("Validate the error message")
	public void validate_the_error_message() {
	  WebElement bookConform = driver.findElement(By.xpath("//td[text()='Booking Confirmation ']"));
	  String conform = getTextValue(bookConform);
	  boolean contains = conform.contains("Booking Confirm");
	  Assert.assertTrue(contains);
	}
	
	
	
	@Then("Close the browser")
	public void close_the_browser() {
	   
	}
}
