package org.stepdefinition;

import java.io.IOException;

import org.adactin.objectrepository.BookingPage;
import org.baseclass.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.By;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinBookingSteps extends Baseclass {
	@When("user enter first name")
	public void user_enter_first_name() throws IOException {
		BookingPage b = new BookingPage();
		enterText(b.getTxtFirstName(), excelRead("Hotel Booking", "Data", 1, 10));	
	}
	@When("user enter last name")
	public void user_enter_last_name() throws IOException {
		BookingPage b = new BookingPage();
		enterText(b.getTxtLastName(), excelRead("Hotel Booking", "Data", 1, 11));
	}
	@When("user enter billing address")
	public void user_enter_billing_address() throws IOException {
		BookingPage b = new BookingPage();
		enterText(b.getTxtAddress(), excelRead("Hotel Booking", "Data", 1, 12));	
	}
	@When("user enter credit card number")
	public void user_enter_credit_card_number() throws IOException {
		BookingPage b = new BookingPage();
		enterText(b.getTxtCreditcardNo(), excelRead("Hotel Booking", "Data", 1, 13));		
	}
	@When("user select credit card type")
	public void user_select_credit_card_type() throws IOException {
		BookingPage b = new BookingPage();
		selectDropDownByVisibleText(b.getCrediCardTypeDropDown(), excelRead("Hotel Booking", "Data", 1, 14));
	}
	@When("user select expiry date")
	public void user_select_expiry_date() throws IOException {
		BookingPage b = new BookingPage();
		selectDropDownByVisibleText(b.getExpiryMonthDropDown(), excelRead("Hotel Booking", "Data", 1, 15));
		selectDropDownByVisibleText(b.getExpiryYearDropDown(), excelRead("Hotel Booking", "Data", 1, 16));	
	}
	@When("user enter CVV number")
	public void user_enter_CVV_number() throws IOException {
		BookingPage b = new BookingPage();
		enterText(b.getTxtCCVNo(), excelRead("Hotel Booking", "Data", 1, 17));
	}

	@When("user click book now button")
	public void user_click_book_now_button()  {
		BookingPage b = new BookingPage();
		clickElement(b.getBtnBookNow());	
	}

	@Then("user sees the order number generated")
	public void user_sees_the_order_number_generated() throws InterruptedException {
		Thread.sleep(5000);
	    Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'Order No')]")).isDisplayed());
	}

}
