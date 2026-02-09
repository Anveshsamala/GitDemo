package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximise the browser
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		// //div[text()='BLR']
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[text()='BLR']")).click();
		//parent child relation xpath-//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq'] //div[text()='AYJ']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='MAA']")).click();
		//parent child relation xpath for destination- //div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[text()='HYD']
		
		

	}

}
