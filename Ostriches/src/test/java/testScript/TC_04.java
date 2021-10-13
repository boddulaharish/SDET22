package testScript;

import org.testng.annotations.Test;

import com.crm.vlion.GenericUtility.BasaClass;
import com.vtiger.comcast.pom.ContactInfo;
import com.vtiger.comcast.pom.CreateNewLead;
import com.vtiger.comcast.pom.CreateNewLeadInfo;
import com.vtiger.comcast.pom.Home;
import com.vtiger.comcast.pom.Leads;

public class TC_04 extends BasaClass {

	@Test(groups = "regression")
	public void onlyContact() throws Throwable {
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
				cnli.OnlyContactCheckBox();
				
				
				
				ContactInfo contactInformation =  new ContactInfo(driver);
				 Thread.sleep(3000);
					// wLib.waitForElementVisibility(driver, orgmsg.getCovertLeadPop());
					 String actSucMsg = contactInformation.getContactInfoMsg().getText();
					 if(actSucMsg.contains(lastNAME)) {
						 System.out.println("contact is created successfully ===PASS");
					 }
					 else {
						 System.out.println("contact is not created successfully ===FAIL");
					 }
	}
	
}
