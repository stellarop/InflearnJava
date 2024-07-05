package Intermediate2.collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object o){
        // 새로운 값이 추가 되면 새로운 노드 객체를 생성
        Node newNode = new Node(o);


        // 최초 추가 시 노드 참조 변수(first)가 null 이다
        if(first == null){
            // 노드 참조 변수에 노드 객체 참조값 삽입
            first = newNode;
        }else{
            // 최초 삽입이 아닐 시 마지막 노드 객체를 찾은 후 마지막 노드
            // 객체의 참조 변수의 새로운 노드 객체 주소값 할당(연결 리스트이기 때문)
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    public void add(int index, Object o){
        Node newNode = new Node(o);

        if(index == 0){
            // 인덱스를 0으로 지정해서 삽입 시 기존 0번째 노드는 다음 참조값으로 이동하고
            newNode.next = first;
            // 새로 삽입된 노드는 기존(첫번째) 노드에 삽입된다
            first = newNode;
        }else {
            // 중간에 노드를 삽입한다면 삽입 직전 노드를 찾는다
            Node prev = getNode(index - 1);
            // 삽입 직전 노드의 참조값을 새로운 노드의 다음 참조값으로 대입
            newNode.next = prev.next;
            // 뭐지 이건?.. 이해가 되면 따로 메모
            // 직전 노드의 참조값에 삽입한 노드를 대입
            // 새로 삽입된 노드와 직전 노드의 위치를 스왑하는 과정
            // 연결 리스트 이기 때문에 밀거나 당기는 배열 리스트와 다르게 노드를 스왑해서 연결한다
            prev.next = newNode;
        }
        size++;
    }

    public Object remove(int index){
        // 삭제할 노드를 인덱스로 찾는다
        Node removeNode = getNode(index);
        // 삭제할 노드의 값을 구한다
        Object removeItem = removeNode.item;

        // 삭제할 인덱스가 첫번째 노드라면
        if(index == 0){
            // 삭제 노드의 다음 노드 참조값을 첫번째 노드에 대입
            first = removeNode.next;
        }else{
            // 삭제 전 노드의 인덱스를 구함
            Node prev = getNode(index -1);
            // 삭제 전 노드의 다음 참조값을 연결
            prev.next = removeNode.next;

        }
        removeNode.next = null;
        removeNode.item = null;
        size--;
        return removeItem;
    }

    private Node getLastNode() {
        Node x = first;

        // 제일 마지막 노드는 다음 노드의 참조값이 null 이다
        // 노드의 다음 참조 변수가 null 일때까지 반복한다
        while (x.next != null){
           x = x.next;
        }
        // 반복 후 마지막 노드를 찾으면 리턴
        return x;
    }

    public Object set(int index, Object o){
        // 해당 인덱스의 노드 찾기
        Node x = getNode(index);
        // 새로운 값 삽입 이전에 있던 노드의 값을 꺼낸다
        Object oldValue = x.item;
        // 새로운 값을 해당 노드에 삽입한다.
        x.item = o;
        return oldValue;
    }

    public Object get(int index){
        // 해당 인덱스에 해당하는 노드 객체를 찾아서
        Node node = getNode(index);
        // 노드의 값 리턴
        return node.item;
    }

    private Node getNode(int index) {
       Node x = first;

       // 찾고자 하는 인덱스까지 반복 후 해당 인덱스에 맞는 노드 객체를 찾는다
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        // 해당 인덱스의 노드 객체 리턴
        return x;
    }

    public int indexOf(Object o){
        int index = 0;

        // 노드의 값이 null 이 아닐때까지 반복
        for (Node x = first; x != null; x = x.next) {
            // 찾고자하는 값과 노드의 값을 비교 후 같으면 index 리턴
            if (o.equals(x.item)){
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
