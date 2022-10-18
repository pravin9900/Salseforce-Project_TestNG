package com.Salesforce.scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Salesforce.DataDrivers.readPropertiesFile;
import com.Salesforce.PomPages.HomePage;
import com.Salesforce.PomPages.LeadDetails;
import com.Salesforce.PomPages.LoginPage;
import com.Salesforce.PomPages.NewLead;
import com.Salesforce.driverBase.BaseTest;

public class VerifyLeadGeneration {

	WebDriver driver ;
	LoginPage login ;
	HomePage home ;
	NewLead lead ;
	LeadDetails details ;
	
	@BeforeClass
	public void beforeClass()
	{
		
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		driver = BaseTest.launchBrowser(readPropertiesFile.readData("browserName"), readPropertiesFile.readData("url"));
		login = new LoginPage(driver);
		home = new HomePage(driver);
		lead = new NewLead(driver);
		details = new LeadDetails(driver);
	}
	
	@Test
	public void verifyNewLead() throws Exception
	{
		try {
		login.loginTosalesforceApp(readPropertiesFile.readData("userName"), readPropertiesFile.readData("password"));
		home.clickOnHeadertab(readPropertiesFile.readData("tabName"));
		lead.clickOnNewButton();
		lead.newLeadFillInfo();
		details.verifyLeadDetails();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	@AfterClass
	public void afterClass()
	{
		
	}
}
