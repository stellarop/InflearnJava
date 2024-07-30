package Intermediate2.collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < inputArr.length; i++) {
            set.add(inputArr[i]);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
