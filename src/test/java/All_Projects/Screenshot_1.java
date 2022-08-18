package All_Projects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_1 {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		txt_email.sendKeys("Myfacebook@gmail.com");
		Thread.sleep(3000);
		
		WebElement txt_pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		txt_pass.sendKeys("12345");
		Thread.sleep(3000);
		
		WebElement btn_login=driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		btn_login.click();
		Thread.sleep(3000);
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\Automation_Project\\Screenshot";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"\\Test1.png");
		FileUtils.copyFile(src, dest);
		driver.close();

	}

}
