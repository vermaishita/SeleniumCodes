package Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTableData  {
	public void  fetch()
	
	{
		WebDriver driver;
		String path;
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("E:\\HTML Files\\table.html");
		ArrayList<WebElement> al=(ArrayList<WebElement>)driver.findElements(By.id("studata"));
	//	System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			//System.out.println(al.get(i).getAttribute("href"));
			System.out.println(al.get(i).getText());
		}
	}

	public static void main(String[] args) {
		FetchTableData fetchd = new FetchTableData();
		fetchd.fetch();

	}

}

