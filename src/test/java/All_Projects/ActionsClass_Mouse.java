package All_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass_Mouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// One click 
		WebElement drp_selenium=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		Actions act=new Actions(driver);
		act.moveToElement(drp_selenium).click(drp_selenium).build().perform();
		Thread.sleep(3000);
		
		// Right click
		WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(right_click).build().perform();
		Thread.sleep(3000);
		
		// Double click
		WebElement double_click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(double_click).build().perform();
		Thread.sleep(3000);
		
		driver.close();	
		

	}

}
