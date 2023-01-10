package wait_commands.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitfor_visibility 
{

	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		//enable dynamic timeout
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//span[contains(.,'Sign up')]"))).click();
		
		
	}

}
