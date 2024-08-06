package Intermediate2.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("학생1", 90);
        map1.put("학생2", 80);
        map1.put("학생3", 80);
        map1.put("학생4", 70);

        System.out.println(map1);

        Integer result = map1.get("학생1");
        System.out.println("result : " + result);

        // keySet 활용
        // 모든 키 리턴은 Set 자료구조로 리턴된다
        // 유일성 보장, 순서 보장 x (map 자료구조에서 key 는 set 이랑 동일)
        Set<String> keySet = map1.keySet();
        System.out.println("keyList : " + keySet);

        for (String key : keySet) {
            Integer value = map1.get(key);
            System.out.println("key : " + key + ", value : " + value);
        }

        // entrySet 활용
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            // Entry 는 key 와 value 를 저장하는 객체
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key : " + key + ", value : " + value);
        }
        

        // values 활용
        Collection<Integer> values = map1.values();
        for (Integer value : values) {
            System.out.println("value : " + value);
        }

    }
}
