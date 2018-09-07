package restAssured;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;



public class REST {

	//GET Method
	public CloseableHttpResponse get(String url, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url); //http get request
		
		for(Map.Entry<String, String>entry : headerMap.entrySet()) {
		httpget.addHeader(entry.getKey(),entry.getValue());
		}
		CloseableHttpResponse closeableHttpResponse= httpClient.execute(httpget);// hit the GET URL
		return closeableHttpResponse;
		}
	
	//POST Method
	
	public CloseableHttpResponse post(String url, String entityString, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost(url); //http for POST Request
		httppost.setEntity(new StringEntity(entityString)); //for payload
		
		for(Map.Entry<String, String>entry : headerMap.entrySet()) {
			httppost.addHeader(entry.getKey(),entry.getValue());
			}
		CloseableHttpResponse closeableHttpResponse= httpClient.execute(httppost);
		return closeableHttpResponse;
	}


}
