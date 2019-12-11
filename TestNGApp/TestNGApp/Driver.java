package TestNGApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Driver {
	public static String path;
	public static WebDriver driver; // we want to launch browser only once, that's why static
	public void launch()
	{
	
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
@AfterSuite(groups= {"Sanity"})
public void close_browser()
{
	driver.close();
	}
}
