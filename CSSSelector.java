package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector 
{
	public void launch() 
	{
		WebDriver driver;
		WebElement searchbox;
		String path;
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies(); //to delete all cookies
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
	//	driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("ishita verma"); //by class name
	//	driver.findElement(By.cssSelector("[class^='gL']")).sendKeys("ishita verma"); //begins with
		driver.findElement(By.cssSelector("input[class$='fi']")).sendKeys("ishita"); //ends with
		driver.findElement(By.cssSelector("input[class$='fi']")).sendKeys(Keys.ENTER); //to handle keyboard keys
	//	driver.findElement(By.className("gLFyf")).sendKeys("ishita");		
	//	driver.findElement(By.className("gNO89b")).submit(); //use 'submit' if button type=submit
		//driver.navigate().back();
		//driver.findElement(By.cssSelector("input[class$='fi'])")).clear();
	}

	public static void main(String[] args) 
	{		
		CSSSelector css= new CSSSelector();
		css.launch();
	}
}
