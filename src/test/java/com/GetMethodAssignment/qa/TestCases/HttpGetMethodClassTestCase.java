package com.GetMethodAssignment.qa.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.GetMethodAssignment.qa.RestClients.HttpGetMethodClass;
import com.GetMethodAssignment.qa.TestBase.TestBase;

public class HttpGetMethodClassTestCase extends TestBase{
	
	String hosturl;
	String serviceurl;
	String uri;
	
	public HttpGetMethodClassTestCase()
	{
		super();
	}

	@BeforeMethod
	public void SetUp()
	{
		hosturl=prop.getProperty("HostingURL");
		serviceurl=prop.getProperty("ServiceURL");
		uri=hosturl+serviceurl;
		System.out.println("GET API URI requested to Server::"+uri);
	}
	
	@Test
	public void HttpGetMethodCallTest()
	{
		HttpGetMethodClass httpGetClass=new HttpGetMethodClass();
		httpGetClass.HttpGetMethodCall(uri);
	}
}
