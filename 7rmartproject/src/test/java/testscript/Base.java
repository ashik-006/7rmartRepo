package testscript;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;
import utilities.WaitUtilities;

public class Base 
{
	public WebDriver driver;
	public Properties properties;
	public FileInputStream fileinputstream;
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void initializeBrowser(String browser) throws Exception
	{
		try 
		{
			properties = new Properties();
			fileinputstream = new FileInputStream(Constants.CONFIG_FILE);
			properties.load(fileinputstream);
		}
	    catch(Exception e)
		{
	    	System.out.println("***catch***");
	
		}
		
	
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) //lowercaseoruppercase no prblm in crossbrowser ,usedequalignorecase for that
		{
			driver= new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		else {
			throw new Exception("Browser is not correct");
		}
		
		//driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtilities.IMPLICIT_WAIT));
		driver.manage().window().maximize();
	}
	@AfterMethod(alwaysRun=true)
	public void driverQuitAndClose()
	{
		//driver.quit();
	}

}
