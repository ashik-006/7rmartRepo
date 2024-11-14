package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpage;

public class Logintest extends Base
{
	@Test
	public void VerifyTheUserIsAbleToLogInUsingValidCredentials()
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean homepagedisplayed=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepagedisplayed,"Home page not loaded when user entered valid credentials");
		
	}
	@Test
	public void VerifyTheUserIsAbleToLogInUsingInvalidPassword()
	{
		String usernamevalue="admin";
		String passwordvalue="admi";
		
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean alertdisplayed=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed,"Alert is not displayed");
	    
	}
	@Test
	public void VerifyTheUserIsAbleToLogInUsingInvalidUsername()
	{
		String usernamevalue="admi";
		String passwordvalue="admin";
		
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean alertdisplayed=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed,"Alert is not displayed");
	}
	
	
}
