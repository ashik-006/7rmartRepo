package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage 
{
	WebDriver driver;
	public ManageFooterTextPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")private WebElement moreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")private WebElement action;
	@FindBy(xpath="//textarea[@id='content']")private WebElement address;
	@FindBy(xpath="//input[@name='email']")private WebElement email;
	@FindBy(xpath="//input[@id='phone']")private WebElement phoneno;
	@FindBy(xpath="//button[@type='submit']")private WebElement update;
	@FindBy(xpath="//i[@class='icon fas fa-check']")private WebElement alert;
	
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
		moreinfo.click();
	}
	public void clickOnAction()
	{
		action.click();
	}
	public void enterAddress(String addresspassing)
	{
		address.clear();
		address.sendKeys(addresspassing);
	}
	public void enterEmail(String emailpassing)
	{
		email.clear();
		email.sendKeys(emailpassing);
	}
	public void enterPhoneNo(String phonenopassing)
	{
		phoneno.clear();
		phoneno.sendKeys(phonenopassing);
	}
	public void clickOnUpdate()
	{
		update.click();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
	public boolean isUpdateDisplayed()
	{
		return update.isDisplayed();
	}
}
