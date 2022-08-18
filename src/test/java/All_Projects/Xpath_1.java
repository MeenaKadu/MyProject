package All_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//  Xpath by attribute "id" -----> // Tagname[@ attribute name='attribute value']
		WebElement txt_email=driver.findElement(By.xpath("//*[@id=\"email\"]"));				
		txt_email.sendKeys("myfacebook@gmail.com");
		Thread.sleep(4000);
		
	    //  Xpath by attribute "id" -----> // Tagname[@ attribute name='attribute value']
		WebElement txt_pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));   			  
		txt_pass.sendKeys("123456");
		Thread.sleep(4000);
		
		//  Xpath by attribute "id" -----> // Tagname[@ attribute name='attribute value']
		WebElement btn_login=driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));		  
		btn_login.click();
		Thread.sleep(4000);
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4000);
		
		// Xpath by >text< -----> //tagname[text()='text']
		WebElement btn_forgotten=driver.findElement(By.xpath("//*[@id=\"login_link\"]/div/a")); 
		btn_forgotten.click();
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
