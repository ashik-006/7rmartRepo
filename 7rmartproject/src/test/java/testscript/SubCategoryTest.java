package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SubCategoryPage;
import utilities.Exel_utilities;

public class SubCategoryTest extends Base
{
	@Test
public void verifyUserIsAbleToCreateSubCategory() throws IOException
{
	String userval=Exel_utilities.getStringData(1, 0, "Loginpage");
    String passval=Exel_utilities.getStringData(1, 1, "Loginpage");
    String subcat=Exel_utilities.getStringData(0, 1, "Subcategory");
    
    SubCategoryPage subcategorypage=new SubCategoryPage(driver);
    subcategorypage.enterUserNameOnUserField(userval);
    subcategorypage.enterPasswordOnPasswordField(passval);
    subcategorypage.clickOnSignInButton();
    subcategorypage.clickOnMoreInfo();
    subcategorypage.clickOnNew();
    subcategorypage.selectCategory();
    subcategorypage.enterSubCategory(subcat);
    subcategorypage.uploadImage();
    subcategorypage.clickOnSave();
    boolean alertdisplay = subcategorypage.isAlertDisplayed();
    Assert.assertTrue(alertdisplay,"ALERT IS NOT DISPLAYED");
    
    
}
}
