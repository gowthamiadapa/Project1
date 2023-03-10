package frames.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateTo_Frame_Using_Frame_Url 
{
  public static void main(String[] args) throws Exception 
  {
	
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver=new FirefoxDriver();
      driver.get("https://www.cleartrip.com/account/trips");
      driver.manage().window().maximize();
      Thread.sleep(4000);
	  
	  
      //Navigate to Frame
	  driver.navigate().to("https://www.redbus.in/login?offerType=Support&defaultSlide=home&isOnlyMobile=false");
	    
	  WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
	  MobileNumber.sendKeys("9030248855");
	    
	  //back to MainPage
	  driver.navigate().back();
	    
	}
}
