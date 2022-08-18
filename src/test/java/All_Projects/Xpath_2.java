package All_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// Xpath by Attribute ----> //tagname[@attribute name='value']
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Myfacebook@gmail.com");
		Thread.sleep(3000);
		
		// Xpath by Attribute ----> //tagname[@attribute name='value']
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.sendKeys("123456");
		Thread.sleep(3000);
		
		// Xpath by Contains WebElement ------>//tagname[contains(@attribute name,'static value')]
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'loginbutton')]"));
		btn_login.click();
		Thread.sleep(3000);
		
		//Xpath by text ---->//tagname[text()='text']
		WebElement btn_forgotten=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		btn_forgotten.click();
		driver.close();
		
			

	}

}
