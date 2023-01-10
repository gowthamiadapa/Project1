package get_text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Dropdown_Option_Availability
{

	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//selecting dropdown option
		new Select(driver.findElement(By.xpath("//select[@id='customState']")))
		.selectByVisibleText("vijayawada");
		Thread.sleep(4000);
		
		WebElement citydropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		
		
		String cities=citydropdown.getText();
		
		if(cities.contains("Baroda"))
			System.out.println("Testpass, Expected city available at dropdown");
		else
			System.out.println("Testfail, Expected City Not available at dropdown");
		
	}

}
