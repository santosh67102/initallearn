package Test;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseTest.TestBase;
import restAssured.REST;
import util.TestUtil;


public class TestREST extends TestBase {

	
	
	TestBase testBase;
	String apiUrl;
	String serviceUrl;
	String url;
	REST restClient;
	CloseableHttpResponse closeableHttpResponse;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
	testBase = new TestBase();
	serviceUrl = prop.getProperty("URL");
	apiUrl = prop.getProperty("serviceURL");
	url= serviceUrl + apiUrl;
	}
	
	@Test
	public void getAPITestWithHeader() throws ClientProtocolException, IOException {
	restClient = new REST();
	HashMap<String, String> headerMap = new HashMap<String, String>();
	headerMap.put("Content-Type", "application/json");
	headerMap.put("Server", "cloudflare");
	// headerMap.put("password", "apasdon");
	// headerMap.put("Auth Token", "ahsgkfdashfkam");
	
	closeableHttpResponse=restClient.get(url, headerMap);
	//a. status Code.
		int statusCode= closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code--->" + statusCode);
		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");
	//b Json String
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response Json-->" + responseJson);
	//single assertion
	//per page
		String perPageValue= TestUtil.getValueByJPath(responseJson, "/per_page");
		System.out.println("value of per page is " + perPageValue);
		Assert.assertEquals(Integer.parseInt(perPageValue), 3);
	//total 
		String totalValue= TestUtil.getValueByJPath(responseJson, "/total");
		System.out.println("value of total is " + totalValue);
		Assert.assertEquals(Integer.parseInt(totalValue), 12);
	//JSON array
		String lastName = TestUtil.getValueByJPath(responseJson, "/data[0]/last_name");
		String id = TestUtil.getValueByJPath(responseJson, "/data[0]/id");
		String avatar = TestUtil.getValueByJPath(responseJson, "/data[0]/avatar");
		String firstName = TestUtil.getValueByJPath(responseJson, "/data[0]/first_name");
		System.out.println(lastName);
		System.out.println(id);
		System.out.println(avatar);
		System.out.println(firstName);
	//c. All Headers
		Header[] headerArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for(Header header : headerArray) {
		allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("Headers Array-->" + allHeaders);
		}
		}

