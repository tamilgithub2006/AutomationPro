package org.stepdefinition;

import java.io.IOException;

import org.adactin.objectrepository.LoginPage;
import org.baseclass.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinLoginSteps extends Baseclass {
	
	@Given("user launch adactin hotel application")
	public void user_launch_adactin_hotel_application() {
		loadBrowser();
		launchUrl("http://www.adactin.com/HotelApp/");
		browserMax();
	}
	@When("user enter username and password")
	public void user_enter_username_and_password() throws IOException {
		LoginPage l=new LoginPage();
		enterText(l.getTxtUsername(), excelRead("Hotel Booking", "Data", 1, 0));
		enterText(l.getTxtPassword(), excelRead("Hotel Booking", "Data", 1, 1));
	}
	@When("user click login button")
	public void user_click_login_button() {
		LoginPage l=new LoginPage();
		clickElement(l.getBtnLogin());		
	}
	@Then("user see the homepage for valid password")
	public void user_see_the_homepage_for_valid_password() {
	    
		Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'Welcome to Adactin Group of Hotels')]")).isDisplayed());
	}
}
