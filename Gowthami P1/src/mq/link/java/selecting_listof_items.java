package mq.link.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selecting_listof_items
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		//click method to open list of items
		driver.findElement(By.linkText("Select Product Type")).click();
		
		//click method to select one of item under the list
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@value='5'][contains(.,'EMI')]")).click();
	}

}