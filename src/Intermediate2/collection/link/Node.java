package Intermediate2.collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item){
        this.item = item;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // 자기 자신의 참조값을 리턴
        Node x = this;
        sb.append("[");
        while (x != null){
            sb.append(x.item);
            // 다음 노드의 참조값이 있다면 화살표 포함
            if(x.next != null){
                sb.append("->");
            }
            // 다음 노드의 참조값을 삽입
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
