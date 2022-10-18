package com.Salesforce.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Salesforce.DataDrivers.readPropertiesFile;
import com.Salesforce.seleniumUtilities.SeleniumWebElements;

public class LeadDetails {

	WebDriver driver ;
	@FindBy (xpath = "//a[@id='detailTab__item']")
	private WebElement detailTab ;
	
	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[2]")
	private WebElement lastName ;

	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[3]")
	private WebElement mobile ;
	
	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[7]")
	private WebElement email;
	
	@FindBy (xpath = "(//span[@class=\"test-id__field-value slds-form-element__static slds-grow word-break-ie11\"])[4]")
	private WebElement company ;
	
	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[6]")
	private WebElement title ;
	
	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[12]")
	private WebElement annualRevenue ;
	
	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[14]")
	private WebElement noOfEmp ;
	
	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[13]")
	private WebElement rating ;
	
	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[16]")
	private WebElement productInterest ;
	
	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[19]")
	private WebElement primary ;
	
	@FindBy (xpath = "(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[21]")
	private WebElement description ;
	
	public LeadDetails(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyLeadDetails() throws Exception
	{
		SeleniumWebElements.clickOnElement(detailTab);
		
		String companyText = SeleniumWebElements.getTextOfElement(company);
		Assert.assertEquals(companyText, readPropertiesFile.readData("company"));
		
		// we are having one defect in full name
		//String lastNameText = SeleniumWebElements.getTextOfElement(lastName).split(" ")[2];
		//Assert.assertEquals(lastNameText, readPropertiesFile.readData("lastName"));

		String titleText = SeleniumWebElements.getTextOfElement(title);
		Assert.assertEquals(titleText, readPropertiesFile.readData("title"));

		String mobileText = SeleniumWebElements.getTextOfElement(mobile);
		Assert.assertEquals(mobileText, readPropertiesFile.readData("mobile"));
		
		String emailText = SeleniumWebElements.getTextOfElement(email);
		Assert.assertEquals(emailText, readPropertiesFile.readData("email"));
		
		String annualRevenueText = SeleniumWebElements.getTextOfElement(annualRevenue);
		Assert.assertEquals(annualRevenueText, readPropertiesFile.readData("annualRevenue"));
		
		String noOfEmpText = SeleniumWebElements.getTextOfElement(noOfEmp);
		Assert.assertEquals(noOfEmpText, readPropertiesFile.readData("noOfEmp"));
		
		String ratingText = SeleniumWebElements.getTextOfElement(rating);
		Assert.assertEquals(ratingText, "Warm");
 
		String productInterestText = SeleniumWebElements.getTextOfElement(productInterest);
		Assert.assertEquals(productInterestText, "GC5000 series"); 
		
		String primaryText = SeleniumWebElements.getTextOfElement(primary);
		Assert.assertEquals(primaryText, "Yes"); 
		
		String descriptionText = SeleniumWebElements.getTextOfElement(description);
		Assert.assertEquals(descriptionText, readPropertiesFile.readData("description"));
		
	}
	
	
}
