package practice.methodtypes;

public class choosebook 
{

	public book1 selectbook1()
	{
		return new book1();
	}
	
	
	public book2 selectbook2()
	{
		return new book2();
	}
	
	public static void main(String[] args)
	{
		
	    choosebook obj	= new choosebook();
	  
	    String A = obj.selectbook1().getname();
	    double B = obj.selectbook1().getprice();
	    String C = obj.selectbook2().getname();
	    double D = obj.selectbook2().getprice();
	
	  System.out.println("bookname is "+A+"\t"+"bookprice is "+B);
	  System.out.println("bookname is "+C+"\t"+"bookprice is "+D);
	 }

}
