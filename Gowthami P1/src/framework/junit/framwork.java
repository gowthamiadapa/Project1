package framework.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class framwork {

	@BeforeClass //invoke before execution of first @test annotation
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("class precondition");
	}

	@AfterClass  //invoke after execution of last @test condition
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("class postcondition");
	}

	@Test  //invoke mwthod to run without object creation
	public void test() 
	{
		System.out.print("test executed");
	}

	@Test  //Invoke method to run without object creation
	public void test1() 
	{
		System.out.println("test1 executed");
	}

	
	
}
