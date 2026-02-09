package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownspractise1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximise the browser
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select=new Select(staticDropdown);
		select.selectByIndex(2);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("USD");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("INR");
		System.out.println(select.getFirstSelectedOption().getText());
	}

}
