package frames.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame_Using_IndexNumber 
{
   public static void main(String[] args) throws Exception
   
   {
	   WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
       driver.get("https://www.cleartrip.com/account/trips");
       driver.manage().window().maximize();
       Thread.sleep(4000);
       
     //Switch to frame usign Iframe Index  Number
	    driver.switchTo().frame(1);
	    
	    
	    WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
	    MobileNumber.sendKeys("903034575");
	    
	    
	 } 
}
