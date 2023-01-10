package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown_Using_JavaScript {

	public static void main(String[] args)
	{
		
		WebDriver driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		//enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
        
		WebElement DayDropdown=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		js.executeScript("arguments[0].value='13'", DayDropdown);
		
		
		WebElement MonthDropdown=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		js.executeScript("arguments[0].selectedIndex='3'", MonthDropdown);
		
	}

		
}		
		

