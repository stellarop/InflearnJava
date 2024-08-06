package Intermediate2.collection.map.test;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> list = new ArrayList<>();

        for (String key : map.keySet()) {
            if(Integer.parseInt((String.valueOf(map.get(key)))) == 1000){
                list.add(key);
            }
        }

        System.out.println(list);

    }
}
