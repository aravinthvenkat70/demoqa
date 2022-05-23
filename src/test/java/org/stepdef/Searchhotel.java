package org.stepdef;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel extends Base{
	Base base = new Base();
	public Searchhotel() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(name="location"),@FindBy(xpath="(//select[@class='search_combobox'])[1]"),@FindBy(id="location")})
	private WebElement location;
	@FindAll({@FindBy(id="hotels"),@FindBy(xpath="(//select[@class='search_combobox'])[2]"),@FindBy(name="hotels")})
	private WebElement hotels;
	@FindAll({@FindBy(id="room_type"),@FindBy(name="room_type"),@FindBy(xpath="(//select[@class='search_combobox'])[3]")})
	private WebElement roomtype;
	@FindAll({@FindBy(id="room_nos"),@FindBy(name="room_nos"),@FindBy(xpath="(//select[@class='search_combobox'])[4]")})
	private WebElement numberofrooms;
	@FindAll({@FindBy(id="datepick_in"),@FindBy(name="datepick_in"),@FindBy(xpath="(//input[@class='date_pick'])[1]")})
	private WebElement checkindate;
	@FindAll({@FindBy(id="datepick_out"),@FindBy(name="datepick_out"),@FindBy(xpath="(//input[@class='date_pick'])[1]")})
	private WebElement checkoutdate;
	@FindAll({@FindBy(id="adult_room"),@FindBy(name="adult_room"),@FindBy(xpath="(//select[@class='search_combobox'])[5]")})
	private WebElement adultperroom;
	@FindAll({@FindBy(id="child_room"),@FindBy(name="child_room"),@FindBy(xpath="(//select[@class='search_combobox'])[6]")})
	private WebElement childrenperroom;
	@FindAll({@FindBy(id="submit"),@FindBy(name="submit"),@FindBy(xpath="(//input[@class='reg_button'])[1]")})
	private WebElement search;
	

	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNumberofrooms() {
		return numberofrooms;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getAdultperroom() {
		return adultperroom;
	}
	public WebElement getChildrenperroom() {
		return childrenperroom;
	}
	public WebElement getSearch() {
		return search;
	}
	@Test
	public void tc1() {
		WebElement location2 = getLocation();
		base.drapdown(location2, 2);
		WebElement hotels2 = getHotels();
		base.drapdown(hotels2, 2);
		WebElement roomtype2 = getRoomtype();
		base.drapdown(roomtype2, 2);
		WebElement numberofrooms2 = getNumberofrooms();
		base.drapdown(numberofrooms2, 2);
		
	}
	
}
