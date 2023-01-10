package switch_command_Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Second_Window {

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.instagram.com");
        driver.manage().window().maximize();
        Thread.sleep(3000); 
	  
        //Clicking Hyperlink [Open Page at New Window/Tab]
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    
	    //Get All dynamic Window ID's
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	    
	    //Converting set of objects into Iterators
	    Iterator<String> itr=AllWindowIDs.iterator();
	    
	    //Read Each iterator value using Next Keyword
	    String WIN1=itr.next();
	    String WIN2=itr.next();
	    
	    System.out.println("Before Switch Window Title is  --> "+driver.getTitle());
	    driver.switchTo().window(WIN2);
	    Thread.sleep(3000);
	    System.out.println("After Switch Window title is ---> "+driver.getTitle());
	    driver.switchTo().window(WIN1);
	    System.out.println("main Window Title is --> "+driver.getTitle());
	}

}


