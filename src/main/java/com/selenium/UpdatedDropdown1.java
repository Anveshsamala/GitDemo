package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatedDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximise the browser
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Adult')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Adult')]")).getText());
		// int i=1;
//		while(i<5)
//		{
//			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//			i++;
//		}
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-k8qxaj r-d9fdf6']/div")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Adult')]")).getText());

	}

}
