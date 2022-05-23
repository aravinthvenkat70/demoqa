package org.stepdef;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base{
	Base base = new Base();
	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="username"),@FindBy(id="username"),@FindBy(xpath="(//input[@class='login_input'])[1]")})
	private WebElement username;
	@FindAll({@FindBy(id="password"),@FindBy(xpath="(//input[@class='login_input'])[2]")})
	private WebElement password;
	@FindAll({@FindBy(id="login"),@FindBy(id="login"),@FindBy(xpath="//input[@class='login_button']")})
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
}
