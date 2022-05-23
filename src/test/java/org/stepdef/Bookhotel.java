package org.stepdef;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel extends Base {
	public Bookhotel() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="first_name"),@FindBy(name="first_name"),@FindBy(xpath="(//input[@class='reg_input'])[1]")})
	private WebElement Firstname;
	@FindAll({@FindBy(id="last_name"),@FindBy(name="last_name"),@FindBy(xpath="(//input[@class='reg_input'])[2]")})
	private WebElement lasttname;
	
	@FindAll({@FindBy(id="address"),@FindBy(name="address"),@FindBy(xpath="//textarea[@class='txtarea']")})
	private WebElement address;
	
	@FindAll({@FindBy(id="cc_num"),@FindBy(name="cc_num"),@FindBy(xpath="(//input[@class='reg_input'])[3]")})
	private WebElement creditcardno;
	@FindAll({@FindBy(id="cc_type"),@FindBy(name="cc_type"),@FindBy(xpath="//select[@class='select_combobox']")})
	private WebElement creditcardtype;
	@FindAll({@FindBy(id="cc_exp_month"),@FindBy(name="cc_exp_month"),@FindBy(xpath="(//select[@class='select_combobox2'])[1]")})
	private WebElement expirydatemonth;
	@FindAll({@FindBy(id="cc_exp_year"),@FindBy(name="cc_exp_year"),@FindBy(xpath="(//select[@class='select_combobox2'])[2]")})
	private WebElement expirydateyear;
	
	@FindAll({@FindBy(id="cc_cvv"),@FindBy(name="cc_cvv"),@FindBy(xpath="(//input[@class='reg_input'])[4]")})
	private WebElement cvvnumber;
	@FindAll({@FindBy(id="button"),@FindBy(name="button"),@FindBy(xpath="//input[@onclick='book_hotel_validate();']")})
	private WebElement booknow;
	@FindAll({@FindBy(id="order_no"),@FindBy(name="order_no")})
	private WebElement orderno;
	@FindAll({@FindBy(linkText="Booked Itinerary")})
	private WebElement BookedItinerary;
	@FindAll({@FindBy(id="order_id_text"),@FindBy(name="order_id_text")})     
	private WebElement orderidtext;
	
	@FindAll({@FindBy(xpath="(//input[@type='checkbox'])[2]"),@FindBy(xpath="(//input[@name='ids[]'])[1]")})
	private WebElement radiobuttonclick;
	@FindAll({@FindBy(id="cancelall"),@FindBy(name="cancelall")})
	private WebElement cancelall;
	@FindAll({@FindBy(id="search_hotel_id"),@FindBy(name="search_hotel_id")})
	private WebElement go;
	
	
	public WebElement getFirstname() {
		return Firstname;
	}
	public WebElement getLasttname() {
		return lasttname;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getCreditcardno() {
		return creditcardno;
	}
	public WebElement getCreditcardtype() {
		return creditcardtype;
	}
	public WebElement getExpirydatemonth() {
		return expirydatemonth;
	}
	public WebElement getExpirydateyear() {
		return expirydateyear;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getBookedItinerary() {
		return BookedItinerary;
	}
	public WebElement getorderidtext() {
		return orderidtext;
	}
	
	public WebElement getradiobuttonclick() {
		return radiobuttonclick;
	}
	public WebElement getcancelall() {
		return cancelall;
	}
	
	public WebElement getgo() {
		return go;
	}
	
}

