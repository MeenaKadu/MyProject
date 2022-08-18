package Cross_Browser;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

	@Test
	public void SA_1()
	
	{
		SoftAssert sft=new SoftAssert();
		System.out.println("Enter Email");
		System.out.println("Enter Password");
		System.out.println("Click Login Button");
		
		String expected="BugSpotter";
		String actual="bugspotter";
		
		sft.assertEquals(actual, expected);
		
		System.out.println("Test Done");
		
		sft.assertAll();
	}
	@Test
	public void SA_2()
	{
		System.out.println("SA_2");
	}
}
