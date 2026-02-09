package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//parent to child and using following-sibling:: concept here
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		//parent to child then child to parent then preceding-sibling:: sibling
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]/preceding-sibling::button")).getText());
		

	}

}
