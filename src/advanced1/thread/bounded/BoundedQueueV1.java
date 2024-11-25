package advanced1.thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static advanced1.util.MyLogger.log;

public class BoundedQueueV1 implements BoundedQueue{

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV1(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        if(queue.size() == max) {
            log("[put 실패] 큐가 가득 참 : " + data);
            return;
        }
        queue.offer(data);

    }

    @Override
    public synchronized String take() {
        // 큐의 값이 없으면 null 리턴
        if(queue.isEmpty()){
            return null;
        }

        return queue.poll();
    }

    @Override
    public String toString(){
        return queue.toString();
    }
}
