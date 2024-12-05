package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminManageNewsPage 
{
WebDriver driver;
	
	public AdminManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")private WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newnews;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")private WebElement text;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
	
	//forsecond method
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/delete?del=2136&page_ad=1']")private WebElement delete;
	
	
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
	public void clickOnManageNews()
	{
		moreinfo.click();
	}
	public void clickOnNew()
	{
		newnews.click();
	}
	public void enterText()
	{
		text.sendKeys("hello world");
	}
	public void clickOnSave()
	{
		save.click();
	}
	public boolean alertIsDisplayed()
	{
		return alert.isDisplayed();
	}
	public void clickOnDelete()
	{
		delete.click();
	}
	public void clickOnAlert()
	{
		driver.switchTo().alert().accept();
	}
}
