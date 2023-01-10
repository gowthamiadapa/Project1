package arrays_java;

public class SingleDimensional_StaticArray 
{

	public static void main(String[] args)
	{
		
		String browsers[]=new String[4];
		browsers[0]="chrome";
		browsers[1]="firefox";
		browsers[2]="safari";
		browsers[3]="opera";
		
		
		System.out.println("browser[2]");
		
	   //Array Values can be stored into variables
		String operabrowser=browsers[3];
		System.out.println(operabrowser);
		
	  //Static Array [Single dimensional Numeric array]
		int num[]=new int[5];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		num[4]=500;
		
		int x=num[3];
		System.out.println(x);  //print 400
		
		//Store Group values [String, Integers]
		Object obj[]=new Object[4];
		obj[0]="Iphone";
		obj[1]=true;
		obj[2]=125000.00;
		obj[3]=2;		
				
		
		//By Casting we can covert Object values into required datatypes
		String productName=(String)obj[0];
		boolean productstatus=(boolean) obj[1];
		double prodcutprice=(double) obj[2];
		int productunits=(int) obj[3];
				 
		
		System.out.println(productName+"\t"+productstatus
				+"\t"+prodcutprice+"\t"+productunits);
		
		
		//Note We can get Array size 
			System.out.println(browsers.length);
				
		
	}
	

}
