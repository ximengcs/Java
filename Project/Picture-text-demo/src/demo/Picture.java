package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;

import sun.misc.BASE64Decoder;


public class Picture {
	
	
	public static boolean getPicture(String str) {
		boolean flag = true;
		if(str == null || str == "") flag = false;
	
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			byte[] bytes = decoder.decodeBuffer(str);
			for(int i=0; i<bytes.length; i++) {
				if(bytes[i] < 0) bytes[i] += 256;
			}
			String imgFilePath = "C:\\apache-tomcat-6.0.30\\webapps\\picture-text-demo\\images\\new.jpg";
			OutputStream out = new FileOutputStream(imgFilePath);
			out.write(bytes);
			out.flush();
			out.close();
		} catch (IOException e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public static String getText() {

		String APP_ID = "";
	   String API_KEY = "";
	   String SECRET_KEY = "";
	   
		
      AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

      
      HashMap<String, String> options = new HashMap<String, String>();
      options.put("language_type", "CHN_ENG");
      options.put("detect_direction", "true");
      options.put("detect_language", "true");
      options.put("probability", "true");
      
      String image = "C:\\apache-tomcat-6.0.30\\webapps\\picture-text-demo\\images\\new.jpg";
      JSONObject res = client.basicGeneral(image, options);
      System.out.println(res);
      JSONArray words = res.getJSONArray("words_result");
      Iterator<Object> it = words.iterator();
      String result = "";
      while(it.hasNext()) {
      	JSONObject ob = (JSONObject) it.next();
      	System.out.println(ob.toString());
      	result += ob.getString("words");
      }
      return result;
	}
}
