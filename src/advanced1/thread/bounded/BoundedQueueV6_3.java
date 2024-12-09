package advanced1.thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static advanced1.util.MyLogger.log;

public class BoundedQueueV6_3 implements BoundedQueue{

    private BlockingQueue<String> queue;

    public BoundedQueueV6_3(int max) {
        // BlockingQueue 의 크기
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {
        // offer() 는 버퍼가 가득 찬 경우 1나노초 만큼 대기 후 false 를 반환한다
        // 인자로 대기 시간 설정 가능
        try {
            boolean result = queue.offer(data, 1, TimeUnit.NANOSECONDS);
            log("저장 시도 결과 : " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String take() {
        // poll() 은 1나노초 만큼 대기 후 버퍼에 값이 없으면 즉시 null 을 반환한다
        // 인자로 대기 시간 설정 가능
        try {
            return queue.poll(2, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
