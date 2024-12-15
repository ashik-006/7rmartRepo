package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//a[@data-toggle='dropdown']")private WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")private WebElement logout;
	@FindBy(xpath="//body[@class='login-page']")private WebElement displayed;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")private WebElement moreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement subcategory;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-contact']")private WebElement contact ;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")private WebElement footertext;
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']")private WebElement product;
	@FindBy(xpath="//a[@class='small-box-footer']")private WebElement adminusers;
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
	public void clickOnAdminIcon()
	{
		admin.click();
	}
	public void clickOnLogout()
	{
		logout.click();
	}
	public boolean  isPageDisplayed()
	{
		return displayed.isDisplayed();
	}
	public AdminManageNewsPage clickOnManageNews()
	{
		moreinfo.click();
		return new AdminManageNewsPage(driver);
	}
	public  SubCategoryPage  clickOnMoreInfo()
	{
		subcategory.click();
		return new SubCategoryPage(driver);
	}
	public ManageContactPage clickOnManageContact()
	{
		
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, contact);
		return new ManageContactPage(driver);
	}
	public ManageFooterTextPage clickOnFooterText()
	{
		footertext.click();
		return new ManageFooterTextPage(driver);
	}
	public AdminManageProductsPage clickOnProduct()
	{
		product.click();
		return new AdminManageProductsPage(driver);
	}
	public AdminPage clickOnAdminPage()
	{
		adminusers.click();
		return new AdminPage(driver);
	}
}
