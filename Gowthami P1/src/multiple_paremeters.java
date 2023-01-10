
public class multiple_paremeters 
{

	public void Method1(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	public void Method2(String mobile,double price) 
	{
		System.out.println(mobile);
		System.out.println(price);
	}
	
	public static void main(String[] args)
	{
		multiple_paremeters y=new multiple_paremeters();
				y.Method1(13, 23);
				y.Method2("realme", 23.000);
	}

}
