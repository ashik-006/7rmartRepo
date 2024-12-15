package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Exel_utilities;

public class AdminTest extends Base {
	HomePage homepage;
	AdminPage adminpage;

	@Test
	public void verifyTheUserIsAbleToUpdate() throws IOException {
		// String usernamevalue="admin";
		// String passwordvalue="admin";

		String usernamevalue = Exel_utilities.getStringData(1, 0, "Loginpage");
		String passwordvalue = Exel_utilities.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		homepage = loginpage.clickOnSignInButton();
		adminpage= homepage.clickOnAdminPage();
		adminpage.clickOnEdit().enterUserName().enterPassword().enterUserType().clickOnUpdate();
		boolean updatealert = adminpage.isAlertDispalyed();
		Assert.assertTrue(updatealert, "ADMIN USER IS NOT UPDATED");

	}
}
