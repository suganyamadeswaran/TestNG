package com.testNG.pages.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	

	By username = By.id("email");
	
	public WebElement username() {
		return driver.findElement(username);
	}
	By password = By.id("pass");
	public WebElement password() {
		return driver.findElement(password);
	}
	By login = By.xpath("//input[@type='submit']");
	public WebElement login() {
		return driver.findElement(login);
	}
	
}
