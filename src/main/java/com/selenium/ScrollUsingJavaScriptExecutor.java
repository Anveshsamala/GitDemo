package com.selenium;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollUsingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll entire window
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		// scroll static table in the webpage
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		// print the sum of the integer values in the table 4rth column
		List<WebElement> xpathamounts = driver
				.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		// List<WebElement> amounts = driver.findElements(By.cssSelector(".tableFixHead
		// table tbody tr td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < xpathamounts.size(); i++) {
			// System.out.println(Integer.parseInt(amounts.get(i).getText()));
			sum = sum + Integer.parseInt(xpathamounts.get(i).getText());
		}
		System.out.println(sum);

		String totalamount = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		// String stringSum=totalamount[1].trim();
		int expSum = Integer.parseInt(totalamount);
		Assert.assertEquals(sum, expSum);
		System.out.println("all the steps are executed successfully");
	}

}
