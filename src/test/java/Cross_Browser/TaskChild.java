package Cross_Browser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class TaskChild extends Task{
@Test
public void Test1() throws Exception
{
	//Identify WebElement
	driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mobile");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline']")).click();
	
	//Take ScreenShot
	String path="C:\\Users\\Dell\\eclipse-workspace\\Automation_Project\\Screenshot";
	//String rm=RandomString.make(4);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest= new File(path+"\\mobiless.png");
	FileUtils.copyFile(src, dest);
	
	//Print Mobile Name
	WebElement title=driver.findElement(By.xpath("//span[@id='productTitle']"));
	String str=title.getText();
	System.out.println(str);
	
	//compare Logo
	WebElement expected=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	String s1=expected.getText();
	System.out.println(s1);
	String actual="Hello, Sign in";
	Assert.assertEquals(s1,actual);
System.out.println("Test Successfully Completed");	
}
}
