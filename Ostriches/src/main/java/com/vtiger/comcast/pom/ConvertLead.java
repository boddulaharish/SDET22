package com.vtiger.comcast.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConvertLead {
	
	WebDriver driver;
	public ConvertLead(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@id='select_potential']")
private WebElement slpotential;

@FindBy(name="Save")
private WebElement saveBtn;

public WebDriver getDriver() {
	return driver;
}

public WebElement getSlpotential() {
	return slpotential;
}

public WebElement getSaveBtn() {
	return saveBtn;
}



public void opportinityclck() {
	slpotential.click();
}
}
