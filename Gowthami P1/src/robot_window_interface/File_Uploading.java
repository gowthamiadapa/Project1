package robot_window_interface;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Uploading {

	public static void main(String[] args) 
	{
	     
		WebDriver driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https:/.com/");
		driver.manage().window().maximize();
		
		

	}

}
