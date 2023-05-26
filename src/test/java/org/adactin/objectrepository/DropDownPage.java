package org.adactin.objectrepository;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage extends Baseclass {
	public DropDownPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement locationDropDown;
	
	@FindBy(id="hotels")
	private WebElement hotelDropDown;
	
	@FindBy(id="room_type")
	private WebElement roomtypeDropDown;
	
	@FindBy(id="room_nos")
	private WebElement noOfRoomDropDown;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDateDropDown;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDateDropDown;
	
	@FindBy(id="adult_room")
	private WebElement adultRoomDropDown;
	
	@FindBy(id="child_room")
	private WebElement childperRoomDropDown;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getLocationDropDown() {
		return locationDropDown;
	}

	public WebElement getHotelDropDown() {
		return hotelDropDown;
	}

	public WebElement getRoomtypeDropDown() {
		return roomtypeDropDown;
	}

	public WebElement getNoOfRoomDropDown() {
		return noOfRoomDropDown;
	}

	public WebElement getCheckInDateDropDown() {
		return checkInDateDropDown;
	}

	public WebElement getCheckOutDateDropDown() {
		return checkOutDateDropDown;
	}

	public WebElement getAdultRoomDropDown() {
		return adultRoomDropDown;
	}

	public WebElement getChildperRoomDropDown() {
		return childperRoomDropDown;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
}
