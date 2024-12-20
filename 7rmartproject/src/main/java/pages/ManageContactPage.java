package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class ManageContactPage 
{
	WebDriver driver;
	public ManageContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	//@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-contact']")private WebElement moreinfo ;
	@FindBy(xpath="//i[@class='fas fa-edit']")private WebElement action;
	@FindBy(xpath="//input[@id='phone']")private WebElement phone;
	@FindBy(xpath="//input[@id='email']")private WebElement email ;
	@FindBy(xpath="//textarea[@placeholder='Enter the Address']")private WebElement address;
	@FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']")private WebElement time;
	@FindBy(xpath="//input[@id='del_limit']")private WebElement limit;
	@FindBy(xpath="//button[@type='submit']")private WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
	
	
	public ManageContactPage clickOnAction()
	{
		action.click();
		return this;
	}
	public ManageContactPage enterPhoneNo(String phonenopassing)
	{
		phone.clear();
		phone.sendKeys(phonenopassing);
		return this;
	}
	public ManageContactPage enterEmail(String emailpassing)
	{
		email.clear();
		email.sendKeys(emailpassing);
		return this;
	}
	public ManageContactPage enterAddress(String addresspassing)
	{
		address.clear();
		address.sendKeys(addresspassing);
		return this;
	}
	public ManageContactPage enterTime(String timepassing)
	{
		time.clear();
		time.sendKeys(timepassing);
		return this;
	}
	public ManageContactPage enterLimit(String limitpassing)
	{
		limit.clear();
		limit.sendKeys(limitpassing);
		return this;
	}
	public ManageContactPage clickOnUpdate()
	{
		update.click();
		return this;
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
	public boolean updateIsDisplayed()
	{
		return update.isDisplayed();
	}
}
