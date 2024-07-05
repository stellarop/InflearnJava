package Intermediate2.collection.link;

import static java.awt.AWTEventMulticaster.add;

public class NodeMain3 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기 A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색
        System.out.println("모든 노드 탐색");
        printAll(first);

        // 마지막 노드 조회
        Node lastNode = getLastNode(first);
        System.out.println("lastNode : " + lastNode);

        // 특정 인덱스 조회
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node : " + index2Node);

        // 노드 추가
        System.out.println("노드 추가");
        add(first, "D");
        System.out.println(first);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {

        Node x = node;
        // 노드의 다음 참조값이 null 일때까지 반복
        while (x != null){
            if (x.next == null){
                // 제일 끝엔 마지막 노드의 참조값이 담겨져 있음
                return x;
            }
            x = x.next;

        }

        return null;
    }

    private static Node getNode(Node first, int index) {
        Node x = first;

        // 넘어온 index 만큼 반복 후 리턴
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String param){
        // 노드의 참조값으로 마지막 노드를 구함
        Node lastNode = getLastNode(node);
        // 마지막 노드의 참조값 변수(마지막 노드의 참조값 변수는 null 이다, 마지막 노드여서 그 아래를
        // 참조하지 않기 때문)의 새로운 노드의 참조값을 넣어준다
        lastNode.next = new Node(param);

    }

}
