package TestNG_Package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Child_Class_B2 extends Child_Class_B1 {
	@Test
	public void Test3() throws Exception
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
	}

}
