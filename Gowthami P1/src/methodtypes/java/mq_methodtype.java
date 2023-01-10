package methodtypes.java;

public class mq_methodtype
{
      String email ="gow2004@gmail.com";
      
      //void type method doesn't return any value 
      public void method1() 
      {
    	  String name = "web driver";        //local variable 
          System.out.println(name);
      }	
           //*=>other then void all method types return values
           //*=>for other method type we should write return value at end of the method
           //*=>return value should match with method type
      
      public String method2()
      {
		String toolname = "selenium";
		return toolname;
      }
      
      public int method3(int a,int b)
      {
		return a+b;
      }
      
      public boolean method4()
      {
    	  return true;
      }
      
      public double method5()
      {
    	  return 123.45;
      }
      
      public char method6()
      {
    	  return 'A';
      }
      
      public static void main(String[] args) 
      {
    	   
    	  mq_methodtype obj = new mq_methodtype();
    	      obj.method1();
    	      
    	   String name = obj.method2();
    	   System.out.println("selenium");
    	   
    	   int value = obj.method3(130, 230);
    	   System.out.println(value+100);
    	   
    	   boolean flag = obj.method4();
    	   System.out.println(flag);
    	  
    	  double dbl = obj.method5();
    	  System.out.println(dbl);
    	  
    	  char ch = obj.method6();
    	  System.out.println(ch);
    	  
      }
}
