package Practice_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	WebDriver driver;
@BeforeMethod
public void setup() throws Exception
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@AfterMethod
public void close()
{
	driver.close();
}
public class demo2 extends Demo
{
	@Test(groups="Sanity")
	public void test1()
	{
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Myfb.com");

	}
	@Test(groups="Regression")
	public void test2()
	{
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("12345");
	}
	@Test(groups="Critical Regression")
	public void test3()
	{
		WebElement btn=driver.findElement(By.xpath("//button[@name='login']"));
		btn.click();
	}
}
}
