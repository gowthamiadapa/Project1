package Css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class default_css 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver= WebDriverManager.chromedriver().avoidShutdownHook().create();
        driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        Thread.sleep(3000);
        
        
        //locating object using css selector id property
        driver.findElement(By.cssSelector("#email")).sendKeys("gowthami@gmail.com");

        
        //locating object using css selector id property and tagname combination
        driver.findElement(By.cssSelector("input#email")).sendKeys("gowthami233@gmail.com");
        
        
        driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("gowthami233@gmail.com");
        
        
         driver.findElement(By.cssSelector("._9npi")).sendKeys("gowthami1234");
         
         
        Thread.sleep(5000);
        
        
        driver.findElement(By.cssSelector("._61th")).click();
        
        
        System.out.println("task done");
        
        
	}

}

