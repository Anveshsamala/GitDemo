package com.selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonInterviewQuestionForInFutureIWantToAddMultipleProducts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();// maximise the browser
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		// I want to add multiple products then i am using String array and String list
		String[] vegetables = { "Beans", "Mango", "Raspberry", "Cashews", "Nuts Mixture" };// i want to cart all these
		addItems(driver, vegetables);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();// click on cart button
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//div[@class='promoWrapper']/button")).click();

		// Explicitwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='promoWrapper']/span")));
		System.out.println(driver.findElement(By.xpath("//div[@class='promoWrapper']/span")).getText());

	}

	public static void addItems(WebDriver driver, String[] vegetables) {

		List<String> needItemsList = Arrays.asList(vegetables);// convert array to list
		List<WebElement> allProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));// list out all the
		int j = 0; // products
		for (int i = 0; i < allProducts.size(); i++) {
			String prodName = allProducts.get(i).getText();// filter product by product
			String[] prodNameWithSpace = prodName.split("-");// splittend product name into array
			// prodNameWithSpace[0]-exact product name with space
			// prodNameWithSpace[1]- 1 KG text

			String prodWithoutSpace = prodNameWithSpace[0].trim();// remove space

			if (needItemsList.contains(prodWithoutSpace)) {// compare
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if (j == vegetables.length) {
					break;
				}
			}
		}

	}

}
