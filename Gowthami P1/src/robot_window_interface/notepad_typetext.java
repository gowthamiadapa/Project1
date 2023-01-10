package robot_window_interface;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class notepad_typetext {

	public static void main(String[] args) throws IOException, Exception
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(3000);
		
		Robot robot= new Robot();
		robot.setAutoDelay(200);
		

		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		
		
	}

}
