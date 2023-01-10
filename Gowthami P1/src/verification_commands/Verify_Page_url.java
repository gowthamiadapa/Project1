package verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Page_url 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();

		if(driver.getTitle().contains("Outlook"))
		{
			WebElement Signin_button=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			Signin_button.click();
			
			if(driver.getCurrentUrl().contains("https://login.live.com/login"))
			
				System.out.println("Expected url presented");
			else
				
				System.out.println("Expected url is not presented");
		}
		else
		{
			System.out.println("Orange HRM homepage tilte is mismatched");
		}
		
	}
	
	

}
