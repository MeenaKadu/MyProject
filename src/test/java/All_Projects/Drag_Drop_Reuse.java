package All_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop_Reuse 
{
	public static void HandleDragandDrop(WebElement src,WebElement dest, WebDriver driver) throws Exception
	{
			
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
	}
	
	public static void main(String[] arg) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));	
		WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
	}
	
	 

