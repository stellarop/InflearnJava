package Intermediate2.collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기 A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색");
        System.out.println(first);
    }
}
