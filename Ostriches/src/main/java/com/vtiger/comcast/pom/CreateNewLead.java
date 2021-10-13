package com.vtiger.comcast.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLead {
	
	WebDriver driver;
	public CreateNewLead(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(name="company")
	private WebElement compName;
	
	@FindBy(name="button")
	private WebElement saveBtn;

	@FindBy(name="button")
	private WebElement cancelBtn;
	
	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompName() {
		return compName;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	public void createLeadSave(String lastname, String compname) {
		lastName.sendKeys(lastname);
		compName.sendKeys(compname);
		saveBtn.click();
		
	}
	
	
}
