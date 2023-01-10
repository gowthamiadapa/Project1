package practise_parameters2;

		//multiple parameters in constructors
public class parameters_construtors 
{

	int a;  // global variable declaration
	int b;
	
	public parameters_construtors(int x,int y) 
	{
		a=x;
		b=y;
	}
	
    public void Add() 
    {
    	System.out.println(a+b);
    }
    
    public void mul() 
    {
		System.out.println(a*b);
	}
    
    public void div() 
    {
	System.out.println(a/b);
	}
    
    public static void main(String[] args)
    {
		new parameters_construtors(12, 16).Add();
		new parameters_construtors(23, 12).mul();
		new parameters_construtors(13, 23).div();
	}
}  