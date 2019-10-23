package com.civicon.parellel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InMultipleBrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void login(String browser)
	{
		
		if (browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		
		for (int i = 0; i <200; i++) {
			WebElement un = driver.findElement(By.id("username"));
			un.clear();
			un.sendKeys("admin");
			
			
		}
		
	}
	

}
