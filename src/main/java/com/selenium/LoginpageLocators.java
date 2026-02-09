package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginpageLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Anvesh");
		driver.findElement(By.name("inputPassword")).sendKeys("tester");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//css with classname - tagname.classname
		driver.findElement(By.linkText("Forgot your password?")).click();//linktext
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Testing");//xpath
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@gmail.com");//css selector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("tester@gmail.com");//xpath with index
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("John@gmail.com");//css with index
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9550885949");//parentchild and index
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();//css with classname use tagname.classname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());//css with parent child relation parenttagname childtagname
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();//parent to child and index
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Anvesh");//css with ID --tagname#ID
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//css with common element as pass --password,passwwww, passrrrr,passuuuu
		
		driver.findElement(By.id("chkboxOne")).click();
	//	driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();//xpath with contains
		
	}

}
