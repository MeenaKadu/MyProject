package All_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Reuse {

private static void HandleDropDown(WebElement element, String text) {
		
		Select select=new Select(element);
		select.selectByVisibleText(text);
}

	public static void main(String[] args) throws InterruptedException {
		// DropDown Handling -----> select class :
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				
				// Identify WebElement
				
				WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
				HandleDropDown(drp_country,"BRAZIL");
				Thread.sleep(3000);
				driver.close();
	}

}
	
