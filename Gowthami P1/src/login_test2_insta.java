
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_test2_insta 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
        driver.get("http://instagram.com");
       
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//span[contains(.,'Sign up')]")).click();
        
        Thread.sleep(8000);
        
        driver.findElement(By.name("emailOrphone")).sendKeys("9876543212");
        
        driver.findElement(By.name("fullname")).sendKeys("gowthami");
        
        driver.findElement(By.name("username")).sendKeys("gowthaminaidu");
        
        driver.findElement(By.name("password")).sendKeys("2345678");
        
        driver.findElement(By.name("//button[contains(.,'Sign up')]")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//select[contains(@title,'Month:')]")).sendKeys("september");
        
        driver.findElement(By.xpath("//select[contains(@title,'Day:')]")).sendKeys("13");
        
        driver.findElement(By.xpath("//select[contains(@title,'Year:')]")).sendKeys("2005");
        
        driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.name("confirmationCode")).sendKeys("23456789");
        
        driver.findElement(By.xpath("//button[contains(.,'Confirm')]")).click();
        
        driver.close();
        
        System.out.println("test completed");
        
        
    
	}
	

}