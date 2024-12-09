package advanced1.thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static advanced1.util.MyLogger.log;

public class BoundedQueueV6_4 implements BoundedQueue{

    private BlockingQueue<String> queue;

    public BoundedQueueV6_4(int max) {
        // BlockingQueue 의 크기
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {
        // add() 메서드는 버퍼에 값이 가득 차면 예외를 터트린다
        queue.add(data);
    }

    @Override
    public String take() {
        // remove() 메서드는 버퍼에 값이 없으면 예외를 터트린다
        return queue.remove();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
