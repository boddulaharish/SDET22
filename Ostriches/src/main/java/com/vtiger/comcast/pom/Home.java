package com.vtiger.comcast.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText="Organizations")
	private WebElement organisationLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement imgClick;
	
	@FindBy(linkText="Sign Out")
	private WebElement singOut;
	@FindBy(linkText="Leads")
	private WebElement leadlnk;
	
	public WebElement getLeadlnk() {
		return leadlnk;
	}



	//For Lead Module Declaration
	@FindBy(linkText="Leads")
	private WebElement leadTxtlnk;
	
	//Lead getter method
	public WebElement getLeadTxtlnk() {
		return leadTxtlnk;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganisationLink() {
		return organisationLink;
	}
	
	public WebElement getImgClick() {
		return imgClick;
	}

	public WebElement getSingOut() {
		return singOut;
	}
	
	public void logout() {
		
		Actions act = new Actions(driver);
		act.moveToElement(imgClick).perform();
		singOut.click();
	}
	

	
}
