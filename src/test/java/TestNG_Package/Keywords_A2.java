package TestNG_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Keywords_A2
{
	@Test()
	public void Test1()
	{
		System.out.println("This is Test 1");
		Assert.assertTrue(false);      //true=false
	}
	@Test(dependsOnMethods="Test1")
	public void Test2()
	{
		System.out.println("This is Test 2");
	}
}
