package com.selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsusage {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);// allow insucure certifications use this
		Proxy proxy = new Proxy();// set up proxy
		// block popups using chromeoptions
		// add extentions using chromeoptions
		// maximise screen using "start=maximise" addorgument
		// set download directory
		proxy.setHttpProxy("ipaddress:3030");
		options.setCapability("Proxy", proxy);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();// maximise to fullscreen
		driver.manage().deleteAllCookies();// deleting all the cookies
		driver.manage().deleteCookieNamed("session");// deleting specific cookie
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
