package TestNG_Package;

import org.testng.annotations.Test;

public class Different_Testing {

	@Test(groups="Sanity")
	public void test_A()
	{
		System.out.println("Test A");
	}
	@Test(groups="Critical Regression")
	public void test_B()
	{
		System.out.println("Test B");
	}
	@Test(groups="Regression")
	public void test_C()
	{
		System.out.println("Test C");
	}
	@Test(groups="Regression")
	public void test_D()
	{
		System.out.println("Test D");
	}
	
}
