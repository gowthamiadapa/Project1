package methodcalling;

public class robot1 
{

	public void walktest() 
	{
		System.out.println("walk test completed");
	}
	public void runtest() 
	{
		walktest();
		System.out.println("run test completed");
	}	
	public void runall() 
	{
		walktest();
		runtest();
	}

	public static void main(String[] args)
	{
		new robot1().runall();
	}

}
