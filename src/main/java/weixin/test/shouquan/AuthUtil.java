package weixin.test.shouquan;


import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.google.gson.JsonObject;

public class AuthUtil {

	public static final String appId="wxc3716e34c41d93b5";
	public static final String appSecret="865de8a6e51014586391faab7d99df8d";
	
	public  static JsonObject doGetJson(String url) throws ClientProtocolException, IOException{
		JsonObject json = null;
		DefaultHttpClient client=new DefaultHttpClient();
		HttpGet httpGet=new HttpGet(url);
		HttpResponse response=client.execute(httpGet);
		HttpEntity entity=response.getEntity();
		if(entity!=null) {
			String result=EntityUtils.toString(entity,"UTF-8");
			json=JsonObject.class.cast(result);
		}
		return json;
	}
}
