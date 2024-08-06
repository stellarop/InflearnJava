package Intermediate2.collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("학생1", 50);
        System.out.println(map1);

        // 학생이 없는 경우에만 추가
        if (!map1.containsKey("학생1")){
            map1.put("학생1", 90);
        }
        System.out.println(map1);

        // 학생이 없는 경우에만 추가
        map1.putIfAbsent("학생1", 90);
        map1.putIfAbsent("학생2", 100);
        System.out.println(map1);
    }
}
