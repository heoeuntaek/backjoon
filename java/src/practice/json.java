package practice;

import org.json.JSONException;
import org.json.JSONObject;

public class json {
    public static void main(String[] args) throws JSONException {

        int[] monday = {1, 1, 1, 1, 1, 1, 1};
        int[] tuesday = {1, 1, 1, 1, 1, 1, 1};
        int[] wednesday = {1, 1, 1, 1, 1, 1, 1};
        int[] thursday = {1, 1, 1, 1, 1, 1, 1};
        int[] friday = {1, 1, 1, 1, 1, 1, 1};
        int[] saturday = {1, 1, 1, 1, 1, 1, 1};
        int[] sunday = {1, 1, 1, 1, 1, 1, 1};

        JSONObject obj = new JSONObject();
        obj.put("monday", monday);
        obj.put("tuesday", tuesday);
        obj.put("wednesday", wednesday);
        obj.put("thursday", thursday);
        obj.put("friday", friday);
        obj.put("saturday", saturday);
        obj.put("sunday", sunday);

        Object monday1 = obj.get("monday");
        System.out.println("monday1 = " + monday1);

        String jsonStr = obj.toString();
        System.out.println("jsonStr = " + jsonStr);



    }
}