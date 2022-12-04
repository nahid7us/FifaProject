package com.qa.fifa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {

	
	
	
	@Test
	public void validateSearch() {
		
	//set up chromeDriver
	WebDriverManager.chromedriver().setup();
	// create a webdriver object 
	WebDriver driver = new ChromeDriver();
	
	// open an url 
	driver.get("https://www.google.com");
	// maximuze window 
	driver.manage().window().maximize();
	// type in search box 
	driver.findElement(By.name("q")).sendKeys("fifa World Cup 2022");
	
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	WebElement firstLink = driver.findElement(By.xpath("(//div[@class='ofy7ae'])[1]"));
	String ActualText  = firstLink.getText();
	String expected = "FIFA World Cup Qatar 2022™";
	
	Assert.assertTrue(ActualText.equalsIgnoreCase(expected),
			"Expected" + expected + "but found >> " + ActualText);
	
		
		
			
		
		
		
		
	}
	
	
	

	
	
}
