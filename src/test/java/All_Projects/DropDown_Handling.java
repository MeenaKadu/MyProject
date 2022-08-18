package All_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Handling {

	public static void main(String[] args) throws InterruptedException {
		// DropDown Handling -----> select class :
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				
				// Identify WebElement
				
				WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
				Select sel=new Select(drp_country);
				System.out.println(sel.getFirstSelectedOption().getText());
				
				// SelectByIndex(index) :
				
				sel.selectByIndex(3);
				Thread.sleep(3000);
				
				// SelectByvalue() :
				
				sel.selectByValue("BANGLADESH");
				Thread.sleep(3000);
				
				// SelectByVisibleText() : 
				
				sel.selectByVisibleText("AUSTRALIA");
				Thread.sleep(3000);
				
				List<WebElement> list=sel.getOptions();
				System.out.println(list.size());
				
				for(int i=0;i<list.size();i++)
				{
					String text=list.get(i).getText();
					System.out.println(text);
					if(text.equals("BANGLADESH"))
					{
						sel.selectByVisibleText("BANGLADESH");
						break;
					}
				}
				driver.close();		


	}

}
