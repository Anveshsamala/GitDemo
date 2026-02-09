package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximise the browser
		driver.get("https://market99.com/?srsltid=AfmBOooV3NJlpF-pbf_lxGoo2feMjebqMbnT_LS9oI6bso2f1DT-hxxr");
		Actions action = new Actions(driver);
		WebElement move = driver.findElement(
				By.xpath("//a[@class='navlink navlink--toplevel navlink--dot caps']/span[@class='navtext']"));
		// move to element action
		action.moveToElement(move).build().perform();
		// click action
		WebElement clickk = driver
				.findElement(By.xpath("(//search-popdown[@class='search-popdown menu__item menu__item--icon'])[2]"));
		action.moveToElement(clickk).click().build().perform();
		// enter capital text in the search bar using keydown(keys.SHIFT)- for press the shift button
		// double click on entered text
		action.moveToElement(clickk).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		WebElement otherelement=driver.findElement(By.xpath("(//a[@aria-controls='cart-drawer'])[2]"));
		//Right click action
		action.moveToElement(otherelement).contextClick().build().perform();
	}

}
