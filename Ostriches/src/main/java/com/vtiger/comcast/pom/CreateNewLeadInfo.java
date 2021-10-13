package com.vtiger.comcast.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vlion.GenericUtility.WebDriverUtility;

public class CreateNewLeadInfo {
	WebDriver driver;
	@FindBy(name="Save")
	private WebElement saveBtn;

   @FindBy(xpath="//span[@class='lvtHeaderText']")
   private WebElement scflMsg;
   
   @FindBy(linkText="Convert Lead")
   private WebElement convertLinkClck;
   
   //select potential
	@FindBy(xpath="//input[@id='select_potential']")
	private WebElement slpotential;
	
	@FindBy(name="closingdate")
	private WebElement calDate;
	//select organization
	@FindBy(id="select_account")
	private WebElement selectAcc;
	//select contact
	@FindBy(id="select_contact")
	private WebElement selectContact;
	
   public WebElement getCalDate() {
		return calDate;
	}

public CreateNewLeadInfo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConvertLinkClck() {
	return convertLinkClck;
}

	public WebElement getScflMsg() {
	return scflMsg;
}
	//dynamic xpath syntax
	public void dynamc(String lastname) {
		driver.findElement(By.xpath("//a[text()='"+lastname+"']")).click();
	}
	
	public WebElement getSlpotential() {
		return slpotential;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void opportinityclck() {
		slpotential.click();
		calDate.sendKeys("2021/10/07");
		saveBtn.click();
	}
	

	public WebElement getSelectAcc() {
		return selectAcc;
	}

	public WebElement getSelectContact() {
		return selectContact;
	}
	//click only organization
public void organization() {
	//selectAcc.click();
	selectContact.click();
	saveBtn.click();
	
	}
//for only opportunity click
public void newOpportunity() {
	selectAcc.click();
	slpotential.click();
	calDate.sendKeys("2021/10/07");
	selectContact.click();
	saveBtn.click();	
}
//only contact check box click
public void OnlyContactCheckBox() {
	selectAcc.click();
	saveBtn.click();

	
}
}
	
   

