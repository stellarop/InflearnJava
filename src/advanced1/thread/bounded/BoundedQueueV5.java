package advanced1.thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static advanced1.util.MyLogger.log;

public class BoundedQueueV5 implements BoundedQueue{

    // 락 제어를 위한 ReentrantLock 구현체 생성 (공통)
    private final Lock lock = new ReentrantLock();
    // 락의 대기장소

    // 생산자 스레드 대기 장소
    private final Condition producerCond = lock.newCondition();
    // 소비자 스레드 대기 장소
    private final Condition consumerCond = lock.newCondition();

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV5(int max) {
        this.max = max;
    }

    @Override
    public void put(String data) {
        // 락을 호출했을때 락이 없으면 대기
        lock.lock();
        try{
            while(queue.size() == max) {
                log("[put] 큐가 가득 참 생산자 대기: " + data);
                try {
                    // 큐가 가득 차면 생산자 스레드 대기 상태 돌입
                    producerCond.await();
                    log("[put] 생산자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.offer(data);
            log("[put] 생산자 데이터 저장, consumerCond.signal() 호출");
            // 락을 반납하고 소비자 스레드를 깨워준다
            consumerCond.signal();
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
                   // 큐에 값이 없으면 소비자 스레드 대기 상태 돌입
                   consumerCond.await();
                   log("[take] 소비자 깨어남");
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
           String data = queue.poll();
           log("[take] 소비자 데이터 획득, producerCond.signal() 호출");
            producerCond.signal();
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
