package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.vlion.GenericUtility.ExcelUtility;
import com.crm.vlion.GenericUtility.FileUtility;
import com.crm.vlion.GenericUtility.JavaUtility;
import com.crm.vlion.GenericUtility.WebDriverUtility;
import com.vtiger.comcast.pom.ConvertLead;
import com.vtiger.comcast.pom.CreateNewLead;
import com.vtiger.comcast.pom.CreateNewLeadInfo;
import com.vtiger.comcast.pom.Home;
import com.vtiger.comcast.pom.Leads;
import com.vtiger.comcast.pom.Login;
import com.vtiger.comcast.pom.OrgInfo;

public class TC_03ConvertLeadToOpertunitiesBySelectingOnlyOrganisationChekboxsAndFeelAllTheMandatoryFields {

	@Test
	public void ConvertLeadToOpertunitiesBySelectingOnlyOrganisationChekboxsAndFeelAllTheMandatoryFields() throws Throwable{
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
	String lastname = eLib.getExcelData("Sheet2", 2, 1) + "_" + jLib.getRandomData();
	String comname = eLib.getExcelData("Sheet2", 2, 2);
	//String date = eLib.getExcelData("Sheet2", 2, 3);  
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
	  cnl.createLeadSave(lastname, comname);
	  Thread.sleep(3000);
	  //hp.getLeadTxtlnk().click();
	  
	  //led.getTextLinkclkck().click();
	  
	  
	  Thread.sleep(3000);
	  hp.getLeadlnk().click();
	  
	  //led.getSearchnox().sendKeys(lastname);
	  //led.moussss();
	CreateNewLeadInfo cnli = new CreateNewLeadInfo(driver);
	 cnli.dynamc(lastname);
	 cnli.getConvertLinkClck().click();
	ConvertLead cnld = new ConvertLead(driver);
	
	wLib.waitForElementVisibility(driver, cnli.getSelectAcc());
	  cnli.organization();
	  
	  wLib.pressEnterKey();
	 
	  
	 
	 /*step 6 verify */
	  OrgInfo orgmsg = new OrgInfo(driver);
	 Thread.sleep(3000);
		// wLib.waitForElementVisibility(driver, orgmsg.getCovertLeadPop());
		// String actSucMsg = orgmsg.getCovertLeadPop().getText();
	 String actSucMsg = orgmsg.getConvertLeadPopup().getText();
	 if(actSucMsg.contains(lastname)) {
			 System.out.println("org is created successfully ===PASS");
		 }
		 else {
			 System.out.println("org is not created successfully ===FAIL");
		 }
	  //wLib.waitForElementVisibility(driver, succ.getScflMsg());
	  
	  /* step 7 logout */
	  //Thread.sleep(3000);
	 // wLib.waitForElementVisibility(driver,hp.getSingOut());
	   hp.logout();
	   
	   /* step8 close the browser */
	  driver.close();
	}

	}


