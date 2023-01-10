package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Copy_stringto_clipboard {

	public static void main(String[] args) throws IOException, Exception
	{

		//launching note pad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(3000);
		
		
		//copy system path to string
		String path ="E:\\automation\\sample.docx";
		
		//copy selected string
		StringSelection spath = new StringSelection(path);
		
		
		//get system clipboard
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		
		//now selected text set into clipboard memory
		clipboard.setContents(spath, spath);
		
		
		//Create object for robot
		Robot robot= new Robot();
		robot.setAutoDelay(200);
		
		
		//press control+v using robot
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		//robot down key control
		robot.keyPress(KeyEvent.VK_CONTROL);
		System.out.println("task done");

	}

}
