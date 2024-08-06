package Intermediate2.collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"JSP", "20000"},
                {"Spring", "30000"} };

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < productArr.length; i++) {
            map.put(productArr[0 + i][0], Integer.parseInt(productArr[0 + i][1]));
        }

        System.out.println(map);
    }
}
