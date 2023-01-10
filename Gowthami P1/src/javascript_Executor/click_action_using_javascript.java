package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class click_action_using_javascript {

	
	     public static void main(String[] args) 
	     {
	
	        WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
	        driver.get("https://www.outlook.com/");
	        driver.manage().window().maximize();
	        
	        
	        //enable javascript on automation browser
	        JavascriptExecutor js=((JavascriptExecutor)driver);
	        
	        
	        WebElement signIn =driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
	        js.executeScript("arguments[0].click()",signIn);
	
	    }
}