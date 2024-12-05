package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminPage;
import utilities.Exel_utilities;


public class AdminTest extends Base
{
	@Test
public void verifyTheUserIsAbleToUpdate() throws IOException
{
	//String usernamevalue="admin";
	//String passwordvalue="admin";
		
		String usernamevalue=Exel_utilities.getStringData(1, 0, "Loginpage");
        String passwordvalue=Exel_utilities.getStringData(1, 1, "Loginpage");
	
	AdminPage adminpage=new AdminPage(driver);
	adminpage.enterUserNameOnUserField(usernamevalue);
	adminpage.enterPasswordOnPasswordField(passwordvalue);
	adminpage.clickOnSignInButton();
	adminpage.clickOnMoreInfo();
	adminpage.clickOnEdit();
	adminpage.enterUserName();
	adminpage.enterPassword();
	adminpage.enterUserType();
	adminpage.clickOnUpdate();;
	boolean updatealert = adminpage.isAlertDispalyed();
	Assert.assertTrue(updatealert, "ADMIN USER IS NOT UPDATED");
	
}
}
