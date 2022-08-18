package TestNG_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class_B {
	WebDriver driver;
@BeforeMethod
public void Setup() throws Exception
{
	// Browser open
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}

@AfterMethod
public void tearDown()
{
	// Browser close
	driver.close();
}
}
