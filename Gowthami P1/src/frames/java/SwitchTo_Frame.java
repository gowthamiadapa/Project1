package frames.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Frame {

	
	
	public static void main(String[] args) throws Exception 
	{
		
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
	        driver.get("https://www.cleartrip.com/account/trips");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        
	        //Switch to frame using Frame ID
	        driver.switchTo().frame("modal_window");
	        
	        
	        //Identifying objects under frame..
	        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	        email.sendKeys("info.ammulus@gmail.com");
	               
	 
	        WebElement tripId=driver.findElement(By.id("tripidSecond"));
	        tripId.sendKeys("123456577");
	        
	        //Switch Controls back to MainPage
	        driver.switchTo().defaultContent();
	        
	        WebElement home=driver.findElement(By.xpath("//a[@title='Home']\"));"));
	        home.click();
	        

	}

}