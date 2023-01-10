package constructor;

public class geartest 
{

	public geartest()
	{
		System.out.println("holdcluch");
	}
	public void changegear1() 
	{
		System.out.println("change to gear1");
	}
	public void changegear2() 
	{
		System.out.println("change to gear2");
	}
	public void changegear3() 
	{
		System.out.println("change to gear3");
	}
	public static void main(String[] args)
	{
		new geartest().changegear1();
		new geartest().changegear2();		
		new geartest().changegear3();		
	}
}