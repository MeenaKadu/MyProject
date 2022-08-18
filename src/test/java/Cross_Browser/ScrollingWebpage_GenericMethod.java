package Cross_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingWebpage_GenericMethod 
{
@Test
public void Verifytest_001() throws InterruptedException
{
	//Browser Opening 
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
	//js.executeScript("arguments[0].scrollIntoView()", english);
	HandleScrollByElement(driver,english) ;
	
}
public static void HandleScrollByElement(WebDriver driver,WebElement element) 
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()",element);
}
}
