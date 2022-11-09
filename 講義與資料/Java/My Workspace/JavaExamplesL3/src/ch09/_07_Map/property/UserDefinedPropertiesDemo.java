package ch09._07_Map.property;

import java.util.Enumeration;
import java.util.Properties;

public class UserDefinedPropertiesDemo {
	// 本程式示範如何使用使用者自定環境變數
	// MM->Run->Run Configurations->Arguments

	public static void main(String[] args) {
		String value1 = System.getProperty("xyz", "Not Found");
		String value2 = System.getProperty("arg2");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println("--------------");
		Properties prop = System.getProperties();
		Enumeration en = prop.propertyNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			System.out.println(key + "-->" + prop.getProperty(key));
		}
	}
}
