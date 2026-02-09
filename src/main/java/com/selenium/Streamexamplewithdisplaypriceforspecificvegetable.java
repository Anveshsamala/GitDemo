package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Streamexamplewithdisplaypriceforspecificvegetable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		int all = driver.findElements(By.xpath("//tbody//tr")).size();
		// System.out.println(all);
		for (int i = 1; i < all; i++) {
			String vegieName = driver.findElement(By.xpath("//tr[" + i + "]//td[1]")).getText();
			String price = driver.findElement(By.xpath("//tr[" + i + "]//td[2]")).getText();
			if (vegieName.equals("Rice")) {
				System.out.println(vegieName + " = " + price);
				break;
			}
		}
	}

}
