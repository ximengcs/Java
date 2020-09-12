package demo;

import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;


public class main {
   
   public static final String APP_ID = "";
   public static final String API_KEY = "";
   public static final String SECRET_KEY = "";

   public static void main(String[] args) {
       
       AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

      
       HashMap<String, String> options = new HashMap<String, String>();
       options.put("language_type", "CHN_ENG");
       options.put("detect_direction", "true");
       options.put("detect_language", "true");
       options.put("probability", "true");
       
       String image = "C:\\apache-tomcat-6.0.30\\webapps\\picture-text-demo\\images\\new.jpg";
       JSONObject res = client.basicGeneral(image, options);
       JSONArray words = res.getJSONArray("words_result");
       Iterator<Object> it = words.iterator();
       String result = "";
       while(it.hasNext()) {
       	JSONObject ob = (JSONObject) it.next();
       	result += ob.getString("words");
       }
       System.out.println(result);
   }
}
