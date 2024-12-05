package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;

import utilities.Exel_utilities;

public class LoginTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,groups= {"regression"},description="logintest cases1")
	public void verifyTheUserIsAbleToLogInUsingValidCredentials() throws IOException
	{
		//String usernamevalue="admin";
		//String passwordvalue="admin";
		String usernamevalue=Exel_utilities.getStringData(1, 0, "Loginpage");
        String passwordvalue=Exel_utilities.getStringData(1, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean homepagedisplayed=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepagedisplayed,"Home page not loaded when user entered valid credentials");
		
	}
	@Test(retryAnalyzer=retry.Retry.class,groups= {"regression"},description="verifying user is able to login using invalid password")
	public void verifyTheUserIsAbleToLogInUsingInvalidPassword() throws IOException
	{
		//String usernamevalue="admin";
		//String passwordvalue="admi";
		String usernamevalue=Exel_utilities.getStringData(2, 0, "Loginpage");
        String passwordvalue=Exel_utilities.getStringData(2, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean alertdisplayed=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed,"Alert is not displayed");
	    
	}
	@Test
	public void verifyTheUserIsAbleToLogInUsingInvalidUsername() throws IOException
	{
		//String usernamevalue="admi";
		//String passwordvalue="admin";
		
		String usernamevalue=Exel_utilities.getStringData(3, 0, "Loginpage");
        String passwordvalue=Exel_utilities.getStringData(3, 1, "Loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean alertdisplayed=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed,"Alert is not displayed");
	}
	
	@Test
	public void verifyTheUserIsAbleToLogInUsingInvalidUsernameAndPassword() throws IOException
	{
		//String usernamevalue="admi";
		//String passwordvalue="admi";
		String usernamevalue=Exel_utilities.getStringData(4, 0, "Loginpage");
        String passwordvalue=Exel_utilities.getStringData(4, 1, "Loginpage");
		
		
        LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		boolean alertdisplayed = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed, "Alert is not displayed when entering invalid credentials");
		
		
	}
	@DataProvider(name = "LoginProvider")
	public Object[][] getDataFromTestData() throws IOException 
	{
		return new Object[][] { { Exel_utilities.getStringData(1, 6, "LoginPage"), Exel_utilities.getStringData(1, 7, "LoginPage") }};
}
	
}
