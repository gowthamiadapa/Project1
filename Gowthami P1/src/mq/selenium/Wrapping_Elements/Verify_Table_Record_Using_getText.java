package mq.selenium.Wrapping_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Table_Record_Using_getText 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify User record available at PIM Table
		 * 		Given site url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
		 * 		And perform user login
		 * 		And click on PIM tab
		 * 		When user click Search after Entering valid ID
		 * 		Annd click on search
		 * 		Then verify record available at PIM Table
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
		
		WebElement login= driver.findElement(By.xpath("//button[contains(.,'Login')]"));
		login.click();
		Thread.sleep(3000);
		
		WebElement PIM =driver.findElement(By.xpath("//a[contains(.,'PIM')]"));
		PIM.click();
		Thread.sleep(3000);
		
		WebElement EID= driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']"));
		EID.sendKeys("0038");
		Thread.sleep(3000);
		
		WebElement search= driver.findElement(By.xpath("//button[contains(.,'Search')]"));
		search.click();
		Thread.sleep(3000);
		
		WebElement page= driver.findElement(By.tagName("body"));
		String pagetext=page.getText();
		String Ename="Aaliyah";
		     if(pagetext.contains(Ename))
	          {
	        	  System.out.println("EID record is passed");
	          } 
	          
	          else 
	          {
	        	  System.out.println("EID record is not passed");
	          }
		         
		         System.out.println("records are passed in the orangesrm site");
	         
	}
		
		
}


