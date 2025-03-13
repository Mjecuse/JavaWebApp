import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
public class JSONWriter {
public static void writeToJsonFile(String filename, String data) {
     JSONObject json = new JSONObject();
     json.put("data", data);
     try (FileWriter file = new FileWriter(filename)) {
         file.write(json.toJSONString());

         file.flush();

     } catch (IOException e) {

         e.printStackTrace();

     }

}

}
