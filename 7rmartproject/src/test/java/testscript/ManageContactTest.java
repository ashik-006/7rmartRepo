package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;

import utilities.Exel_utilities;

public class ManageContactTest extends Base {
	@Test
	public void userIsAbleToUpdateContact() throws IOException {
		String usernamevalue = Exel_utilities.getStringData(1, 0, "Loginpage");
		String passwordvalue = Exel_utilities.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		//String phone = Exel_utilities.getStringData(0, 1, "Contactpage");
		String email = Exel_utilities.getStringData(1, 1, "Contactpage");
		String address = Exel_utilities.getStringData(2, 1, "Contactpage");
		String time = Exel_utilities.getStringData(3, 1, "Contactpage");
		String limit = Exel_utilities.getIntegerData(4, 1, "Contactpage");

		ManageContactPage managecontactpage = new ManageContactPage(driver);
		managecontactpage.clickOnMoreInfo();
		managecontactpage.clickOnAction();
		//managecontactpage.enterPhoneNo(phone);
		managecontactpage.enterEmail(email);
		managecontactpage.enterAddress(address);
		managecontactpage.enterTime(time);
		managecontactpage.enterLimit(limit);
		managecontactpage.clickOnUpdate();
		boolean alertdisplayed = managecontactpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed, "ALERT IS NOT DISPLAYED");

	}

	@Test
	public void checkWheatherUpdateButtonIsPresent() throws IOException {
		String user = Exel_utilities.getStringData(1, 0, "Loginpage");
		String pass = Exel_utilities.getStringData(1, 1, "Loginpage");

		ManageContactPage managecontactpage = new ManageContactPage(driver);
		managecontactpage.enterUserNameOnUserField(user);
		managecontactpage.enterPasswordOnPasswordField(pass);
		managecontactpage.clickOnSignInButton();
		managecontactpage.clickOnMoreInfo();
		managecontactpage.clickOnAction();
		boolean ispresent = managecontactpage.updateIsDisplayed();
		Assert.assertTrue(ispresent, "Update button is not displayed");
	}
}
