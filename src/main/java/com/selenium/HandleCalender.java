package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleCalender {

	public static void main(String[] args) {
		String day = "15";
		String month = "6";
		String year = "2027";
		String[] expectedDob = { month, day, year };

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + day + "']")).click();

		List<WebElement> actualDob = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i = 0; i < actualDob.size(); i++) {
			System.out.println(actualDob.get(i).getAttribute("value"));
			Assert.assertEquals(actualDob.get(i).getAttribute("value"), expectedDob[i]);
		}

	}

}
