package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.vlion.GenericUtility.ExcelUtility;
import com.crm.vlion.GenericUtility.FileUtility;
import com.crm.vlion.GenericUtility.JavaUtility;
import com.crm.vlion.GenericUtility.WebDriverUtility;
import com.vtiger.comcast.pom.CreateNewLead;
import com.vtiger.comcast.pom.CreateNewLeadInfo;
import com.vtiger.comcast.pom.CreateNewOrg;
import com.vtiger.comcast.pom.CreateOrg;
import com.vtiger.comcast.pom.Home;
import com.vtiger.comcast.pom.Leads;
import com.vtiger.comcast.pom.Login;
import com.vtiger.comcast.pom.OrgInfo;

public class TC_01blankFieldsAndCancel {
	
	public static void main(String[] args) throws Throwable {
		/* create Objects */
		ExcelUtility eLib = new ExcelUtility();
		FileUtility fLib = new FileUtility();
	     JavaUtility jLib = new JavaUtility();
	     WebDriverUtility wLib = new WebDriverUtility();
	     WebDriver driver = null;
	     
	     /*create common data*/
	     String BROWSER = fLib.getPropertyKeyValue("browser");
	    String URL = fLib.getPropertyKeyValue("url");
	    String USERNAME = fLib.getPropertyKeyValue("username");
	    String PASSWORD = fLib.getPropertyKeyValue("password");
	   
	     
	     /* read TestData */
	//String orgName = eLib.getExcelData("Sheet1", 1, 3) + "_" + jLib.getRandomData();
	    
	    /* Step 1 : Launch the Browser */
	    if(BROWSER.equals("chrome")) {
	    	driver=new ChromeDriver();
	    }
	    else{
	    	driver=new FirefoxDriver();
	    }
	    
	    /* step2: login to App*/
	    driver.manage().window().maximize();
	    driver.get(URL);
	   
	   Login lp = new Login(driver);
	   lp.loginToApp(USERNAME, PASSWORD);
	   
	   /* step 3: navigate to lead  */
	   Home hp = new Home(driver);
	     hp.getLeadTxtlnk().click();
	   
	   /*step4 navigate to create lead page */
	   Leads led = new Leads(driver);
	   led.getLeadImgBtn().click();
	   
	   /* step 5 create new lead */
	  CreateNewLead cnl = new CreateNewLead(driver);
	  cnl.getCancelBtn().click();

	  wLib.pressEnterKey();
	 
	 /*step 6 verify */
	 // CreateNewLeadInfo succ = new CreateNewLeadInfo(driver);
	  //wLib.waitForElementVisibility(driver, succ.getScflMsg());
	  
	  
	// OrgInfo orgmsg = new OrgInfo(driver);
	
	  /* step 7 logout */
	  Thread.sleep(3000);
	 // wLib.waitForElementVisibility(driver,hp. getSingOut());
	   hp.logout();
	   
	   /* step8 close the browser */
	   //driver.close();
	}         
}
