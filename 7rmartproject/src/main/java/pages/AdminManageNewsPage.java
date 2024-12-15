package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminManageNewsPage {
	WebDriver driver;

	public AdminManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement usernameField;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signin;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newnews;
	@FindBy(xpath = "//textarea[@placeholder='Enter the news']")
	private WebElement text;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alert;

	// forsecond method
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/delete?del=2136&page_ad=1']")
	private WebElement delete;

	public AdminManageNewsPage clickOnNew() {
		newnews.click();
		return this;
	}

	public AdminManageNewsPage enterText() {
		text.sendKeys("hello world");
		return this;
	}

	public AdminManageNewsPage clickOnSave() {
		save.click();
		return this;
	}

	public boolean alertIsDisplayed() {
		return alert.isDisplayed();
	}

	public AdminManageNewsPage clickOnDelete() {
		delete.click();
		return this;
	}

	public AdminManageNewsPage clickOnAlert() {
		driver.switchTo().alert().accept();
		return this;
	}
}
