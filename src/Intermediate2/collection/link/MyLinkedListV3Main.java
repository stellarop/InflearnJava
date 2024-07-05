package Intermediate2.collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> list1 = new MyLinkedListV3();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        // 제네릭으로 타입 지정을 했기 때문에 타입 안정성 증가
        String str = list1.get(0);
        System.out.println("str = " + str);

        MyLinkedListV3<Integer> list2 = new MyLinkedListV3();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        Integer integer = list2.get(0);
        System.out.println("integer = " + integer);
        

    }
}
