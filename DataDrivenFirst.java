package DataDriven;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenFirst {
	WebDriver driver;
	String data,Username,Password,path;
	XSSFRow row;
	XSSFCell cell;
	@Test
	public void getData() throws IOException 
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		FileInputStream fs= new FileInputStream("E:\\Selenium Files\\LoginData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Login");		
		int count=sheet.getLastRowNum();
		System.out.println("Total number of rows=" +count);	
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			
			row=sheet.getRow(i);			 
			{
				Username=row.getCell(0).toString();
				Password=row.getCell(1).toString();
			//	System.out.println("Username");
				driver.findElement(By.id("txtUsername")).clear();
				driver.findElement(By.id("txtPassword")).clear();
				driver.findElement(By.id("txtUsername")).sendKeys(Username);
				driver.findElement(By.id("txtPassword")).sendKeys(Password);
				driver.findElement(By.cssSelector("#btnLogin")).submit();
			//	driver.navigate().back();
			}
		}				
	}
	public static void main(String[] args) throws IOException {
		DataDrivenFirst ddf=new DataDrivenFirst();
		ddf.getData();
	}
}
