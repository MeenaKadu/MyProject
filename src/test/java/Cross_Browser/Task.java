package Cross_Browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	WebDriver driver;
	@BeforeMethod
	public void verify()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	}
	

