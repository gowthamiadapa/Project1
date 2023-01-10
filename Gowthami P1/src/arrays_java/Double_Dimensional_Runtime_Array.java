package arrays_java;

public class Double_Dimensional_Runtime_Array 
{

	public static void main(String[] args) 
	{
		
		//Runtime Double Dimensional array string type
		String data[][]=
			{
					{"Iphone","64GB","23"},
					{"Samsung","32GB",null},
					{"Vivo","64GB",null},
					
			};
	
	    
		System.out.println(data[0][1]);
		
	
	    //runtime dimensional array object type
	    Object obj[][]=
	    	{
	    			new Object[] {"Iphone",true},
					new Object[] {"Samsung",true},
					new Object[] {"Oneplus",false},
					new Object[] {"Oppo",true},	
	    			
	    	};
	
	   //by default print statment cast the value
            System.out.println(obj[1][0]);
		
            String OnePlus=(String) obj[2][0];
            System.out.println(OnePlus);
		
	}
	
	

}
