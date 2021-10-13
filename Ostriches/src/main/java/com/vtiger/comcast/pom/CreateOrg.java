package com.vtiger.comcast.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrg {


	WebDriver driver;
	public CreateOrg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createorgBtn;
	
	
	public WebElement getCreateorgBtn() {
		return createorgBtn;
	}
	
	
}
