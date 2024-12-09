package advanced1.thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static advanced1.util.MyLogger.log;

public class BoundedQueueV4 implements BoundedQueue{

    // 락 제어를 위한 ReentrantLock 구현체 생성
    private final Lock lock = new ReentrantLock();
    // 락의 대기장소
    private final Condition condition = lock.newCondition();

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV4(int max) {
        this.max = max;
    }

    @Override
    public void put(String data) {
        // put 메서드 들어온 스레드 락 획득
        lock.lock();
        try{
            while(queue.size() == max) {
                log("[put] 큐가 가득 참 생산자 대기: " + data);
                try {
                    condition.await();
                    log("[put] 생산자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.offer(data);
            log("[put] 생산자 데이터 저장, notify() 호출");
            // 락을 반납하고 스레드가 락의 대기장소에 보관된다
            condition.signal();
        }finally {
            // 락을 풀어준다
            lock.unlock();
        }


    }

    @Override
    public String take() {
        lock.lock();
        try {
           while (queue.isEmpty()){
               log("[take] 큐에 데이터가 없음 소비자 대기");
               try {
                   condition.await();
                   log("[take] 소비자 깨어남");
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
           String data = queue.poll();
           log("[take] 소비자 데이터 획득, notify() 호출");
           condition.signal();
           return data;
       }finally {
           lock.unlock();
       }
    }

    @Override
    public String toString(){
        return queue.toString();
    }
}
