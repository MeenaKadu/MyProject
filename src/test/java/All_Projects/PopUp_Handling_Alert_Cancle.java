package All_Projects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp_Handling_Alert_Cancle {

	public static void main(String[] args) throws Exception
	{
		// Browser opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		 // Identify WebElement
		 WebElement txt_ID=driver.findElement(By.xpath("//input[@name='cusid']"));
		 txt_ID.sendKeys("12345");
		 
		 WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		 btn_submit.click();
		
		  // Driver navigate alert window
		 Alert alt=driver.switchTo().alert();
		 Thread.sleep(3000);
		
		 // for dismiss click on cancle
		 alt.dismiss(); 
		 driver.close();
	}

}
