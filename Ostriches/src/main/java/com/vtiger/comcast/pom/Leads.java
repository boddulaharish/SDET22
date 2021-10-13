package com.vtiger.comcast.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vlion.GenericUtility.WebDriverUtility;

public class Leads extends WebDriverUtility {
	
	WebDriver driver;
	public Leads(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement leadImgBtn;
	
	@FindBy(linkText="abc_101")
	private WebElement textLinkclkck;
	
	@FindBy(name="search_text")
	private WebElement searchnox;
	
	@FindBy(name="search_field")
	private WebElement mouse;
	
	@FindBy(name="submit")
	private WebElement searchBtn;
	
	@FindBy(linkText="abc_81")
	private WebElement actlink;
	
	
	
	

	public WebElement getMouse() {
		return mouse;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getTextLinkclkck() {
		return textLinkclkck;
	}

	public WebElement getLeadImgBtn() {
		return leadImgBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchnox() {
		return searchnox;
		
		
	}

	public void moussss() {
		SelectOption(mouse, "Last Name");
		searchBtn.click();	
		
	}
	
		
	}


	
