package advanced1.thread.cas.increment;

import java.util.ArrayList;
import java.util.List;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class IncrementThreadMain {

    public static final int THREAD_COUNT = 1000;

    public static void main(String[] args) throws InterruptedException {
        test(new BasicInteger());
        test(new VolatileInteger());
        test(new SyncInteger());
        test(new MyAtomicInteger());
    }

    private static void test(IncrementInteger icIncrementInteger) throws InterruptedException {

        // Runnable 생성
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                sleep(10);
                icIncrementInteger.increment();
            }
        };

        // thread 담을 list 선언
        List<Thread> threadList = new ArrayList<>();

        // thread 를 1000개 생성
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(runnable);
            threadList.add(thread);
            thread.start();
        }

        for (Thread thread : threadList) {
            // 1000개의 스레드가 작업 종료 될때까지 대기
            thread.join();
        }

        int result = icIncrementInteger.get();
        log(icIncrementInteger.getClass().getSimpleName() + " : " + result);
    }
}
