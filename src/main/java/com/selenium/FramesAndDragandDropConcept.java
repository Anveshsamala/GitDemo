package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesAndDragandDropConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//iframe[@class='demo-frame']")).isDisplayed());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		System.out.println(source.isDisplayed());
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		System.out.println(target.isDisplayed());
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target);
		System.out.println("done all the steps");

	}

}
