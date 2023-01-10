package wait_commands.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_ElementTobe_Clickable
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		
		//Enable explicitwait at automaiton driver
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		//Wait Until Email Visible at webpage
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("ammulugmail.com");	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("1234556778");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		System.out.println("element available at clickab;e state");
	
	
	}
	
}
