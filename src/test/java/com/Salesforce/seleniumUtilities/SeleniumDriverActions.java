package com.Salesforce.seleniumUtilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.Salesforce.driverBase.BaseTest;

public class SeleniumDriverActions {

	public static void switchToDefaultContent() {
		BaseTest.getDriver().switchTo().defaultContent();
	}

	public static String getTitle() {
		try {
			return BaseTest.getDriver().getTitle();
		} catch (Exception e) {
			throw e;
		}
	}

	public static String getCurrentUrl() {
		try {
			return BaseTest.getDriver().getCurrentUrl();
		} catch (Exception e) {
			return "";
		}
	}

	public static void refresh() {
		BaseTest.getDriver().navigate().refresh();
	}

	public void pageLoadTimeOut(long time) {
		BaseTest.getDriver().manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}

	public static void switchingMultipleWindowByTitle(String title) {
		Set<String> windows = BaseTest.getDriver().getWindowHandles();
		for (String window : windows) {
			BaseTest.getDriver().switchTo().window(window);

			if (BaseTest.getDriver().getTitle().contains(title)) {
				break;
			}
		}
	}

	public static void handleAlerts(String value, String status) {
		if (value.isEmpty() && status.equalsIgnoreCase("accept")) {
			BaseTest.getDriver().switchTo().alert().accept();
		} else if (value.isEmpty() && status.equalsIgnoreCase("dismiss")) {
			BaseTest.getDriver().switchTo().alert().dismiss();
		} else {
			BaseTest.getDriver().switchTo().alert().sendKeys(value);
			BaseTest.getDriver().switchTo().alert().accept();
		}
	}
}
