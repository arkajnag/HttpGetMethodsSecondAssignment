package com.GetMethodAssignment.qa.RestClients;

import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import com.GetMethodAssignment.qa.TestBase.TestBase;

public class HttpGetMethodClass extends TestBase{
	
	public void HttpGetMethodCall(String URI)
	{
		CloseableHttpClient httpClient= HttpClients.createDefault();
		HttpGet httpGetCall=new HttpGet(URI);
		try {
			CloseableHttpResponse httpResponse=httpClient.execute(httpGetCall);
			
			int ResponseStatusCode=httpResponse.getStatusLine().getStatusCode();
			System.out.println("Response Status Code::"+ResponseStatusCode);
			
			String ResponseBodyString= EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
			System.out.println("Complete Response Body in String::"+ResponseBodyString);
			JSONObject JsonResponse=new JSONObject(ResponseBodyString);
			System.out.println("Complete Response Body in JSON::"+JsonResponse);
			
			Header[] headerResponse=httpResponse.getAllHeaders();
			HashMap<String, String> headerHashMap=new HashMap<String, String>();
			for(Header headerarray:headerResponse)
			{
				headerHashMap.put(headerarray.getName(), headerarray.getValue());
			}
			System.out.println("Complete Response Header:"+headerHashMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
