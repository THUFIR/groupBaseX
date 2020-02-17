package basex;

import org.json.JSONObject;

public class JsonHelper {

    public JsonHelper() {
    }

    public JSONObject convert(Person person) {
        JSONObject jsonObject = null;
        jsonObject = new JSONObject();

        int i = 0;
        for (String attribute : person.getAttributes()) {
            jsonObject.put(Integer.toString(i), attribute);
            i++;
        }
        jsonObject.put("name", person.getName());
        return jsonObject;
    }
}
