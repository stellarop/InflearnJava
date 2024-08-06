package Intermediate2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 앞에 추가
        deque.offerFirst(1);
        deque.offerFirst(2);
        System.out.println(deque);

        // 뒤에 추가
        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println(deque);

        // 다음 값 확인
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 값 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());
    }
}
