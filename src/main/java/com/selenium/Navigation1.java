package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation1 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();//maximise the browser
	driver.get("https://www.google.com/");//it will load all the components in that page
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");//this to() method open the url but not wait until all the components loaded
	driver.navigate().back();//back to previous page
	driver.navigate().forward();//forward to next page
	driver.navigate().refresh();//refresh the current page
	System.out.println("all executed");
	//https://rahulshettyacademy.com/dropdownsPractise/
}
	
	
}
