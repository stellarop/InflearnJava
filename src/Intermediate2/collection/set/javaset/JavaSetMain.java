package Intermediate2.collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        // 입력한 순서를 보장하지 않는다.(해시 코드 기반으로 삽입 되기 때문)
        run(new HashSet<>());
        // 입력한 순서를 보장한다.(링크 구조를 통해서 입력한 순서대로 연결)
        run(new LinkedHashSet<>());
        // 데이터의 값을 기준으로 정렬(데이터의 순서대로 정렬)
        run(new TreeSet<>());

    }

    private static void run(Set<String> set){
        System.out.println("set : " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("2");
        set.add("1");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }
}
