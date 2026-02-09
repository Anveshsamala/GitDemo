package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class ReletaiveLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//using above relative locator
		WebElement name=driver.findElement(By.name("name"));
	//	System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
		
		//using below relative locator
		WebElement password=driver.findElement(By.xpath("//label[@for='exampleInputPassword1']"));
	//	driver.findElement(with(By.tagName("input")).below(password)).sendKeys("passwordanvesh");
		
		WebElement name1= driver.findElement(By.xpath("//label[text()='Name']"));
		driver.findElement(with(By.tagName("input")).below(name1)).sendKeys("userrrrrrrrrrrrrr");
		
		//using toLeft() relative locator
		WebElement text=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	//	driver.findElement(with(By.tagName("input")).toLeftOf(text)).click();
		
		//using toRight() relative locator
		WebElement radiobtn= driver.findElement(By.id("inlineRadio2"));
	//	System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobtn)).getText());
	}

}
