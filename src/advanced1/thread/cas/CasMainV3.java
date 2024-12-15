package advanced1.thread.cas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static advanced1.util.MyLogger.log;

public class CasMainV3 {

    private static final int THREAD_COUNT = 2;

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println("start value : " + atomicInteger.get());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                incrementAndGet(atomicInteger);
            }
        };

        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(runnable);
            threadList.add(thread);
            thread.start();
        }

        for (Thread thread : threadList) {
            thread.join();
        }

        int result = atomicInteger.get();

        System.out.println(atomicInteger.getClass().getSimpleName() + " resultValue : " + result);
        System.out.println("end value : " + atomicInteger.get());
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {

        int getValue;
        boolean result;

        do{
            // atomicInteger 에서 값을 가져온다
            getValue = atomicInteger.get();
            log("getValue : " + getValue);

            // atomicInteger 값과 입력한 값이 일치하면 + 1
            // 기존 값이 계속 유지가 되면 값을 변경, 중간에 값이 바뀌면 반복
            result = atomicInteger.compareAndSet(getValue, getValue + 1);
            log("result : " + result);
        }while (!result);

        return getValue + 1;
    }
}
