package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Adminpage;

public class Admintest extends Base
{
	@Test
public void verifyTheUserIsAbleToUpdate()
{
	String usernamevalue="admin";
	String passwordvalue="admin";
	
	Adminpage adminpage=new Adminpage(driver);
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
