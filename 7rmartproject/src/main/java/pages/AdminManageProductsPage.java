package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import constants.Constants;
import utilities.FileUploadUtilities;
import utilities.PageUtility;


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
	
	
	public AdminManageProductsPage clickOnNewProduct() 
	{
		newproduct.click();
		return this;
	}
	public AdminManageProductsPage enterTitle(String titlepassing)
	{
		title.sendKeys(titlepassing);
		return this;
		
	}
	public AdminManageProductsPage enterProductType()
	{
		//producttyperadio.click();
		//WaitUtilities object= new WaitUtilities();
		//object.waitForElement(driver, producttyperadio);
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, producttyperadio);
		return this;

	}
	public AdminManageProductsPage enterTag(String tagpassing)
	{
		tag.sendKeys(tagpassing);
		return this;
	}
	public void selectCategory()
	{
		
	}
	public void selectSubCategory()
	{
		
	}
	public AdminManageProductsPage selectGroup()
	{
		//Select groupname = new Select(group);
		//groupname.selectByVisibleText("discount");
		PageUtility pageutility = new PageUtility();
		pageutility.selectByVisibleText(group, "discount");
		return this;
	}
	public AdminManageProductsPage clickOnPriceType()
	{
		pricetype.click();
		return this;
	}
	public AdminManageProductsPage selectMinPiece()
	{
		PageUtility pageutility = new PageUtility();
		pageutility.selectByIndex(minpiece, 3);
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, minpiece);
		return this;
	}
	
	public AdminManageProductsPage enterMaxQ(String maxpasing)
	{
		maxq.sendKeys(maxpasing);
		return this;
	}
	public AdminManageProductsPage enterPrice(String pricepassing)
	{
		price.sendKeys(pricepassing);
		return this;
	}
	public AdminManageProductsPage enterMrp(String mrppassing)
	{
		mrp.sendKeys(mrppassing);
		return this;
	}
	public AdminManageProductsPage enterStock(String stockpassing)
	{
		stock.sendKeys(stockpassing);
		return this;
	}
	public AdminManageProductsPage enterPurchasePrice(String prchasepricepassing)
	{
		purchaseprice.sendKeys(prchasepricepassing);
		return this;
	}
	public AdminManageProductsPage clickOnCheckbox()
	{
		//checkbox.click();
		PageUtility pageutility = new PageUtility();
		pageutility.doubleClick(checkbox, driver);
		return this;
	}
	public AdminManageProductsPage enterDescription(String descriptionpassing)
	{
		description.sendKeys(descriptionpassing);
		return this;
	}
	public AdminManageProductsPage clickOnStockRadio()
	{
		//stockradio.click();
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, stockradio);
		return this;
	}
	public AdminManageProductsPage uploadMainImage()
	{
		FileUploadUtilities fileuploadutilities = new FileUploadUtilities();
		fileuploadutilities.fileuploadUsingSendkeys(mainimage,Constants.Meat1);
	return this;
	}
	public AdminManageProductsPage uploadSubImage()
	{
		FileUploadUtilities fileuploadutilities = new FileUploadUtilities();
		fileuploadutilities.fileuploadUsingSendkeys(subimage, Constants.Meat2);
	return this;
	}
	public AdminManageProductsPage clickOnFeatured()
	{
		//featured.click();
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, featured);
		return this;
	}
	public AdminManageProductsPage clickOnCombo()
	{
		//combo.click();
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, combo);
		return this;
	}
	public AdminManageProductsPage clickOnSave()
	{
		//save.click();
		PageUtility obj=new PageUtility();
		obj.javaSriptClick(driver, save);
		return this;
	}
	public boolean alertIsDisplayed()
	{
		return alert.isDisplayed();
	}
}
