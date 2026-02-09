package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:rahulshettyacademy.com/angularpractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement check = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		boolean toCheck = check.isEnabled();
		System.out.println(toCheck);		
		check.sendKeys("Rahul");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL);
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL);
		
		 
		driver.close();
			
	}
}
