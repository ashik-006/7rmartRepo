package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adminpage 
{
WebDriver driver;
	
	public Adminpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//a[@class='small-box-footer']")private WebElement adminusers;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=10745&page_ad=1']")private WebElement editoption;
	@FindBy(xpath="//input[@id='username']")private WebElement username;
	@FindBy(xpath="//input[@id='password']")private WebElement passsword;
	@FindBy(xpath="//select[@id='user_type']")private WebElement usertype;
	@FindBy(xpath="//button[@name='Update']")private WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertdisplayed;
	public void enterUserNameOnUserField(String usernamevaluepassing)
	{
		usernameField.sendKeys(usernamevaluepassing);
	}
	public void enterPasswordOnPasswordField(String pwdpassing)
	{
		pwd.sendKeys(pwdpassing);
	}
	public void clickOnSignInButton()
	{
		signin.click();
	}
	public void clickOnMoreInfo()
	{
		adminusers.click();
	}
	public void clickOnEdit()
	{
		editoption.click();
	}
	public void enterUserName()
	{
		username.clear();
		username.sendKeys("Ashi");
	}
	public void enterPassword()
	{
		passsword.clear();
		passsword.sendKeys("123456789");
	}
	public void enterUserType()
	{
		Select selectingusertype = new Select(usertype);
		selectingusertype.selectByIndex(3);	
	}
	public void clickOnUpdate()
	{
		update.click();
	}
	public boolean isAlertDispalyed()
	{
		return alertdisplayed.isDisplayed();
	}

}
