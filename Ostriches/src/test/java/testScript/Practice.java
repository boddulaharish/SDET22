package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vlion.GenericUtility.FileUtility;
import com.crm.vlion.GenericUtility.JavaUtility;
import com.crm.vlion.GenericUtility.WebDriverUtility;

public class Practice {
     @Test
public void hidden() throws Throwable {
    	 FileUtility fLib = new FileUtility();
	     WebDriverUtility wLib = new WebDriverUtility();
	     WebDriver driver = new ChromeDriver();
	     
	     String URL = fLib.getPropertyKeyValue("url1");
	     driver.manage().window().maximize();
		    driver.get(URL);
		    wLib.waitUntilPageLoad(driver);
		  WebElement ele = driver.findElement(By.id("toolTipButton"));
		  wLib.mouseOver(driver, ele);
		   String tool = driver.findElement(By.xpath("//div[text()='You hovered over the Button']")).getText();
		   driver.findElement(By.id("toolTipTextField")).sendKeys(tool);
		   System.out.println(tool);
		   Thread.sleep(3000);
		   driver.close();
     }
}
