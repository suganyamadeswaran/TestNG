package com.testNG.pages.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	WebDriver driver;
	WebDriverWait wait;

	public DashboardPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	

	By search = By.xpath("//input[@name='q']");

	public WebElement search() {
		
		wait.until(ExpectedConditions.elementToBeClickable(search));
		System.out.println("*********");
		return driver.findElement(search);
	}
	
}
