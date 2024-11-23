package advanced1.thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class LockSupportMainV1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParkTest(), "Thread-1");
        thread1.start();

        // 잠시 대기하여 thread1dl park 상태에 빠질 시간을 준다
        sleep(100);
        log("Thread-1 state : " + thread1.getState());

        log("main -> unPark(Thread-1)");
        // unpark 사용
        // LockSupport.unpark(thread1);
        // interrupt 사용
        thread1.interrupt();

        // unpark, interrupt 둘 다 대기 상태(WAITING) -> 실행 상태(RUNNABLE)로 변경 가능
        // 차이가 있다면 인터럽트 상태 유무
    }

    static class ParkTest implements Runnable {
        @Override
        public void run(){
            log("park 시작");
            // LockSupport.park() 호출한 스레드는 실행 상태에서 대기 상태로 변경
            // 실행중인 스레드는 LockSupport.park() 를 호출해서 대기 상태로 변경이 되지만
            // 대기 상태에 빠진 스레드는 자신의 코드를 실행할 수 없다
            // 그래서 다른 스레드의 도움을 받아야 상태 변경이 가능하다
            LockSupport.park();
            log("park 종료 : " + Thread.currentThread().getState());
            log("인터럽트 상태 : " + Thread.currentThread().isInterrupted());
        }
    }
}
