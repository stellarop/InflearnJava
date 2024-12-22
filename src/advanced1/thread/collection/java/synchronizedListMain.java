package advanced1.thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class synchronizedListMain {
    public static void main(String[] args) {
        // Collections.synchronizedList() 메서드에 구현체의 참조값을 넘기면 멀티 스레드 상황에서 안전하다
        // 이전에 학습한 프록시 패턴과 동일
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("data1");
        list.add("data2");
        list.add("data3");
        System.out.println(list.getClass());
        System.out.println(list);
    }
}
