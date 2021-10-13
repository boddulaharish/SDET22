package com.vtiger.comcast.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	

	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="user_name")
	private WebElement userName_tb;
	
	@FindBy(name="user_password")
	private WebElement password_tb;
	
	@FindAll({@FindBy(id="submitButton"), @FindBy(xpath="//input[@value='Login']")})
	private WebElement login_btn;
	

	public WebElement getUserName_tb() {
		return userName_tb;
	}

	public WebElement getPassword_tb() {
		return password_tb;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}
	
	public void loginToApp(String userName, String password) {
		userName_tb.sendKeys(userName);
		password_tb.sendKeys(password);
		login_btn.click();
		
	}
}
