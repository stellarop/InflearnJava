package advanced1.thread.collection.java;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new ConcurrentHashMap<>();
        map1.put(1, "map1");
        map1.put(2, "map2");
        map1.put(3, "map3");
        System.out.println(map1);

        Map<Integer, String> map2 = new ConcurrentSkipListMap<>();
        map2.put(1, "map1");
        map2.put(2, "map2");
        map2.put(3, "map3");  
        System.out.println(map2);
    }
}
