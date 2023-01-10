package findelements_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Restricted_Month_And_Dates_Inside_DatePicker
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		
		//open calender
		WebElement calander=driver.findElement(By.cssSelector("#root > div > div > div.container.w-100p.flex-1 > div > div.col-19.h-fc > div > div.col-17 > div > div.pt-8.pb-10.p-relative.px-10.px-4--xs.pt-4--xs.pb-4--xs.home-search-banner > div.row.p-relative > div > div:nth-child(1) > div > div > button:nth-child(1) > div"));
		calander.click();
		Thread.sleep(3000);
		
		By Nextbutton=By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/div/ul/div[3]/div/div[1]/div[2]/svg");
		while(true)
		{
			
			String Runtimeclass=driver.findElement(Nextbutton).getAttribute("class");
			if(Runtimeclass.contains("c-neutral-200"))
			{
			       break;
			       
			}
			
			driver.findElement(Nextbutton).click();
			Thread.sleep(2000);
			
			
			}
	}

}
