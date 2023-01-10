package practice.browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoxbrowser
{

	public firefoxbrowser() 
	{
		
	}

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver firefox = new FirefoxDriver();
		
		firefox.get("http://instagram.com");
		
		System.out.println(firefox.getTitle());
		
		firefox.close();
		
		
	}

}
