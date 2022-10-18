package com.Salesforce.PomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Salesforce.seleniumUtilities.SeleniumWebElements;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	public void clickOnHeadertab(String text) throws Exception
	{
		WebElement headerTab = driver.findElement(By.xpath("//a[@title='"+text+"']"));
		SeleniumWebElements.clickByJavascript(headerTab);
	}
}
