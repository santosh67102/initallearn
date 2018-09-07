package Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import baseTest.TestBase;
import data.Users;
import restAssured.REST;

public class PostAPITest extends TestBase {

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
 public void postAPItest() throws JsonGenerationException, JsonMappingException, IOException { 
	restClient = new REST();
	HashMap<String, String> headerMap = new HashMap<String, String>();
	headerMap.put("Content-Type", "application/json");
	 
	//jackson API
	
	ObjectMapper mapper = new ObjectMapper();
	Users users = new Users("morph", "leader");
	
	//object to Json file:
	mapper.writeValue(new File("/RestAssured/src/main/java/data/users.json"), users);
	
 }
	
	
	
	
}
