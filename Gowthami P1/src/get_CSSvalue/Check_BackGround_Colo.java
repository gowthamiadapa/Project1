package get_CSSvalue;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_BackGround_Colo
{

	public static void main(String[] args) throws Exception  
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		String RGBA_BgColor=loginbutton.getCssValue("background-color");
		System.out.println(RGBA_BgColor);
		
		
		String HexColorCode="#0095f6";
		
		//This Feature only available in selenium 4 Version
		Color ObjColor=Color.FromString(RGBA_BgColor);
		
		if(ObjColor).asHex().equals(HexColorCode))
			System.out.println("Testpass, Color is matching");
		
		else
			System.out.println("Testfail, Color mismatched");

		
	}

}
