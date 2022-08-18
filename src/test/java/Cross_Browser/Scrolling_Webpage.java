package Cross_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_Webpage {

	@Test
	public void VerifyTest_001() throws Exception
	{
		// Browser Opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// Scroll By Pixel
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-500)","");
		Thread.sleep(4000);
		
		// Scroll BY Element
		WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoView()", english);
		
		driver.close();		
	}
}