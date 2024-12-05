package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminManageNewsPage;
import utilities.Exel_utilities;

public class AdminManageNewsTest extends Base
{
	@Test
public void verifyUserIsAbleToCreateNews() throws IOException
{
	String usernamevalue=Exel_utilities.getStringData(1, 0, "Loginpage");
    String passwordvalue=Exel_utilities.getStringData(1, 1, "Loginpage");
    
    AdminManageNewsPage adminmanagenewspage = new AdminManageNewsPage(driver);
    adminmanagenewspage.enterUserNameOnUserField(usernamevalue);
    adminmanagenewspage.enterPasswordOnPasswordField(passwordvalue);
    adminmanagenewspage.clickOnSignInButton();
    adminmanagenewspage.clickOnManageNews();
    adminmanagenewspage.clickOnNew();
    adminmanagenewspage.enterText();
    adminmanagenewspage.clickOnSave();
    boolean alertdisplayed=adminmanagenewspage.alertIsDisplayed();
    Assert.assertTrue(alertdisplayed,"ALERT IS NOT DISPLAYED");
}
	@Test
	public void verifyUserIsAbleToDeleteNews() throws IOException
	{
		String usernamevalue=Exel_utilities.getStringData(1, 0, "Loginpage");
	    String passwordvalue=Exel_utilities.getStringData(1, 1, "Loginpage");
	    
		AdminManageNewsPage adminmanagenewspage = new AdminManageNewsPage(driver);
	    adminmanagenewspage.enterUserNameOnUserField(usernamevalue);
	    adminmanagenewspage.enterPasswordOnPasswordField(passwordvalue);
	    adminmanagenewspage.clickOnSignInButton();
	    adminmanagenewspage.clickOnManageNews();
	    adminmanagenewspage.clickOnDelete();
	    adminmanagenewspage.clickOnAlert();
	 
	}
}
