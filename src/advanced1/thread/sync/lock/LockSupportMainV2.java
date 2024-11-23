package advanced1.thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class LockSupportMainV2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParkTest(), "Thread-1");
        thread1.start();

        sleep(100);
        log("Thread-1 state : " + thread1.getState());

    }

    static class ParkTest implements Runnable {
        @Override
        public void run(){
            log("park 시작");
            // 대기 상태에 돌입 후 2초뒤 깨어난다
            // synchronized 의 경우 BLOCKED 상태가 되어 중간에 인터럽트가 안되고 무한대기지만
            // parkNanos() 를 사용하면 특정 시간 까지만 대기할 수 있다, 인터럽트로 중간에 스레드를 깨울수도 있다
            LockSupport.parkNanos(2000_000000);
            log("park 종료 : " + Thread.currentThread().getState());
            log("인터럽트 상태 : " + Thread.currentThread().isInterrupted());
        }
    }
}
