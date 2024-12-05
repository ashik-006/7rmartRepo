package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.Exel_utilities;

public class ManageFooterTextTest extends Base {
	@Test
	public void verifyUserIsAbleToUpdateFooterPage() throws IOException 
	{
		
		String usernamevalue = Exel_utilities.getStringData(1, 0, "Loginpage");
		String passwordvalue = Exel_utilities.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		String addressfield = Exel_utilities.getStringData(0, 1, "Footertextpage");
		String emailfield =Exel_utilities.getStringData(1, 1, "Footertextpage");
		String phonefield =Exel_utilities.getIntegerData(2, 1, "Footertextpage");
		ManageFooterTextPage managefootertextpage = new ManageFooterTextPage(driver);
		managefootertextpage.clickOnMoreInfo();
		managefootertextpage.clickOnAction();
		managefootertextpage.enterAddress(addressfield);
		managefootertextpage.enterEmail(emailfield);
		managefootertextpage.enterPhoneNo(phonefield);
		managefootertextpage.clickOnUpdate();
		boolean alertdis = managefootertextpage.isAlertDisplayed();
		Assert.assertTrue(alertdis, "ALERT IS NOT DISPLAYED");
	}

	@Test
	public void isUpdateDisplayed() throws IOException 
	{
		String usernamevalue = Exel_utilities.getStringData(1, 0, "Loginpage");
		String passwordvalue = Exel_utilities.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();

		ManageFooterTextPage managefootertextpage = new ManageFooterTextPage(driver);
		managefootertextpage.clickOnMoreInfo();
		managefootertextpage.clickOnAction();
		boolean ispresent = managefootertextpage.isUpdateDisplayed();
		Assert.assertTrue(ispresent, "Update button is not displayed");
	}
	
}
