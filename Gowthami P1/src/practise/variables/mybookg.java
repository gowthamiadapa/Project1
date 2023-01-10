package practise.variables;

		//object defining foe void methods and without constructor
public class mybookg 
{

	public void chap1() 
	{
		System.out.println("open chapter 1");
	}
	
	public void chap2()
	{
	System.out.println("open chapter 2");
	}
	
	public static void main(String[] args)
	{
		//new mybookg().chap1();
		//new mybookg().chap2();
		
		
	    mybookg y =new mybookg();
	    y.chap1();
	    y.chap2();
	}

}
