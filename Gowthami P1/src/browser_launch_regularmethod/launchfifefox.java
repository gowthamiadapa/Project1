package browser_launch_regularmethod;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfifefox
{

      public static void main(String[] args) 
      {
		
	 	System.setProperty("webdriver.gecko.driver","C:\\Users\\GOWTAMI\\OneDrive\\Documents\\Backup folder\\geckodriver\\geckodriver.exe");
		
	 	
		FirefoxDriver firefox=new FirefoxDriver();
		
		firefox.get("http://instagram.com");
		
		System.out.println(firefox.getTitle());
		
		firefox.close();
		
	
		
	}

}
