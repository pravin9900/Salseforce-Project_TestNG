package com.Salesforce.PomPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Salesforce.DataDrivers.readPropertiesFile;
import com.Salesforce.seleniumUtilities.SeleniumWebElements;

public class NewLead {

	WebDriver driver ;
	
	@FindBy (xpath = "//button[@name='salutation']")
	private WebElement salutation ;
	
	@FindBy (xpath = "//div[text()='New']")
	private WebElement btn_new ;
	
	@FindBy (xpath = "//input[@name='firstName']")
	private WebElement firstName ;
	
	@FindBy ( xpath = "//input[@name='lastName']")
	private WebElement lastName ;
	
	@FindBy (xpath = "//input[@name='MobilePhone']")
	private WebElement mobile ;
	
	@FindBy (xpath = "//input[@name='Company']")
	private WebElement company ;
	
	@FindBy (xpath = "//input[@name='Title']")
	private WebElement title ;
	
	@FindBy (xpath = "//input[@name='Email']")
	private WebElement email ;
	
	@FindBy (xpath = "//button[@aria-label='Lead Source, --None--']")
	private WebElement leadSource ;
	
	@FindBy (xpath = "//button[@aria-label='Industry, --None--']")
	private WebElement industry ;
	
	@FindBy (xpath = "//button[@aria-label='Lead Status, Open - Not Contacted']")
	private WebElement leadStatus ;
	
	@FindBy (xpath = "//button[@aria-label='Rating, --None--']")
	private WebElement rating ;
	
	@FindBy (xpath = "//input[@name='AnnualRevenue']")
	private WebElement annualRevenue ;
	
	@FindBy (xpath = "//input[@name='NumberOfEmployees']")
	private WebElement noOfEmployee ;
	
	@FindBy (xpath = "//textarea[@name='street']")
	private WebElement street ;
	
	@FindBy (xpath = "//input[@name='city']")
	private WebElement city ;
	
	@FindBy (xpath = "//input[@name='province']")
	private WebElement state ;
	
	@FindBy (xpath = "//input[@name='postalCode']")
	private WebElement postalCode ;
	
	@FindBy (xpath = "//input[@name='country']")
	private WebElement country ;
	
	@FindBy (xpath = "//button[@aria-label='Product Interest, --None--']")
	private WebElement productInterest ;
	
	@FindBy (xpath = "//button[@aria-label='Primary, --None--']")
	private WebElement primary ;
	 
	@FindBy (xpath = "(//textarea[@class='slds-textarea'])[2]")
	private WebElement description ;
	
	@FindBy (xpath = "//button[@name='SaveEdit']")
	private WebElement save_Btn ;
	
	public NewLead(WebDriver driver) {
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	public void clickOnNewButton() throws Exception
	{
		SeleniumWebElements.clickOnElement(btn_new);
	}
	
	public void newLeadFillInfo() throws Exception {
		SeleniumWebElements.clickOnElement(salutation);
		salutation.sendKeys(Keys.ARROW_DOWN);
		salutation.sendKeys(Keys.ENTER);
		
		SeleniumWebElements.enterInputIntoElement(firstName, readPropertiesFile.readData("firstName"));
		SeleniumWebElements.enterInputIntoElement(lastName, readPropertiesFile.readData("lastName"));
		SeleniumWebElements.enterInputIntoElement(mobile, readPropertiesFile.readData("mobile"));
		SeleniumWebElements.enterInputIntoElement(company, readPropertiesFile.readData("company"));
		SeleniumWebElements.enterInputIntoElement(title, readPropertiesFile.readData("title"));
		SeleniumWebElements.enterInputIntoElement(email, readPropertiesFile.readData("email"));
		SeleniumWebElements.enterInputIntoElement(annualRevenue, readPropertiesFile.readData("annualRevenue"));
		
		SeleniumWebElements.clickOnElement(leadSource);
		leadSource.sendKeys(Keys.ARROW_DOWN);
		leadSource.sendKeys(Keys.ARROW_DOWN);
		leadSource.sendKeys(Keys.ENTER);
		
		SeleniumWebElements.clickOnElement(industry);
		industry.sendKeys(Keys.ARROW_DOWN);
		industry.sendKeys(Keys.ENTER);
		
		SeleniumWebElements.clickOnElement(leadStatus);
		leadStatus.sendKeys(Keys.ARROW_DOWN);
		leadStatus.sendKeys(Keys.ARROW_DOWN);
		leadStatus.sendKeys(Keys.ENTER);
		
		SeleniumWebElements.clickOnElement(rating);
		rating.sendKeys(Keys.ARROW_DOWN);
		rating.sendKeys(Keys.ARROW_DOWN);
		rating.sendKeys(Keys.ENTER);
		
		SeleniumWebElements.enterInputIntoElement(noOfEmployee, readPropertiesFile.readData("noOfEmp"));
		SeleniumWebElements.enterInputIntoElement(street, readPropertiesFile.readData("street"));
		SeleniumWebElements.enterInputIntoElement(city, readPropertiesFile.readData("city"));
		SeleniumWebElements.enterInputIntoElement(state, readPropertiesFile.readData("state"));
		SeleniumWebElements.enterInputIntoElement(country, readPropertiesFile.readData("country"));
		SeleniumWebElements.enterInputIntoElement(postalCode, readPropertiesFile.readData("postalCode"));

		SeleniumWebElements.clickByJavascript(productInterest);
		productInterest.sendKeys(Keys.ARROW_DOWN);
		productInterest.sendKeys(Keys.ARROW_DOWN);
		productInterest.sendKeys(Keys.ENTER);
		
		
		SeleniumWebElements.clickOnElement(primary);
		primary.sendKeys(Keys.ARROW_DOWN);
		primary.sendKeys(Keys.ARROW_DOWN);
		primary.sendKeys(Keys.ENTER);
		
		SeleniumWebElements.enterInputIntoElement(description, readPropertiesFile.readData("description"));
		SeleniumWebElements.clickOnElement(save_Btn);
		
		
	}
	
}
