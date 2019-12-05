package Selenium;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewsHeadlineFetch {
	public void news()
	
	{
		WebDriver driver;
		String path;
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://www.bbc.com");
		ArrayList<WebElement> al=(ArrayList<WebElement>)driver.findElements(By.className("block-link__overlay-link"));
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			//System.out.println(al.get(i).getAttribute("href"));
			System.out.println(al.get(i).getText());
		}
	}

	public static void main(String[] args) {
		NewsHeadlineFetch nhf= new NewsHeadlineFetch();
		nhf.news();

	}

}
