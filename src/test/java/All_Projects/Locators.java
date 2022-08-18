package All_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		// Browser open
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
				driver.manage().window().maximize();
				
				//Identify the WebElement .......> Locators ......>ID
				WebElement txt_email=driver.findElement(By.id("email"));
				txt_email.sendKeys("myfacebook@gmail.com");
				Thread.sleep(2000);
				
				//Identify the WebElement .......> Locators ......>id
				WebElement txt_pass=driver.findElement(By.id("pass"));
				txt_pass.sendKeys("123456789");
				Thread.sleep(2000);
				
				// Identify the WebElement .......> Locators ......>name
				WebElement btn_login=driver.findElement(By.name("login"));
				btn_login.click();
				Thread.sleep(2000);
				
				String title=driver.getTitle();
				System.out.println(title);
				Thread.sleep(2000);
				
				driver.close();
				
	}

}
