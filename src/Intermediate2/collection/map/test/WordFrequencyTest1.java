package Intermediate2.collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();

        // 단어마다 배열에 삽입
        String[] arr = text.split(" ");

        for (String s : arr) {
//            // mpa 에 해당 단어 꺼내기
////            Integer count = map.get(s);
////            // 이때 null 이라면 0으로 고정
////            if(count == null){
////                count = 0;
////            }
////            // map 에 해당 단어 존재 시 count ++
////            count++;
////            // 단어 + count map에 삽입
////            map.put(s, count);
            // getOrDefault() = 해당 단어 조회 후 없으면 0 으로 치환
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.println(map);
     }
}
