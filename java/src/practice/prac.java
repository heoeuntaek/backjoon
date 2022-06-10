package practice;

import com.google.gson.Gson;
import lombok.ToString;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


@ToString
class Employee {
    private long id;
    private String name;
    private String email;

    Employee(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

public class prac {

    public static void main(String[] args) throws JSONException {

        // Create a JSONObject
        JSONObject jo = new JSONObject();
        jo.put("name", "Jone");
        jo.put("city", "Seoul");


        System.out.println(jo.toString());


        // Create a JSONObject from a Map
        Map<String, String> map = new HashMap<>();
        map.put("이름", "으냍ㄱ");
        map.put("도시", "인천");

        JSONObject jor = new JSONObject(map);

        System.out.println(jor);


        // Create a JSONObject from a Java Object
        String jsonString = "{\"id\":1234,\"name\":\"Michael\",\"email\":\"m1123@google.com\"}";

        Gson gson = new Gson();
        Employee employee = gson.fromJson(jsonString, Employee.class);
        System.out.println(employee);




        // Create a map from a JSONObject
        Gson gson2 = new Gson();
        Map map2 = new HashMap(); 

        map2 = (Map) gson2.fromJson(jo.toString(), map2.getClass());
        System.out.println("map2 = " + map2);
        System.out.println("map2.get(\"city\")"+map2.get("city"));
        


    }

}