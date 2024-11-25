package advanced1.thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class BoundedQueueV3 implements BoundedQueue{

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV3(int max) {
        this.max = max;
    }

    // 생산자 스레드가 락을 가지고 무한대기
    // 대기 중에 다른 스레드에게 락을 넘겨서 무한 대기 상태를 풀어야함
    @Override
    public synchronized void put(String data) {
        while(queue.size() == max) {
            // 큐 가득참
            log("[put] 큐가 가득 참 생산자 대기: " + data);
            try {
                // RUNNABLE -> WAITING 락 반납
                // 큐가 가득차서 값을 넣을수가 없으므로 대기중인 임의에 스레드에게 락을 넘기고 대기 상태에 빠진다.
                // 이때 대기중인 스레드는 임의에 스레드에게 넘겨진다
                wait();
                log("[put] 생산자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(data);
        log("[put] 생산자 데이터 저장, notify() 호출");
        // 대기 스레드, WAIT -> BLOCKED
        // notify() 메서드는 대기하고 있는 스레드를 깨운다(생산자 스레드, 소비자 스레드
        // 를 지정하는게 아닌 대기중인 임의에 스레드를 깨워서 락을 넘겨준다)
        // 이때 대기중인 스레드(생산자, 소비자) 중 선택을 해서 락을 넘겨주면 더 효율적이지 않을까
        notify();

    }

    @Override
    public synchronized String take() {
        while (queue.isEmpty()){
            log("[take] 큐에 데이터가 없음 소비자 대기");
            try {
                // 생산자가 값을 넣기위해 락을 넘기고 대기한다
                wait();
                log("[take] 소비자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String data = queue.poll();
        log("[take] 소비자 데이터 획득, notify() 호출");
        // 대기 스레드 WAIT -> BLOCKED
        // 대기하고 있는 스레드를 깨운다(생산자 스레드, 소비자 스레드 지정하는게 아닌
        // 대기중인 임의에 스레드를 깨워서 락을 넘겨준다)
        notify();
        return data;
    }

    @Override
    public String toString(){
        return queue.toString();
    }
}
