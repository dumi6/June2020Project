package com.auto.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public BasePage() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		
		System.out.println("I love God");
	}
}
