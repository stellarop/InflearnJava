package Intermediate2.collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);

        // 첫번째 항목에 추가, 삭제
        list.add(0, "A");
        System.out.println("add 0 : " + list);
        list.remove(0);
        System.out.println("remove 0 : " + list);
        
        // 중간 항목 추가, 삭제
        list.add(1, "B");
        System.out.println("add 1 : " + list);
        list.remove(1);
        System.out.println("remove 2 : " + list);
    }
}
