package Intermediate2.collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("학생1", 90);

        System.out.println(map1);
        // 같은 key 에 저장 시 기존 값 교체
        map1.put("학생1", 100);
        System.out.println(map1);

        // key 값으로 조회
        boolean containsKey = map1.containsKey("학생1");
        System.out.println("containsKey : " + containsKey);

        // 값 삭제
        map1.remove("학생1");
        System.out.println(map1);
    }
}
