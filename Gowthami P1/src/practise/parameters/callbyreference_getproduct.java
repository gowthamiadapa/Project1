package practise.parameters;

import practise.variables.RobotT;

public class callbyreference_getproduct 
{

	public void printday(String date)
	{
	    System.out.println(date);	
	}
	
	public void getcls(RobotT robo) 
	{
		robo.startwalk();
	}

	public static void main(String[] args)
	{
		callbyreference_getproduct obj = new callbyreference_getproduct();
		                       obj.printday("23/09/22");
		                       obj.getcls(new RobotT());
	}

}
