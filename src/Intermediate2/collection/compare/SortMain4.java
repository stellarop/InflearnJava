package Intermediate2.collection.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);

        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 정렬");

        // 별도의 비교자가 없으므로 Comparable 로 정렬
        // list.sort(null);
        // 별도의 비교자로 비교할 시 Collections.soft 사용
        Collections.sort(list);
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        // list.sort(new IdComparator());
        Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}
