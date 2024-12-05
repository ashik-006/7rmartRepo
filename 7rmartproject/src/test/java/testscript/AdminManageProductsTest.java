package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminManageProductsPage;
import pages.LoginPage;
import utilities.Exel_utilities;

public class AdminManageProductsTest extends Base {
	@Test
	public void verifyUserIsAbleToCreateNewProduct() throws IOException
	{
		String usernamevalue = Exel_utilities.getStringData(1, 0, "Loginpage");
		String passwordvalue = Exel_utilities.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();

		String title = Exel_utilities.getStringData(0, 1, "Productpage");
		String tag = Exel_utilities.getStringData(1, 1, "Productpage");
		String maxquantity =Exel_utilities.getIntegerData(3, 1, "Productpage");
		String price =Exel_utilities.getIntegerData(4, 1, "Productpage");
		String mrp =Exel_utilities.getIntegerData(5, 1, "Productpage");
		String stock=Exel_utilities.getIntegerData(6, 1, "Productpage");
		String purchase=Exel_utilities.getIntegerData(7, 1, "Productpage");
		String decription = Exel_utilities.getStringData(8, 1, "Productpage");

		AdminManageProductsPage adminManageproductspage = new AdminManageProductsPage(driver);
		adminManageproductspage.clickOnProduct();
		adminManageproductspage.clickOnNewProduct();
		adminManageproductspage.enterTitle(title);
		adminManageproductspage.enterProductType();
		adminManageproductspage.enterTag(tag);
		//adminManageproductspage.selectCategory();
		//adminManageproductspage.selectSubCategory();
		//adminManageproductspage.selectGroup();
		adminManageproductspage.clickOnPriceType();
		adminManageproductspage.selectMinPiece();
		adminManageproductspage.enterMaxQ(maxquantity);
		adminManageproductspage.enterPrice(price);
		adminManageproductspage.enterMrp(mrp);
		adminManageproductspage.enterStock(stock);
		adminManageproductspage.enterPurchasePrice(purchase);
		//adminManageproductspage.clickOnCheckbox();
		adminManageproductspage.enterDescription(decription);
		//adminManageproductspage.clickOnStockRadio();
		adminManageproductspage.uploadMainImage();
		adminManageproductspage.uploadSubImage();
		adminManageproductspage.clickOnFeatured();
		adminManageproductspage.clickOnCombo();
		adminManageproductspage.clickOnSave();
		boolean alertdisplayed = adminManageproductspage.alertIsDisplayed();
		Assert.assertTrue(alertdisplayed, "ALERT IS NOT DISPLAYED");

	}
}
