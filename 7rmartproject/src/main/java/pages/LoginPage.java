package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LoginPage 
{
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboardvalue;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement alerts;
	public void enterUserNameOnUserField(String usernamevaluepassing)
	{
		//PageUtility page=new PageUtility();
		//page.javaSriptClick(driver, usernameField);
		usernameField.sendKeys(usernamevaluepassing);
	}
	public void enterPasswordOnPasswordField(String pwdpassing)
	{
		//PageUtility page=new PageUtility();
		//page.javaSriptClick(driver, pwd);
		pwd.sendKeys(pwdpassing);
	}
	public void clickOnSignInButton()
	{
		//PageUtility page=new PageUtility();
		//page.javaSriptClick(driver, signin);
		signin.click();
	}
	public boolean isHomePageDisplayed()
	{
		return dashboardvalue.isDisplayed();
	}
	public boolean isAlertDisplayed()
	{
		return alerts.isDisplayed();
		
	}
}

