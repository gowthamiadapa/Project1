package loops_mq;

public class For_loop
{

	public static void main(String[] args) 
	{
		
		//print number 1 to 19
		
		for (int i = 1; i < 20; i++) 
		{
			System.out.println(i);
		}

		
		//print number 50-30
		for (int i = 50; i >30; i--) 
		{
			System.out.println(i);
		}
	
		
		//print array values
		String browsers[]={"chrome","safari","Opera","Edge"};
		for (int i = 0; i < browsers.length; i++) 
		{
			String eachbrowser  = browsers[i];
			System.out.println(eachbrowser);
		}
		
		
		//count number between 1 to 1000
		 int sum=0;
		 for (int i = 1; i <=1000; i++) 
		 {
			 
			 sum=sum+i;
		 }
			System.out.println("total value is--->"+sum);
			
		//how to reverse a string
		 String name="imahtwog";
		 char ch[]=name.toCharArray();
		 
		 String str="";
		 for (int i = ch.length-1; i >=0; i--)
		 {
			
			 str=str+ch[i];
	     }
		System.out.println(str); 
		 
		
		
		//Using StringBuilder Reverse a string
		StringBuilder builder=new StringBuilder(name);
		System.out.println(builder.reverse());
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			
			
	   	
    }
	

}
