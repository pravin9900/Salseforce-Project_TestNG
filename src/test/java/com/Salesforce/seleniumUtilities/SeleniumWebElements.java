package com.Salesforce.seleniumUtilities;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Salesforce.driverBase.BaseTest;
import com.Salesforce.listeners.TestNGListeners;
import com.aventstack.extentreports.Status;

public class SeleniumWebElements extends TestNGListeners {

	public static void enterInputIntoElement(WebElement element, String input) {
		try {
			element.isDisplayed();
			element.clear();
			element.sendKeys(input);
			test.log(Status.PASS, element + "Passed");

		} catch (Exception e) {
			test.log(Status.FAIL, element + "Failed");
			throw e;
		}
	}

	public static void clickOnElement(WebElement element) throws Exception {
		try {
			element.click();
			test.log(Status.PASS, element + "Passed");

		} catch (Exception e) {
			test.log(Status.FAIL, element + "Failed");
			throw e;
		}
	}

	public static void Wait(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static String getTextOfElement(WebElement element) {
		try {
			element.isDisplayed();
			return element.getText();
		} catch (Exception e) {
			return "";
		}
	}

	public static String getAttributeOfElement(WebElement element, String attribute) {
		try {
			element.isDisplayed();
			return element.getAttribute(attribute);
		} catch (Exception e) {
			return "";
		}

	}

	public static void clickOnCheckBoxorRadioButton(WebElement element) throws Exception {
		try {
			element.isDisplayed();
			clickOnElement(element);
			test.log(Status.PASS, element + "Passed");
		} catch (Exception e) {
			test.log(Status.FAIL, element + "Failed");
			throw e;
		}
	}

	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement ele : options) {
			if (ele.getText().equalsIgnoreCase(value)) {
				select.selectByValue(value);
				break;
			}
		}
	}

	public static void moveToElement(WebElement element) {
		Actions action = new Actions(BaseTest.getDriver());
		action.moveToElement(element).build().perform();
	}

	public static void dragAndDrop(WebElement sourceEle, WebElement desEle) {
		Actions action = new Actions(BaseTest.getDriver());
		action.dragAndDrop(sourceEle, desEle).build().perform();
	}

	public static void clickByJavascript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) BaseTest.getDriver();
		js.executeScript("arguments[0].click();", element);
	}

	public static void inputValueFromJavascript(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) BaseTest.getDriver();
		js.executeScript("arguments[0].value='" + value + "';", element);
	}

}
