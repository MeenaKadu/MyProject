package TestNG_Package;

import org.testng.annotations.Test;

public class Keywords_A1 {
@Test(priority=-1,invocationCount=3)
public void Test1()
{
	System.out.println("This is Test 1");
}
@Test(priority=1,enabled=false)
public void Test2()
{
	System.out.println("This is Test 2");
}
@Test(priority=0)
public void Test3()
{
	System.out.println("This is Test 3");
}
}
