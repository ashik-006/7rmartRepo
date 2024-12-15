package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtilities;
import utilities.PageUtility;

public class SubCategoryPage 
{
WebDriver driver;
	
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement createnew;
	@FindBy(xpath="//select[@id='cat_id']")private WebElement category;
	@FindBy(xpath="//input[@id='subcategory']")private WebElement subcategory;
	@FindBy(xpath="//input[@name='main_img']")private WebElement image;
	@FindBy(xpath="//button[@type='submit']")private WebElement save;
	@FindBy(xpath="//i[@class='icon fas fa-check']")private WebElement alert;
	
	/*public void enterUserNameOnUserField(String usernamevaluepassing)
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
	}*/
	public SubCategoryPage clickOnNew()
	{
		createnew.click();
		return this;
	}
	public SubCategoryPage selectCategory()
	{
		PageUtility pageutility = new PageUtility();
		pageutility.selectByIndex(category, 2);
		return this;
	}
	public SubCategoryPage enterSubCategory(String subcategorypassing)
	{
		subcategory.sendKeys(subcategorypassing);
		return this;
	}
	public SubCategoryPage uploadImage()
	{
		FileUploadUtilities fileuploadutilities = new FileUploadUtilities();
		fileuploadutilities.fileuploadUsingSendkeys(image, Constants.Rice);
		return this;
	}
	public SubCategoryPage clickOnSave()
	{
		save.click();
		return this;
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		}
}
