package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClalenderOnetrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximise the browser
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
		//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']
	}

}
