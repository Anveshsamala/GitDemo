package com.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingScope {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		// i want to get the count of links in current page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// i want only footer section links count
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));// limiting webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// in footer section 4 different sections are present so i want links in that
		// 1st section
		WebElement childdri = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(childdri.findElements(By.tagName("a")).size());

		// i want to click on each link and check the page opening or not
		for (int i = 1; i < childdri.findElements(By.tagName("a")).size(); i++) {
			String clickontab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			childdri.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));

		}
		// i want to print all the page titles
		Set<String> allpages = driver.getWindowHandles();
		// ieterator method to get all the pages titles
//					Iterator<String> it = allpages.iterator();
//					while (it.hasNext()) {//hasNext() method will check next index present or not 
//						driver.switchTo().window(it.next());//next() will move to the next element
//						System.out.println(driver.getTitle());
//		}
		// for-each method to get all pages titles
		for (String eachwin : allpages) {
			System.out.println(driver.switchTo().window(eachwin).getTitle());
		}
	}

}
