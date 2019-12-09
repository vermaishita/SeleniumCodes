import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitle {
	WebDriver driver;
	String path,url,title,exptitle="Top-rated Industrial training institute in Chandigarh & Mohali";
	public void fetch() {
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://www.btes.co.in/");
	driver.findElement(By.xpath("/html/body/header[2]/div/nav/ul/li[5]/a[1]")).click();	
	driver.findElement(By.xpath("/html/body/header[2]/div/nav/ul/li[5]/ul/li[5]/a")).click();
	title=driver.getTitle();
	url=driver.getCurrentUrl();
	System.out.println("URL of the page is:"+url);
	System.out.println("Title of the page is:"+title);
	if(title.equals(exptitle))
	{
		System.out.println("You are landing on the right page");
	}
	else
	{
		System.out.println("Not a correct page");
	}
	}				
	public static void main(String[] args) 
	{
		FetchTitle obj=new FetchTitle();
		obj.fetch();
	}
}
