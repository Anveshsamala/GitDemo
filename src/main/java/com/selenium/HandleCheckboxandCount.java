package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxandCount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximise the browser
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		
		Assert.assertEquals(driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-7o8qx1']")).size(), 6);
		System.out.println(driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-7o8qx1']")).size());
		
		//assertions concept
		
	}

}
