package Intermediate2.collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printAll(list.iterator());
        forEach(list);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(set.iterator());
        forEach(set);

    }

    private static void printAll(Iterator<Integer> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void forEach(Iterable<Integer> iterable){
        // iterable 은 컬렉션 최상위 부모 타입이라 hashMap 을 제외한 모든 컬렉션을 받을 수 있음
        // iterable 에서 향상된 for 문 제공
        for(Integer i : iterable){
            System.out.println(i);
        }
    }


}
