package All_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	// Xpath by text----->//tagname[text()='text']	
	WebElement btn_signup=driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
	btn_signup.click();
	WebElement txt_firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	txt_firstname.sendKeys("FirstName");
	Thread.sleep(3000);
	WebElement txt_lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	txt_lastname.sendKeys("LastName");
	Thread.sleep(3000);
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	txt_email.sendKeys("Myfacebook@gmail.com");
	Thread.sleep(3000);
	WebElement txt_pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	txt_pass.sendKeys("Password");
	Thread.sleep(3000);
	
	// Xpath by Index----->//([xpath])[index]
	WebElement txt_day=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
	txt_day.sendKeys("13");
	Thread.sleep(3000);
	
	WebElement txt_month=driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][2]"));
	txt_month.sendKeys("nov");
	Thread.sleep(3000);
	
	WebElement txt_year=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
	txt_year.sendKeys("1995");
	Thread.sleep(3000);
	
	WebElement btn_gender=driver.findElement(By.xpath("(//label[text()='Female'])[1]"));
	btn_gender.click();
	Thread.sleep(3000);
	
	WebElement btn=driver.findElement(By.xpath("//button[@name='websubmit']"));
	btn.click();
	
	
	driver.close();
	}

}
