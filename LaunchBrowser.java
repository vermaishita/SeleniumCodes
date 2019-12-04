package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
		WebDriver driver; //WebDriver is an Interface here and 'driver' is reference variable here
		String path,title,expetitle="Facebook – log in or sign up",url;
		public void Launch() 
		{
		//	System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\chromedriver.exe"); //setting the driver path
			path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		//	System.out.println(path);
		//  Setting key and path of Chrome driver
			System.setProperty("webdriver.chrome.driver", path);
		//  Launching Chrome browser
			driver= new ChromeDriver();//Initializing driver to be used;ChromeDriver is a class here
		// opening facebook application to test
		//	driver.get("https://www.facebook.com/");
			driver.navigate().to("https://www.facebook.com/");
		//	driver.navigate().back();
			
			title=driver.getTitle();
			url=driver.getCurrentUrl();
			System.out.println("URL of the page is:"+url);
			System.out.println("Title of the page is:"+title);
			if(title.equals(expetitle))
			{
				System.out.println("You are landing on the correct page");
			}
			else
			{
				System.out.println("Correct Page not opened");
			}
			driver.close(); //will close current page
			driver.quit(); //will close all the pages/instances
		}
		
	public static void main(String[] args) 
	{
		LaunchBrowser lb=new LaunchBrowser();
		lb.Launch();
	}
}
