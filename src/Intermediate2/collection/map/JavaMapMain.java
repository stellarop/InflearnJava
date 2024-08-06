package Intermediate2.collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map){
        System.out.println("map : " + map);
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);

        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            System.out.println("key : " + key + ", value : " + map.get(key));
        }

        System.out.println(map);
        

    }
}
