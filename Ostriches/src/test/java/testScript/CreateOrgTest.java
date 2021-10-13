package testScript;

import org.junit.Assert;
import org.testng.annotations.Test;

public class CreateOrgTest {

	@Test(retryAnalyzer = com.crm.vlion.GenericUtility.RetryAnalyser.class)
	public void createOrgTest() {
		System.out.println("Org creation failed");
		Assert.fail();
	}
}
