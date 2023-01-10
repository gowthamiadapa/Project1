package Css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parent_node
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();    
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
        Thread.sleep(4000);

        driver.findElement(By.cssSelector("#email")).sendKeys("gowthami");
        driver.findElement(By.cssSelector("password")).sendKeys("2346643");
        
        
 
        
        
        
        
        
	}

}
