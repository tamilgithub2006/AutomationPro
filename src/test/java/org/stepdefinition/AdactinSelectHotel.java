package org.stepdefinition;

import org.adactin.objectrepository.SelectPage;
import org.baseclass.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinSelectHotel extends Baseclass {
	@When("user choose hotel")
	public void user_choose_hotel() {
		SelectPage s = new SelectPage();
		clickElement(s.getBtnRadio());
	}
	@When("user click continue button")
	public void user_click_continue_button() {
		SelectPage s = new SelectPage();
		clickElement(s.getBtnContinue());
	}

	@Then("user sees the title book a hotel in the next page")
	public void user_sees_the_title_book_a_hotel_in_the_next_page() {
	    Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Book A Hotel ']")).isDisplayed());
	}



}
