package frames.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame_Using_WebElement_Reference {

	public static void main(String[] args) throws Exception
	{

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.cleartrip.com/account/trips");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        
        
        WebElement frameElement= driver.findElement(By.xpath("//iframe[@class='spinnerMedium']"));
		driver.switchTo().frame("ammulu.gowthami@gmail.com");
		
		
		 WebElement tripId=driver.findElement(By.id("tripidSecond"));
		 tripId.sendKeys("12345678");
		    
		
		  driver.switchTo().defaultContent();
		  
		  WebElement Home=driver.findElement(By.xpath("//a[@title='Home']"));
		  Home.click();
		    
		}

}
