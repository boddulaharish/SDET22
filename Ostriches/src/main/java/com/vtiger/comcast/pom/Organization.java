package com.vtiger.comcast.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization {

	WebDriver driver;
	public Organization(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Organizations")
	private WebElement OrgLink;

	public WebElement getOrgLink() {
		return OrgLink;
	}
	
	
}
