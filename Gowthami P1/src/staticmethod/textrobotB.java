package staticmethod;

public class textrobotB
{
		//calling static method with in the class
	public static void check_power_on()
	{
		System.out.println("verified power on");	
	}
	public static void check_area()
	{
		System.out.println("verify area");	
	}
	
	public static void main(String[] args)
	{
		check_power_on();
		check_area();
	    //no need to mention classname in main method
	}
}