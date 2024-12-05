package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import constants.Constants;
import utilities.FileUploadUtilities;
import utilities.PageUtility;
import utilities.WaitUtilities;

public class AdminManageProductsPage
{
WebDriver driver;
	
	public AdminManageProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']")private WebElement product;
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']")private WebElement product;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newproduct;
	@FindBy(xpath="//input[@placeholder='Enter the Title']")private WebElement title;
	@FindBy(xpath="//input[@value='Nonveg' and @type='radio']")private WebElement producttyperadio;
	@FindBy(xpath="//input[@id='tag']")private WebElement tag;
	@FindBy(xpath="//select[@id='cat_id']")private WebElement category;
	@FindBy(xpath="//select[@id='sub_id']")private WebElement subcategory;
	@FindBy(xpath="//select[@id='grp_id']")private WebElement group;
	@FindBy(xpath="//input[@id='purpose1']")private WebElement pricetype;
	@FindBy(xpath="//select[@name='p_minimum']")private WebElement minpiece;
	
	@FindBy(xpath="//input[@id='p_max']")private WebElement maxq;
	@FindBy(xpath="//input[@id='p_price']")private WebElement price;
	@FindBy(xpath="//input[@id='p_mrp']")private WebElement mrp;
	@FindBy(xpath="//input[@id='p_stock']")private WebElement stock;
	@FindBy(xpath="//input[@id='p_pp']")private WebElement purchaseprice;
	@FindBy(xpath="//input[@name='unlimitw[]']")private WebElement checkbox;
	@FindBy(xpath="//div[@role='textbox']")private WebElement description;
	@FindBy(xpath="//input[@name='unlimitw[]']")private WebElement stockradio;
	@FindBy(xpath="//input[@id='main_img']")private WebElement mainimage;
	@FindBy(xpath="//input[@id='main_imgs']")private WebElement subimage;
	@FindBy(xpath="//input[@value='yes' and @name='featured']")private WebElement featured;
	@FindBy(xpath="//input[@value='yes' and @name='combo']")private WebElement combo;
	@FindBy(xpath="//button[@type='submit']")private WebElement save;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement alert;
	
	
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
	public void clickOnProduct()
	{
		product.click();
	}
	public void clickOnNewProduct() 
	{
		newproduct.click();
	}
	public void enterTitle(String titlepassing)
	{
		title.sendKeys(titlepassing);
	}
	public void enterProductType()
	{
		//producttyperadio.click();
		//WaitUtilities object= new WaitUtilities();
		//object.waitForElement(driver, producttyperadio);
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, producttyperadio);

	}
	public void enterTag(String tagpassing)
	{
		tag.sendKeys(tagpassing);
	}
	public void selectCategory()
	{
		
	}
	public void selectSubCategory()
	{
		
	}
	public void selectGroup()
	{
		//Select groupname = new Select(group);
		//groupname.selectByVisibleText("discount");
		PageUtility pageutility = new PageUtility();
		pageutility.selectByVisibleText(group, "discount");
	}
	public void clickOnPriceType()
	{
		pricetype.click();
	}
	public void selectMinPiece()
	{
		PageUtility pageutility = new PageUtility();
		pageutility.selectByIndex(minpiece, 3);
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, minpiece);
	}
	
	public void enterMaxQ(String maxpasing)
	{
		maxq.sendKeys(maxpasing);
	}
	public void enterPrice(String pricepassing)
	{
		price.sendKeys(pricepassing);
	}
	public void enterMrp(String mrppassing)
	{
		mrp.sendKeys(mrppassing);
	}
	public void enterStock(String stockpassing)
	{
		stock.sendKeys(stockpassing);
	}
	public void enterPurchasePrice(String prchasepricepassing)
	{
		purchaseprice.sendKeys(prchasepricepassing);
	}
	public void clickOnCheckbox()
	{
		//checkbox.click();
		PageUtility pageutility = new PageUtility();
		pageutility.doubleClick(checkbox, driver);
	}
	public void enterDescription(String descriptionpassing)
	{
		description.sendKeys(descriptionpassing);
	}
	public void clickOnStockRadio()
	{
		//stockradio.click();
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, stockradio);
	}
	public void uploadMainImage()
	{
		FileUploadUtilities fileuploadutilities = new FileUploadUtilities();
		fileuploadutilities.fileuploadUsingSendkeys(mainimage,Constants.Meat1);
	}
	public void uploadSubImage()
	{
		FileUploadUtilities fileuploadutilities = new FileUploadUtilities();
		fileuploadutilities.fileuploadUsingSendkeys(subimage, Constants.Meat2);
	}
	public void clickOnFeatured()
	{
		//featured.click();
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, featured);
	}
	public void clickOnCombo()
	{
		//combo.click();
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, combo);
	}
	public void clickOnSave()
	{
		//save.click();
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, save);
	}
	public boolean alertIsDisplayed()
	{
		return alert.isDisplayed();
	}
}
