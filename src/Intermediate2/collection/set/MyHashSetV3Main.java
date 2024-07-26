package Intermediate2.collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);

        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        // 조회
        String searchValue = "B";
        boolean contains = set.contains(searchValue);
        System.out.println("searchValue : " + searchValue + ", contains : " + contains);

    }
}
