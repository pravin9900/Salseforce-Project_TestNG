package com.Salesforce.DataDrivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertiesFile {

	public static String readData(String propertyName)  {
		String Output = "";
		try {
			FileInputStream input;
			input = new FileInputStream("DataFolders/testData.properties");
			Properties prop = new Properties();
			try {
				prop.load(input);

				Output = prop.getProperty(propertyName);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Output;
	}
}
