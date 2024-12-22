package advanced1.thread.collection.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleListMainV0 {
    public static void main(String[] args) {
        // 컬렉션에서 제공하는 대부분의 연산은 원자적인 연산이 아니다(멀티 스레드 상황에서 안전하지 않다  )
        List<String> list = new ArrayList<>();

        // 스레드1, 스레드2 동시에 실행 가정

        // 스레드1 실행 가정
        list.add("A");
        // 스레드2 실행 가정
        list.add("B");

        System.out.println(list);

    }
}
