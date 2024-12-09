package advanced1.thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static advanced1.util.MyLogger.log;

public class BoundedQueueV6_2 implements BoundedQueue{

    private BlockingQueue<String> queue;

    public BoundedQueueV6_2(int max) {
        // BlockingQueue 의 크기
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {
        // offer() 는 성공하면 true 실패 시 false 반환한다
        boolean result = queue.offer(data);
        log("저장 시도 결과 : " + result);
    }

    @Override
    public String take() {
        // poll() 은 버퍼에 값이 없으면 즉시 null 을 반환한다
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
