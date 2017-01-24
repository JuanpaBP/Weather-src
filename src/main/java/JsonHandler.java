import org.json.JSONObject;
import org.json.JSONTokener;
import sun.misc.IOUtils;

import java.net.URL;
import java.util.List;
import java.util.Map;

public class JsonHandler{
    Map<String, Object> RestResponse;
    List<String> messages;
    List<CountryRecords> results;
}