package All_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass_Keyboard {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		Actions act=new Actions(driver);
		act.keyDown(txt_email,Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.click();
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.sendKeys(Keys.ENTER);
		driver.close();
			
	}

}
