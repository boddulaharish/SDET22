package testScript;

import org.testng.annotations.Test;

import com.crm.vlion.GenericUtility.BasaClass;
import com.vtiger.comcast.pom.CreateNewLead;
import com.vtiger.comcast.pom.CreateNewLeadInfo;
import com.vtiger.comcast.pom.Home;
import com.vtiger.comcast.pom.Leads;
import com.vtiger.comcast.pom.OrgInfo;

public class ConvertLeadToOpportunityTest extends BasaClass{

	@Test(groups = "smoketest")
	public void convertLeadToOpportunityTest() throws Throwable  {
		
		//read test data from excel sheet
		String lastNAME=eLib.getExcelData("Sheet2", 2, 1)+ "_" + jLib.getRandomData();
		String compNAME = eLib.getExcelData("Sheet2", 2, 2);
		
		//click on lead link
		Home hp = new Home(driver);
		hp.getLeadlnk().click();
		
		//click on ceate lead image
		Leads ld = new Leads(driver);
		ld.getLeadImgBtn().click();
		
		//enter the mandetory fields
		CreateNewLead cnl = new CreateNewLead(driver);
		cnl.createLeadSave(lastNAME, compNAME);
		
		hp.getLeadlnk().click();
		
		CreateNewLeadInfo cnli = new CreateNewLeadInfo(driver);
		cnli.dynamc(lastNAME);
		
		cnli.getConvertLinkClck().click();
		
		cnli.opportinityclck();
		
		
		 /*step 6 verify */
		  OrgInfo orgmsg = new OrgInfo(driver);
			 wLib.waitForElementVisibility(driver, orgmsg.getSuccfilMsg());
			 String actSucMsg = orgmsg.getSuccfilMsg().getText();
			 if(actSucMsg.contains(compNAME)) {
				 System.out.println("org is created successfully ===PASS");
			 }
			 else {
				 System.out.println("org is not created successfully ===FAIL");
			 }
		//validation
		/*OrgInfo orgI = new OrgInfo(driver);
		String actData = orgI.getSuccfilMsg().getText();
		
		System.out.println(actData);
		Assert.assertTrue(actData.contains(compNAME));*/
		
		
		
		
		
	}
}
