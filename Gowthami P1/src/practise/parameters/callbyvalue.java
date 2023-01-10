package practise.parameters;

 		//parameters in method
public class callbyvalue 
{

	public void MethodA()
	{
		System.out.println("statement");
	}
	
	public void MethodB(int num)
	{
		System.out.println(num);
	}
	
	public void MethodC(String name) 
	{
		System.out.println(name);
	}
	
	public void MethodD(boolean flag)
	{
		System.out.println(flag);
	}
	
	public void MethodE(double dbl)
	{
		System.out.println(dbl);
	}
	
	public void MethodF(char ch)
	{
		System.out.println(ch);
	}
	
	public static void main(String[] args)
	{
		callbyvalue G= new callbyvalue();
		G.MethodA();
		G.MethodB(200);
		G.MethodC("Iphone");
		G.MethodD(true);
		G.MethodE(23.45);
		G.MethodF('A');
	}

}
