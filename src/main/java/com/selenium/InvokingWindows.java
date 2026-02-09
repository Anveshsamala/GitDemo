package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingWindows {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> eachwindow = handles.iterator();
		String parentWindow = eachwindow.next();
		String childWindow = eachwindow.next();
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.xpath("//a[@href='/learning-paths']")).click();
		String name = driver.findElement(By.xpath("(//div[@class='p-6 text-center'])[1]/descendant::h3")).getText();
		driver.switchTo().window(parentWindow);
		WebElement nnn=driver.findElement(By.xpath("//input[@name='name']"));
		nnn.sendKeys(name);
		
		//Partial Screenshot
		File src= nnn.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("partialsc.png"));
		
		// Get Hight and width of that particular field
		System.out.println("Hight is = "+nnn.getRect().getHeight());
		System.out.println("Width is = "+nnn.getRect().getWidth());
	}

}
