package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.Exel_utilities;

public class SubCategoryTest extends Base
{
	HomePage homepage;
	SubCategoryPage subcategorypage;
	@Test
public void verifyUserIsAbleToCreateSubCategory() throws IOException
{
	String userval=Exel_utilities.getStringData(1, 0, "Loginpage");
    String passval=Exel_utilities.getStringData(1, 1, "Loginpage");
    String subcat=Exel_utilities.getStringData(0, 1, "Subcategory");
    
   /* SubCategoryPage subcategorypage=new SubCategoryPage(driver);
    subcategorypage.enterUserNameOnUserField(userval);
    subcategorypage.enterPasswordOnPasswordField(passval);
    subcategorypage.clickOnSignInButton();
    subcategorypage.clickOnMoreInfo();
    */
    LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserField(userval).enterPasswordOnPasswordField(passval);
	homepage = loginpage.clickOnSignInButton();
	subcategorypage = homepage.clickOnMoreInfo();
    subcategorypage.clickOnNew().selectCategory().enterSubCategory(subcat).uploadImage().clickOnSave(); 
    boolean alertdisplay = subcategorypage.isAlertDisplayed();
    Assert.assertTrue(alertdisplay,"ALERT IS NOT DISPLAYED");
    
    
}
}
