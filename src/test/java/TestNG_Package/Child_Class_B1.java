package TestNG_Package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Child_Class_B1 extends Base_Class_B
{
	@Test
	public void Test1() throws Exception
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Myfb@12345");
		Thread.sleep(3000);
	}

	@Test
	public void Test2() throws Exception
	{
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1232345");
		Thread.sleep(3000);
	}
	

}
