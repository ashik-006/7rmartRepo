package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpage;
import utilities.Exel_utilities;

public class Logintest extends Base
{
	@Test
	public void VerifyTheUserIsAbleToLogInUsingValidCredentials() throws IOException
	{
		//String usernamevalue="admin";
		//String passwordvalue="admin";
		String usernamevalue=Exel_utilities.getStringData(1, 0, "Loginpage");
        String passwordvalue=Exel_utilities.getStringData(1, 1, "Loginpage");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean homepagedisplayed=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepagedisplayed,"Home page not loaded when user entered valid credentials");
		
	}
	@Test
	public void VerifyTheUserIsAbleToLogInUsingInvalidPassword() throws IOException
	{
		//String usernamevalue="admin";
		//String passwordvalue="admi";
		String usernamevalue=Exel_utilities.getStringData(2, 0, "Loginpage");
        String passwordvalue=Exel_utilities.getStringData(2, 2, "Loginpage");
		
		
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean alertdisplayed=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed,"Alert is not displayed");
	    
	}
	@Test
	public void VerifyTheUserIsAbleToLogInUsingInvalidUsername() throws IOException
	{
		//String usernamevalue="admi";
		//String passwordvalue="admin";
		
		String usernamevalue=Exel_utilities.getStringData(3, 0, "Loginpage");
        String passwordvalue=Exel_utilities.getStringData(3, 3, "Loginpage");
		
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean alertdisplayed=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed,"Alert is not displayed");
	}
	
	@Test
	public void VerifyTheUserIsAbleToLogInUsingInvalidUsernameAndPassword() throws IOException
	{
		//String usernamevalue="admi";
		//String passwordvalue="admi";
		String usernamevalue=Exel_utilities.getStringData(4, 0, "Loginpage");
        String passwordvalue=Exel_utilities.getStringData(4, 4, "Loginpage");
		
		
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean alertdisplayed = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed, "Alert is not displayed when entering invalid credentials");
		
		
	}
	
}
