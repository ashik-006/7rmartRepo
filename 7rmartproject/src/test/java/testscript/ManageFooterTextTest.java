package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;

import utilities.Exel_utilities;

public class ManageFooterTextTest extends Base {
	HomePage homepage;
	ManageFooterTextPage managefootertextpage;
	@Test
	public void verifyUserIsAbleToUpdateFooterPage() throws IOException 
	{
		
		String usernamevalue = Exel_utilities.getStringData(1, 0, "Loginpage");
		String passwordvalue = Exel_utilities.getStringData(1, 1, "Loginpage");
		String addressfield = Exel_utilities.getStringData(0, 1, "Footertextpage");
		String emailfield =Exel_utilities.getStringData(1, 1, "Footertextpage");
		String phonefield =Exel_utilities.getIntegerData(2, 1, "Footertextpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		homepage = loginpage.clickOnSignInButton();
		managefootertextpage = homepage.clickOnFooterText();
		managefootertextpage.clickOnAction().enterAddress(addressfield).enterEmail(emailfield).enterPhoneNo(phonefield).clickOnUpdate();
		boolean alertdis = managefootertextpage.isAlertDisplayed();
		Assert.assertTrue(alertdis, "ALERT IS NOT DISPLAYED");
	}

	@Test
	public void isUpdateDisplayed() throws IOException 
	{
		String usernamevalue = Exel_utilities.getStringData(1, 0, "Loginpage");
		String passwordvalue = Exel_utilities.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		homepage = loginpage.clickOnSignInButton();
		managefootertextpage= homepage.clickOnFooterText();
		managefootertextpage.clickOnAction();
		boolean ispresent = managefootertextpage.isUpdateDisplayed();
		Assert.assertTrue(ispresent, "Update button is not displayed");
	}
	
}
