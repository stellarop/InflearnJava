package Intermediate2.collection.deque;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);

        // 조회
        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("poll : " + queue.poll());
        System.out.println("poll : " + queue.poll());
        System.out.println("poll : " + queue.poll());

        System.out.println(queue);


    }
}
