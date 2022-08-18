package All_Projects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowHandle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String PWinAdd=driver.getWindowHandle();
		System.out.println(PWinAdd);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllAddress=driver.getWindowHandles();
		System.out.println(AllAddress);
		
		Iterator<String> it=AllAddress.iterator();
		
		while(it.hasNext())
		{
			String CWinAdd=it.next();
			if(!PWinAdd.equals(CWinAdd))
			{
				driver.switchTo().window(CWinAdd);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("12345");
				Thread.sleep(3000);
				driver.close();
			}	
		}
		driver.switchTo().window(PWinAdd);
		driver.close();
	}

}
