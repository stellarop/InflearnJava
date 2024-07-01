package Intermediate2.collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println("기능 사용");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(2, \"z\") = " + list.set(2, "z"));
        System.out.println(list);
        list.add("d");
        list.add("e");
        System.out.println(list);

        // 범위 초과
        list.add("f");
        System.out.println(list);
    }
}
