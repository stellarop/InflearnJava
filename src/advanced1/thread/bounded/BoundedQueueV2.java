package advanced1.thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class BoundedQueueV2 implements BoundedQueue{

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV2(int max) {
        this.max = max;
    }

    // 생산자 스레드가 락을 가지고 무한대기
    // 대기 중에 다른 스레드에게 락을 넘겨서 무한 대기 상태를 풀어야함
    @Override
    public synchronized void put(String data) {
        while(queue.size() == max) {
            log("[put] 큐가 가득 참 생산자 대기: " + data);
            sleep(1000);
        }
        queue.offer(data);

    }

    @Override
    public synchronized String take() {
        while (queue.isEmpty()){
            log("[take] 큐에 데이터가 없음 소비자 대기");
            sleep(1000);
        }

        return queue.poll();
    }

    @Override
    public String toString(){
        return queue.toString();
    }
}
