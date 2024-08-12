package Intermediate2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
