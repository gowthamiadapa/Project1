
public class variable_type
{

	String email = "info.ammu@gmail.com";
	String mobile = " 9865462632";
	
	static int x = 100;
	static int y = 200;
	
	public void method1()
	{
		String name = "webdriver";
		System.out.println(name);
		
		System.out.println(email);
		
	}

	public void method2()
	{
		System.out.println(email);
		System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		variable_type obj = new variable_type();
		obj.method1();
		
		System.out.println(obj.email);
		System.out.println(obj.mobile);
		
		System.out.println(variable_type.x);
		System.out.println(variable_type.y);
				
	}

}
