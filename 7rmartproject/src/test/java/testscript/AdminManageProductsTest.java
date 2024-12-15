package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminManageProductsPage;
import pages.HomePage;
import pages.LoginPage;

import utilities.Exel_utilities;

public class AdminManageProductsTest extends Base {
	HomePage homepage;
	AdminManageProductsPage adminManageproductspage;
	@Test
	public void verifyUserIsAbleToCreateNewProduct() throws IOException
	{
		String usernamevalue = Exel_utilities.getStringData(1, 0, "Loginpage");
		String passwordvalue = Exel_utilities.getStringData(1, 1, "Loginpage");
		String title = Exel_utilities.getStringData(0, 1, "Productpage");
		String tag = Exel_utilities.getStringData(1, 1, "Productpage");
		String maxquantity =Exel_utilities.getIntegerData(3, 1, "Productpage");
		String price =Exel_utilities.getIntegerData(4, 1, "Productpage");
		String mrp =Exel_utilities.getIntegerData(5, 1, "Productpage");
		String stock=Exel_utilities.getIntegerData(6, 1, "Productpage");
		String purchase=Exel_utilities.getIntegerData(7, 1, "Productpage");
		String decription = Exel_utilities.getStringData(8, 1, "Productpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		homepage = loginpage.clickOnSignInButton();
		adminManageproductspage = homepage.clickOnProduct();
		adminManageproductspage.clickOnNewProduct().enterTitle(title).enterProductType().enterTag(tag).clickOnPriceType().selectMinPiece().enterMaxQ(maxquantity).enterPrice(price).enterMrp(mrp).enterStock(stock).enterPurchasePrice(purchase).enterDescription(decription).uploadMainImage().uploadSubImage().clickOnFeatured().clickOnCombo().clickOnSave();
		//adminManageproductspage.selectCategory();
		//adminManageproductspage.selectSubCategory();
		//adminManageproductspage.selectGroup();
		//adminManageproductspage.clickOnCheckbox();
		//adminManageproductspage.clickOnStockRadio();
		boolean alertdisplayed = adminManageproductspage.alertIsDisplayed();
		Assert.assertTrue(alertdisplayed, "ALERT IS NOT DISPLAYED");

	}
}
