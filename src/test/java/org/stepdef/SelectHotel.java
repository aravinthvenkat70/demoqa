package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Base {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="radiobutton_0"),@FindBy(name="radiobutton_0"),@FindBy(xpath="//input[@type='radio']")})
	private WebElement radiobutton;
	@FindAll({@FindBy(id="continue"),@FindBy(name="continue"),@FindBy(xpath="//input[@value='continue']")})
	private WebElement continu;

	
	
	public WebElement getradiobutton() {
		return radiobutton;
	}
	public WebElement getContinu() {
		return continu;
	}
	

}
