package framwork_junit;

import org.junit.Test;

public class myjunittest
{

	@Test
	public void test()
	{
		System.out.println("Test1 Method executed");
	}
	
	@Test //Invoke method to run without object creation and Without Main method
	public void test2() 
	{
		System.out.println("Test2 Method executed");
	}
	
	@Test //Invoke method to run without object creation and Without Main method
	public void test3() 
	{
		System.out.println("Test3 Method executed");
	}

}
