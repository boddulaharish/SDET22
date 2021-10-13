package com.vtiger.comcast.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfo {

	WebDriver driver;


	public OrgInfo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement succfilMsg;
	
	@FindBy(id="dtlview_Last Name")
	private WebElement lastNamesuccesful;
	public WebElement getSuccfilMsg() {
		return succfilMsg;
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement covertLeadPop;
	@FindBy(xpath="(//td[@class='genHeaderSmall'])[2]")
	private WebElement convertLeadPopup;
	

	public WebElement getConvertLeadPopup() {
		return convertLeadPopup;
	}

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement succfilMssg;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSuccfilMssg() {
		return succfilMssg;
	}
	//public String txt=succfilMsg.getText();
	public WebElement getLastNamesuccesful() {
		// TODO Auto-generated method stub
		return lastNamesuccesful;
	}
	public WebElement getCovertLeadPop() {
		// TODO Auto-generated method stub
		return covertLeadPop;
	}
	
	
}
