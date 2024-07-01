package Intermediate2.collection.array;

import java.util.ArrayList;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> list = new MyArrayListV4();
        list.add("a");
        list.add("b");
        list.add("c");
        String str = list.get(0);
        System.out.println("str : " + str);

    }
}
