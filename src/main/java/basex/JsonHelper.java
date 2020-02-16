package basex;

import org.json.JSONObject;

public class JsonHelper {

    public JsonHelper() {
    }

    JSONObject convert(Person p) {
        JSONObject j = null;
        j = new JSONObject();

        j.put("name", p.getName());
        int i = 0;
        for (String s : p.getAttributes()) {
            j.put(Integer.toString(i), s);
        }
        return j;
    }

}
