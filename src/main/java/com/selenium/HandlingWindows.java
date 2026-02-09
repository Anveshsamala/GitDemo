package com.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		String parent = driver.getWindowHandle();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		// using Iterator loop
//		Iterator<String> window=windows.iterator();//parentwin, childwin
//		String parent=window.next();
//		String child=window.next();
		// using for-each loop
		for (String window : windows) {
			if (!window.equals(parent)) {
				driver.switchTo().window(window);
				System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
				String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
						.split(" ")[0];
				System.out.println(emailId);
				driver.switchTo().window(parent);
				driver.findElement(By.cssSelector("#username")).sendKeys(emailId);

			}
		}
	}

}
