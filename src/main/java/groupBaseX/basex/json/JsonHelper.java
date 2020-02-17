package groupBaseX.basex.json;

import groupBaseX.io.Person;
import org.json.JSONObject;

public class JsonHelper {

    private Person person = null;

    private JsonHelper() {
    }

    public JsonHelper(Person person) {
        this.person = person;
    }

    public JSONObject convert() {
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
