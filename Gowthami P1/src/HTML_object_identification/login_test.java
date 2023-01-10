package HTML_object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class login_test
{

	 public static void main(String[] args) 
	 {
		 
     WebDriver driver =  WebDriverManager.chromedriver().avoidShutdownHook().create();
      driver.get("http://facebook.com");
      driver.manage().window().maximize();
      
      
      driver.findElement(By.id("email")).sendKeys("gowthamiadapa354@gmail.com");
      driver.findElement(By .id("pass")).sendKeys("gowthami");
      driver.findElement(By.name("login")).click();
      
	}

}
