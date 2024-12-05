package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.Exel_utilities;

public class HomeTest extends Base
{
	@Test
public void verifyUserIsAbleToLogout() throws IOException
{
	String usernamevalue=Exel_utilities.getStringData(1, 0, "Loginpage");
    String passwordvalue=Exel_utilities.getStringData(1, 1, "Loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserNameOnUserField(usernamevalue);
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	HomePage homepage=new HomePage(driver);
	homepage.clickOnAdminIcon();
	homepage.clickOnLogout();
	boolean pagedisplayed=homepage.isPageDisplayed();
	Assert.assertTrue(pagedisplayed,"loginpage is not displayed");
}
}
