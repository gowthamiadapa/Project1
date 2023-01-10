package switch_command_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Window_Using_Title

{

	  public static void main(String[] args) throws Exception
	  
	  {
		  WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
	        driver.get("https://www.instagram.com");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        
	        
	        String MainWindowID=driver.getWindowHandle();
		    
		    //Clicking Hyperlink [Open Page at New Window/Tab]
		    WebElement Meta=driver.findElement(By.linkText("Meta"));
		    Meta.click();
		    Thread.sleep(2000);
		    
		    //Clicking Hyperlink [Open Page at New Window/Tab]
		    WebElement About=driver.findElement(By.linkText("About"));
		    About.click();
		    Thread.sleep(2000);
		    
		    //Clicking Hyperlink [Open Page at New Window/Tab]
		    WebElement Blog=driver.findElement(By.linkText("Blog"));
		    Blog.click();
		    Thread.sleep(2000);
	}
	

}
