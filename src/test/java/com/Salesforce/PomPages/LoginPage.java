package com.Salesforce.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Salesforce.seleniumUtilities.SeleniumWebElements;

public class LoginPage {

	WebDriver driver;
	@FindBy (xpath = "//input[@id='username']")
	private WebElement txt_userName  ;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement txt_password ;
	
	@FindBy (xpath = "//input[@id='Login']")
	private WebElement btn_login;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	public void loginTosalesforceApp(String userName, String password) throws Exception
	{
		SeleniumWebElements.enterInputIntoElement(txt_userName, userName );
		SeleniumWebElements.enterInputIntoElement(txt_password, password);
		SeleniumWebElements.clickOnElement(btn_login);
	}
	
}
