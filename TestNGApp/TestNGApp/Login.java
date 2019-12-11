package TestNGApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login extends Driver{
	 WebDriver driver;
	String path, expTitle="Demo",actualTitle;
	@Test(groups= {"Sanity","Positive"},priority=0)
	public void chkTitle()
	{
		String actualTitle=driver.getTitle();
		if(expTitle.equals(actualTitle))
		{
				System.out.println("You are on correct page");
				System.out.println("Test case one");
			}
			else
			{
				System.out.println("You are not on a correct page");
			}
			System.out.println("Test method 1");
		}
	@Test(groups= {"Smoke"},priority=2)
	public void Login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).submit();
	}
	@Test(groups= {"Sanity"},dependsOnMethods="Login")
	public void Logout()
	{
		System.out.println("Logout");
	}
	@Test(groups= {"Smoke"},priority=1)
	public void check()
	{
		System.out.println("Check ascending Condition");
	}
	
}

