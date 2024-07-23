package Intermediate2.collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        // 외부에서 의존관계 주입

        // ArrayList 컬렉션은 인덱스에 접근하는건 굉장히 빠르지만
        // 중간에 값을 추가하는건 굉장히 느리다(인덱스를 처음부터 읽은 다음 값을 추가해야 되기 때문)
        // BatchProcessor list = new BatchProcessor(new MyArrayList<Integer>());
        // LinkedList 컬렉션은 ArrayList 와 반대로 인덱스에 접근하는건 느리지만
        // (정확하게 인덱스는 아니지만 for 문으로 노드의 개수를 파악) 값을 추가하는건 굉장히 빠르다
        // (인덱스를 처음부터 읽고 값을 추가하는게 아닌 각 노드의 참조 관계를 변경해준다)
        BatchProcessor list = new BatchProcessor(new MyLinkedList<Integer>());
        list.logic(50_000);
    }
}
