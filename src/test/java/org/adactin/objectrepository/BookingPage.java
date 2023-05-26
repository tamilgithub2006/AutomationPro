package org.adactin.objectrepository;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends Baseclass  {
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditcardNo;
	
	@FindBy(id="cc_type")
	private WebElement crediCardTypeDropDown;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonthDropDown;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYearDropDown;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCCVNo;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement txtOrderNo;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditcardNo() {
		return txtCreditcardNo;
	}

	public WebElement getCrediCardTypeDropDown() {
		return crediCardTypeDropDown;
	}

	public WebElement getExpiryMonthDropDown() {
		return expiryMonthDropDown;
	}

	public WebElement getExpiryYearDropDown() {
		return expiryYearDropDown;
	}

	public WebElement getTxtCCVNo() {
		return txtCCVNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	
	
}
