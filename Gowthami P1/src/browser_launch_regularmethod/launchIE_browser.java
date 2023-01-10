package browser_launch_regularmethod;

import org.bouncycastle.jce.interfaces.IESKey;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launchIE_browser
{

	
	
	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\GOWTAMI\\OneDrive\\Documents\\Backup folder\\IEdriver\\IEdriverserver.exe");
		
		InternetExplorerDriver ie = new InternetExplorerDriver();
		
		ie.get("http://instagram.com");
		
		
		System.out.println(ie.getTitle());
		
		ie.close();
	}
	
}