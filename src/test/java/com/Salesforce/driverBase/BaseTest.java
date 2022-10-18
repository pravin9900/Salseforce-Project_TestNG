package com.Salesforce.driverBase;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class BaseTest   {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver launchBrowser(String browserName, String url) throws IOException {
		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", ".\\BrowserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
			break;
		default:
			driver = null;
		}

		return driver;

	}

}
