package org.stepdefinition;

import java.io.IOException;

import org.adactin.objectrepository.DropDownPage;
import org.baseclass.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class AdactinSearchHotelSteps extends Baseclass {
	
	
	@When("user select location")
	public void user_select_location() throws IOException {
		DropDownPage d = new DropDownPage();
		selectDropDownByVisibleText(d.getLocationDropDown(), excelRead("Hotel Booking", "Data", 1, 2));
	}
	@When("user select hotels")
	public void user_select_hotels() throws IOException {
		DropDownPage d = new DropDownPage();
		selectDropDownByVisibleText(d.getHotelDropDown(), excelRead("Hotel Booking", "Data", 1, 3));	
	}
	@When("user select room type")
	public void user_select_room_type() throws IOException {
		DropDownPage d = new DropDownPage();
		selectDropDownByVisibleText(d.getRoomtypeDropDown(), excelRead("Hotel Booking", "Data", 1, 4));
	}
	@When("user select number of rooms")
	public void user_select_number_of_rooms() throws IOException {
		DropDownPage d = new DropDownPage();
		selectDropDownByVisibleText(d.getNoOfRoomDropDown(), excelRead("Hotel Booking", "Data", 1, 5));	
	}
	@When("user enter check in date")
	public void user_enter_check_in_date() throws IOException {
		DropDownPage d = new DropDownPage();
		enterText(d.getCheckInDateDropDown(), excelRead("Hotel Booking", "Data", 1, 6));		
	}
	@When("user enter check out date")
	public void user_enter_check_out_date() throws IOException {
		DropDownPage d = new DropDownPage();
		enterText(d.getCheckOutDateDropDown(), excelRead("Hotel Booking", "Data", 1, 7));		
	}
	@When("user select adults per room")
	public void user_select_adults_per_room() throws IOException {
		DropDownPage d = new DropDownPage();
		selectDropDownByVisibleText(d.getAdultRoomDropDown(), excelRead("Hotel Booking", "Data", 1, 8));		
	}
	@When("user select child per room")
	public void user_select_child_per_room() throws IOException {
		DropDownPage d = new DropDownPage();
		selectDropDownByVisibleText(d.getChildperRoomDropDown(), excelRead("Hotel Booking", "Data", 1, 9));
	}
	@When("user click search button")
	public void user_click_search_button() {
		DropDownPage d = new DropDownPage();
		clickElement(d.getBtnSubmit());
	}
	@Then("user sees the title select hotel in the next page")
	public void user_sees_the_title_select_hotel_in_the_next_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Select Hotel ']")).isDisplayed());
	    
	}

}
