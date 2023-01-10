package robot_window_interface;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

public class robot_mouse {

	public static void main(String[] args) throws IOException, Exception 
	{
		
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(2000);
		
		
		
		//create object for robot framework
		Robot robot= new Robot();
		
		
		//move cursor to required location
        robot.mouseMove(100, 200);
        
        //mouse click
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//left click
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);//middle click
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);//right click
        
        //release mouse
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        
        
        
        //scroll
        robot.mouseWheel(100);
        
        
	}

}
