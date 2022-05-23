package org.stepdef;

import org.junit.Assert;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base {
	
	
	String attribute;
	
//invalid user name and valid password
@Given("user launch chrome browser")
public void userLaunchChromeBrowser() {
browserlaunch("chrome", "https://adactinhotelapp.com/index.php");    

}

@When("login enters username {string}and password {string}")
public void loginEntersUsernameAndPassword(String string, String string2) {
Login login = new Login();
WebElement username = login.getUsername();
passtext(username, string);
String attribute2 = attribute(username, "value");
Assert.assertNotEquals("aravinthvenkat", attribute2);
WebElement password = login.getPassword();
passtext(password, string2);

}

@When("click login button")
public void clickLoginButton() {
	Login login = new Login();
	WebElement login2 = login.getLogin();
	click(login2);
}

@Then("user verify home page")
public void userVerifyHomePage() {
System.out.println("invalid"); 
}
//valid username and password booking
@Given("user should launch chrome browser")
public void userShouldLaunchChromeBrowser() {
browserlaunch("chrome", "https://adactinhotelapp.com/index.php");  

}

@When("user enter valid username{string}and password{string}and location{string}and hotel {string}and roomtype{string}and number of rooms{string}and check in date {string}and check out date{string}and number of adult{string}number of children{string}and firstname{string} and lastname{string}and adress{string}and card number{string}and cardtype{string}and Cardexpirymonth{string}and cardexpiryyear{string}and cvv number {string} 	and")
public void userEnterValidUsernameAndPasswordAndLocationAndHotelAndRoomtypeAndNumberOfRoomsAndCheckInDateAndCheckOutDateAndNumberOfAdultNumberOfChildrenAndFirstnameAndLastnameAndAdressAndCardNumberAndCardtypeAndCardexpirymonthAndCardexpiryyearAndCvvNumberAnd(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) throws InterruptedException {
Login login = new Login();
WebElement username = login.getUsername();
passtext(username, string);
WebElement password = login.getPassword();
passtext(password, string2);
login.getLogin().click();
Searchhotel hotel = new Searchhotel();
WebElement location = hotel.getLocation();
drapdownvisiblebyvalue(location, string3);
WebElement hotels = hotel.getHotels();
drapdownvisiblebyvalue(hotels, string4);
WebElement roomtype = hotel.getRoomtype();
drapdownvisiblebyvalue(roomtype, string5);
WebElement numberofrooms = hotel.getNumberofrooms();
drapdownvisiblebyvalue(numberofrooms, string6);
WebElement checkindate = hotel.getCheckindate();
checkindate.clear();
passtext(checkindate, string7);
WebElement checkoutdate = hotel.getCheckoutdate();
checkoutdate.clear();
passtext(checkoutdate, string8);
WebElement adultperroom = hotel.getAdultperroom();
drapdownvisiblebyvalue(adultperroom, string9);
WebElement childrenperroom = hotel.getChildrenperroom();
drapdownvisiblebyvalue(childrenperroom, string10);
WebElement search = hotel.getSearch();
click(search);
SelectHotel select = new SelectHotel();
WebElement getradiobutton = select.getradiobutton();
click(getradiobutton);
WebElement continu = select.getContinu();
click(continu);
Bookhotel book = new Bookhotel();
WebElement firstname = book.getFirstname();
passtext(firstname, string11);
WebElement lasttname = book.getLasttname();
passtext(lasttname, string12);
WebElement address = book.getAddress();
passtext(address, string13);
WebElement creditcardno = book.getCreditcardno();
passtext(creditcardno, string14);
WebElement creditcardtype = book.getCreditcardtype();
drapdownvisiblebyvalue(creditcardtype, string15);
WebElement expirydatemonth = book.getExpirydatemonth();
drapdownvisiblebyvalue(expirydatemonth, string16);
WebElement expirydateyear = book.getExpirydateyear();
drapdownvisiblebyvalue(expirydateyear, string17);
Thread.sleep(2000);
WebElement cvvnumber = book.getCvvnumber();
passtext(cvvnumber, string18);
Thread.sleep(3000);


}

@When("user click the book now button")
public void userClickTheBookNowButton() {
   Bookhotel book = new Bookhotel();
   WebElement booknow = book.getBooknow();
   click(booknow);

}
//important field login
@Given("user chrome browser launch")
public void userChromeBrowserLaunch() {
browserlaunch("chrome", "https://adactinhotelapp.com/index.php");   
}

@When("user enter valid username{string}and password{string}and location{string}and number of rooms{string}and check in date {string}and check out date{string}and number of adult{string}and firstname{string} and lastname{string}and adress{string} and card number{string}and cardtype{string}and Cardexpirymonth{string}and cardexpiryyear{string}and cvv number{string} and user should click the book now button")
public void userEnterValidUsernameAndPasswordAndLocationAndNumberOfRoomsAndCheckInDateAndCheckOutDateAndNumberOfAdultAndFirstnameAndLastnameAndAdressAndCardNumberAndCardtypeAndCardexpirymonthAndCardexpiryyearAndCvvNumberAndUserShouldClickTheBookNowButton(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
 
	Login login = new Login();
	WebElement username = login.getUsername();
	passtext(username, string);
	WebElement password = login.getPassword();
	passtext(password, string2);
	login.getLogin().click();
	Searchhotel hotel = new Searchhotel();
	WebElement location = hotel.getLocation();
	drapdownvisiblebyvalue(location, string3);
	WebElement numberofrooms = hotel.getNumberofrooms();
	drapdownvisiblebyvalue(numberofrooms, string4);
	WebElement checkindate = hotel.getCheckindate();
	checkindate.clear();
	passtext(checkindate, string5);
	WebElement checkoutdate = hotel.getCheckoutdate();
	checkoutdate.clear();
	passtext(checkoutdate, string6);
	WebElement adultperroom = hotel.getAdultperroom();
	drapdownvisiblebyvalue(adultperroom, string7);
	WebElement search = hotel.getSearch();
	click(search);
	SelectHotel select = new SelectHotel();
	WebElement getradiobutton = select.getradiobutton();
	click(getradiobutton);
	WebElement continu = select.getContinu();
	click(continu);
	Bookhotel book = new Bookhotel();
	WebElement firstname = book.getFirstname();
	passtext(firstname, string8);
	WebElement lasttname = book.getLasttname();
	passtext(lasttname, string9);
	WebElement address = book.getAddress();
	passtext(address, string10);
	WebElement creditcardno = book.getCreditcardno();
	passtext(creditcardno, string11);
	Thread.sleep(2000);
	WebElement creditcardtype = book.getCreditcardtype();
	drapdownvisiblebyvalue(creditcardtype, string12);
	WebElement expirydatemonth = book.getExpirydatemonth();
	drapdownvisiblebyvalue(expirydatemonth, string13);
	WebElement expirydateyear = book.getExpirydateyear();
	drapdownvisiblebyvalue(expirydateyear, string14);
	WebElement cvvnumber = book.getCvvnumber();
	passtext(cvvnumber, string15);
	Thread.sleep(3000);
	book.getBooknow().click();
   
}
//validate booking and cancelling the order
@Given("user launch browser chrome home")
public void userLaunchBrowserChromeHome() {
	browserlaunch("chrome", "https://adactinhotelapp.com/index.php");
}

@When("user enter valid username{string}and password{string}and location{string}and hotel {string}and roomtype{string}and number of rooms{string}and check in date {string}and check out date{string}and number of adult{string}number of children{string}and firstname{string} and lastname{string}and adress{string}and card number{string}and cardtype{string}and Cardexpirymonth{string}and cardexpiryyear{string}and cvv number{string} and user click the book now button to book")
public void userEnterValidUsernameAndPasswordAndLocationAndHotelAndRoomtypeAndNumberOfRoomsAndCheckInDateAndCheckOutDateAndNumberOfAdultNumberOfChildrenAndFirstnameAndLastnameAndAdressAndCardNumberAndCardtypeAndCardexpirymonthAndCardexpiryyearAndCvvNumberAndUserClickTheBookNowButtonToBook(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) throws InterruptedException {

	Login login = new Login();
	WebElement username = login.getUsername();
	passtext(username, string);
	WebElement password = login.getPassword();
	passtext(password, string2);
	login.getLogin().click();
	Searchhotel hotel = new Searchhotel();
	WebElement location = hotel.getLocation();
	drapdownvisiblebyvalue(location, string3);
	WebElement hotels = hotel.getHotels();
	drapdownvisiblebyvalue(hotels, string4);
	WebElement roomtype = hotel.getRoomtype();
	drapdownvisiblebyvalue(roomtype, string5);
	WebElement numberofrooms = hotel.getNumberofrooms();
	drapdownvisiblebyvalue(numberofrooms, string6);
	WebElement checkindate = hotel.getCheckindate();
	checkindate.clear();
	
	passtext(checkindate, string7);
	WebElement checkoutdate = hotel.getCheckoutdate();
	checkoutdate.clear();
	
	passtext(checkoutdate, string8);
	WebElement adultperroom = hotel.getAdultperroom();
	drapdownvisiblebyvalue(adultperroom, string9);
	WebElement childrenperroom = hotel.getChildrenperroom();
	drapdownvisiblebyvalue(childrenperroom, string10);
	WebElement search = hotel.getSearch();
	click(search);
	SelectHotel select = new SelectHotel();
	WebElement getradiobutton = select.getradiobutton();
	click(getradiobutton);
	WebElement continu = select.getContinu();
	click(continu);
	Bookhotel book = new Bookhotel();
	WebElement firstname = book.getFirstname();
	passtext(firstname, string11);
	WebElement lasttname = book.getLasttname();
	passtext(lasttname, string12);
	WebElement address = book.getAddress();
	passtext(address, string13);
	WebElement creditcardno = book.getCreditcardno();
	passtext(creditcardno, string14);
	WebElement creditcardtype = book.getCreditcardtype();
	drapdownvisiblebyvalue(creditcardtype, string15);
	WebElement expirydatemonth = book.getExpirydatemonth();
	drapdownvisiblebyvalue(expirydatemonth, string16);
	WebElement expirydateyear = book.getExpirydateyear();
	drapdownvisiblebyvalue(expirydateyear, string17);
	Thread.sleep(2000);
	WebElement cvvnumber = book.getCvvnumber();
	passtext(cvvnumber, string18);
	Thread.sleep(3000);
	book.getBooknow().click();
	Thread.sleep(5000);
	WebElement orderno = book.getOrderno();
	 attribute = attribute(orderno, "value");

}

@Then("user copy the orderno")
public void userCopyTheOrderno() {
	
	Bookhotel hotel = new Bookhotel();
	WebElement bookedItinerary = hotel.getBookedItinerary();
	click(bookedItinerary);
	WebElement getorderidtext = hotel.getorderidtext();
	passtext(getorderidtext, attribute);
	hotel.getgo().click();
	WebElement getradiobuttonclick = hotel.getradiobuttonclick();
	click(getradiobuttonclick);

}

@When("click the bookeditineary")
public void clickTheBookeditineary() {
	Bookhotel book = new Bookhotel();
		WebElement getcancelall = book.getcancelall();
	click(getcancelall);
	alertok();
}
//checkincheckout

@Given("user  should launch chrome browser")
public void userShouldLaunchChromeBrowser1()  {
	browserlaunch("chrome", "https://adactinhotelapp.com/index.php");
	}

@When("user have to enter valid username{string}and password{string}and location{string}and hotel {string}and roomtype{string}and number of rooms{string}and check in date {string}and check out date{string}and number of adult{string}number of children{string}and firstname{string} and lastname{string}and adress{string}and card number{string}and cardtype{string}and Cardexpirymonth{string}and cardexpiryyear{string}and cvv number{string}")
public void userHaveToEnterValidUsernameAndPasswordAndLocationAndHotelAndRoomtypeAndNumberOfRoomsAndCheckInDateAndCheckOutDateAndNumberOfAdultNumberOfChildrenAndFirstnameAndLastnameAndAdressAndCardNumberAndCardtypeAndCardexpirymonthAndCardexpiryyearAndCvvNumber(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) throws InterruptedException {
	Login login = new Login();
	WebElement username = login.getUsername();
	passtext(username, string);
	WebElement password = login.getPassword();
	passtext(password, string2);
	login.getLogin().click();
	Searchhotel hotel = new Searchhotel();
	WebElement location = hotel.getLocation();
	drapdownvisiblebyvalue(location, string3);
	WebElement hotels = hotel.getHotels();
	drapdownvisiblebyvalue(hotels, string4);
	WebElement roomtype = hotel.getRoomtype();
	drapdownvisiblebyvalue(roomtype, string5);
	WebElement numberofrooms = hotel.getNumberofrooms();
	drapdownvisiblebyvalue(numberofrooms, string6);
	WebElement checkindate = hotel.getCheckindate();
	checkindate.clear();
	passtext(checkindate, string7);
	String attribute2 = attribute(checkindate, "value");
	Assert.assertNotEquals("17/05/2022", attribute2);
	WebElement checkoutdate = hotel.getCheckoutdate();
	checkoutdate.clear();
	passtext(checkoutdate, string8);
	String attribute3 = attribute(checkoutdate, "value");
	Assert.assertNotEquals("19/05/2022", attribute3);
	
	
	WebElement adultperroom = hotel.getAdultperroom();
	drapdownvisiblebyvalue(adultperroom, string9);
	WebElement childrenperroom = hotel.getChildrenperroom();
	drapdownvisiblebyvalue(childrenperroom, string10);
	WebElement search = hotel.getSearch();
	click(search);
	SelectHotel select = new SelectHotel();
	WebElement getradiobutton = select.getradiobutton();
	click(getradiobutton);
	WebElement continu = select.getContinu();
	click(continu);
	Bookhotel book = new Bookhotel();
	WebElement firstname = book.getFirstname();
	passtext(firstname, string11);
	WebElement lasttname = book.getLasttname();
	passtext(lasttname, string12);
	WebElement address = book.getAddress();
	passtext(address, string13);
	WebElement creditcardno = book.getCreditcardno();
	passtext(creditcardno, string14);
	WebElement creditcardtype = book.getCreditcardtype();
	drapdownvisiblebyvalue(creditcardtype, string15);
	WebElement expirydatemonth = book.getExpirydatemonth();
	drapdownvisiblebyvalue(expirydatemonth, string16);
	WebElement expirydateyear = book.getExpirydateyear();
	drapdownvisiblebyvalue(expirydateyear, string17);
	WebElement cvvnumber = book.getCvvnumber();
	passtext(expirydateyear, string18);
	Thread.sleep(3000);

   
}





//login and cancel order
@Given("user launch   chrome browser")
public void userLaunchChromeBrowser1() {
	browserlaunch("chrome", "https://adactinhotelapp.com/index.php");
}

@When("user enter valid  username{string}and valid password{string} for cancelation")
public void userEnterValidUsernameAndValidPasswordForCancelation(String string, String string2) throws InterruptedException {
	Login login = new Login();
	WebElement username = login.getUsername();
	passtext(username, string);
	WebElement password = login.getPassword();
	passtext(password, string2);
	WebElement login2 = login.getLogin();
	click(login2);
	Thread.sleep(5000);
}

@When("user should click the bookeditineary")
public void userShouldClickTheBookeditineary() throws InterruptedException {
Bookhotel hotel = new Bookhotel();
WebElement bookedItinerary = hotel.getBookedItinerary();
click(bookedItinerary);
Thread.sleep(2000);
WebElement getradiobuttonclick = hotel.getradiobuttonclick();
click(getradiobuttonclick);

}

@Then("cancel order")
public void cancelOrder() {
	Bookhotel hotel = new Bookhotel();
	WebElement getcancelall = hotel.getcancelall();
	click(getcancelall);
    alertok();

}
}
