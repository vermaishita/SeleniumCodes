package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/xml/xpath_intro.asp");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("Parent Window ID is:"+parent);
		//driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		//*[@id="tsf"]/div[2]/div[1]/div[3]/center/input[1]
		Set<String> allWindows=driver.getWindowHandles();
		
		int count=allWindows.size();
		
		System.out.println("Total windows are:"+count);
		
		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
				Thread.sleep(3000, 300);
				driver.close();
			}		
		}	
			driver.switchTo().window(parent);
			System.out.println("Parent Window Title is" +driver.getTitle());
	}
}
