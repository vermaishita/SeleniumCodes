package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class LocateElements {
	WebDriver driver; //WebDriver is an Interface here and 'driver' is reference variable here
	String path,title,expetitle="Facebook – log in or sign up",url;
	public void locate_elements() 
	{
	//	System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\chromedriver.exe"); //setting the driver path
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	//  Launching Chrome browser
		driver= new ChromeDriver();//Initializing driver to be used;ChromeDriver is a class here
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
	//	driver.navigate().back();
		driver.findElement(By.id("login1")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.name("proceed")).click();
		driver.navigate().back();
		//driver.findElement(By.linkText("Forgotten account?")).click();
	//	driver.close(); //will close current page
	//	driver.quit(); //will close all the pages/instances
		driver.findElement(By.partialLinkText("account")).click();
		Select sl=new Select(driver.findElement(By.id("day")));
	
		
		}

	public static void main(String[] args) {
		
		LocateElements le=new LocateElements();
		le.locate_elements();
	}

}
