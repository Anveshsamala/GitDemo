package com.selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streamexamplewithapplication {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// Capture all webelements into list
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all webelements into new(original) list
		List<String> originalList = elementlist.stream().map(s -> s.getText()).collect(Collectors.toList());
		// sort on the original list -sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));

	}

}
