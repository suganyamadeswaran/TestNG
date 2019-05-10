package com.testNG.testCases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testNG.pages.fb.DashboardPage;
import com.testNG.pages.fb.LoginPage;

public class FBTest {
	private WebDriver driver;
	WebDriverWait wait;
	LoginPage login;
	DashboardPage dashboard;
	@BeforeMethod
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
		driver = new ChromeDriver(options);
		wait=new WebDriverWait(driver,20);
		login = new LoginPage(driver);
		dashboard = new DashboardPage(driver, wait);
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void login() throws InterruptedException {
		
		login.username().sendKeys("suganyamadeswaran@gmail.com");
		login.password().sendKeys("puppyboy06");
		login.login().click();
		dashboard.search().click();
		dashboard.search().sendKeys("Santhosh");
		
//		driver.findElement(By.id("userNavigationLabel")).click();
//		driver.findElement(By.xpath("//span[@class='_54nh'")).click();
		Thread.sleep(1000);
	}
	@Test
	public void loginSanthosh() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		login.username().sendKeys("santhoshnebalan@gmail.com");
		login.password().sendKeys("puppyboy06");
		login.login().click();
		dashboard.search().click();
		dashboard.search().sendKeys("Santhosh");
		Thread.sleep(1000);
		

	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
