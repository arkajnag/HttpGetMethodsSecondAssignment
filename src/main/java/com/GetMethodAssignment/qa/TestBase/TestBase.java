package com.GetMethodAssignment.qa.TestBase;

import java.io.FileInputStream;
import java.util.Properties;

public class TestBase {
	
	public static Properties prop;
	public TestBase()
	{
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("/Users/arka/Documents/workspace/HttpGetMethodsSecondAssignment/src/main/java/com/GetMethodAssignment/qa/Config/config.properties");
	     	prop.load(ip);
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}

}
