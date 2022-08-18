package Cross_Browser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
@Test
public void HA_1()
{
	System.out.println("Enter Email");
	System.out.println("Enter Password");
	System.out.println("Click Login Button");
	String expected="BugSpotter";
	String actual="bugspotter";
	Assert.assertEquals(actual, expected);
	System.out.println("Test Done");
}
@Test
public void HA_2()
{
	System.out.println("HA_2");
}
}
