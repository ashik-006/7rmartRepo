package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



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
	public LoginPage enterUserNameOnUserField(String usernamevaluepassing)
	{
		usernameField.sendKeys(usernamevaluepassing);
		return this;
	}
	public LoginPage enterPasswordOnPasswordField(String pwdpassing)
	{
		
		pwd.sendKeys(pwdpassing);
		return this;
	}
	public HomePage clickOnSignInButton()
	{
		signin.click();
		return new HomePage(driver);
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

