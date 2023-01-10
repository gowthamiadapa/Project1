package practise.variables;


public class RobotT
{

	public RobotT()
	{
		System.out.println("power is on");	
	}
	
	public void startwalk()
	{
		System.out.println("start the walk");
	}

	public void stopwalk()
	{
		System.out.println("stop the walk");
	}
	
	public static void main(String[] args) 
	{
		

		    // new RobotT().startwalk();
			// new RototT().stopwalk();
				
			// [ creating object to class]
			// syntax fox instant methods
			//    classname object = new classname();
			//          object.methodname();
		
		RobotT g = new RobotT();
		g.startwalk();
		g.stopwalk();
		
	}
	
}
