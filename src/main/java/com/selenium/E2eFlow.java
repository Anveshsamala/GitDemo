package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2eFlow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximise the browser
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		// click on current date in onetrip
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();

		driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[text()='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz'] //div[text()='MAA']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"))
				.click();

		// click on adult
		driver.findElement(By.xpath("//div[contains(text(),'Adult')]")).click();
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-k8qxaj r-d9fdf6']/div")).click();

		// click on senior citizen chechbox
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		Thread.sleep(1000);

		// driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1i10wst
		// r-1kfrs79']")).click();
		// driver.findElement(By.xpath(
		// "//div[@class='css-1dbjc4n r-1pcd2l5 r-k8qxaj r-glunga r-bnwqim']
		// //div[text()='Search Flight']"))
		// .click();
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"))
				.click();
	}

}
