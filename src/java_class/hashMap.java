package java_class;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("two", 2);
        a.put("three", 3);
//        System.out.println("three="+java수업.a.get("three"));
//        System.out.println("two="+java수업.a.get("two"));
        iteratorUsingForEach(a);
        iteratorUsingIterator(a);

    }


    static void iteratorUsingForEach(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

    static void iteratorUsingIterator(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()){
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}