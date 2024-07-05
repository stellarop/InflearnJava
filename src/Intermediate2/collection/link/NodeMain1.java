package Intermediate2.collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기 A -> B -> C
        Node first = new Node("A");
        // A 인스턴스 Node 변수에 B가 들어간 참조값을 삽입
        first.next = new Node("B");
        // B 인스턴스에 Node 변수에 C가 들어간 참조값을 삽입(하위에서 상위로 접근)
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색");

        // 처음 노드를 생성한 제일 상위 인스턴스 삽입
        Node x = first;
        while (x != null){
            // 노드 값 출력
            System.out.println(x.item);
            // 인스턴스 변수의 참조값을 하위 노드 인스턴스로 변환
            x = x.next;
        }
    }
}
