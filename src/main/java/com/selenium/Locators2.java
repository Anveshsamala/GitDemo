package com.selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String name = "Rahulshetty";
		String password=getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		// driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();// xpath with contains
		Thread.sleep(1000);
		String actualresult = driver.findElement(By.tagName("p")).getText();
		System.out.println(actualresult);
		String expectedresult = "You are successfully logged in.";
		Assert.assertEquals(actualresult, expectedresult);

		String actualusernnn = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		String expectedusernnn = "Hello " + name + ",";
		Assert.assertEquals(actualusernnn, expectedusernnn);

		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		//driver.close();
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();//linktext
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();//css with classname use tagname.classname
		String retrivepasswordtext=driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(retrivepasswordtext);
		String[] retrivetext1=retrivepasswordtext.split("'");
		System.out.println(retrivetext1[0]);
	//	System.out.println(retrivetext1[1]);
		System.out.println(retrivetext1[2]);
		String[] retrivetext2=retrivetext1[1].split("'");
		System.out.println(retrivetext2[0]);
	//	System.out.println(retrivetext2[1]);
		String password=retrivetext2[0];
		
		return password;
		
	}

}
