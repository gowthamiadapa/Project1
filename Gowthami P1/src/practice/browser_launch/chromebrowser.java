package practice.browser_launch;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromebrowser 
{
		

		public static void main(String[] args)
		{
		
		//setup chromedriver
		WebDriverManager.chromedriver().setup();
	
	
			//openchrome browser and load webpage
		ChromeDriver chrome = new ChromeDriver();
			chrome.get("http://facebook.com");
			
			//print page.title
			System.out.println(chrome.getTitle());
			
			
			// close browser
			chrome.close();
			}
}
