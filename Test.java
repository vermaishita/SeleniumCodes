package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] ar) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("identifierId")).sendKeys("drizling.skies@gmail.com");
	//Thread.sleep(2000);
	driver.findElement(By.className("ZFr60d CeoRYc")).click();
	//Thread.sleep(2000);
	String at=driver.getTitle();
	String et="gmail";
	driver.close();
	if(at.equalsIgnoreCase(et))	
	{
		System.out.println("Test Successful");
	}
	else
	{
		System.out.println("Test Unsuccessful");
	}
}
}
