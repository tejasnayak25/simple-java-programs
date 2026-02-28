package day1;
import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("English", 90);
        map.put("Maths", 95);
        map.put("Science", 80);
        System.out.println(map.containsKey("English"));
        System.out.println(map.containsValue(80));
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() >= 90) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}