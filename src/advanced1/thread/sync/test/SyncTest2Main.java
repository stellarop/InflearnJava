package advanced1.thread.sync.test;

import static advanced1.util.MyLogger.log;

public class SyncTest2Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                myCounter.count();
            }
        };
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        thread1.start();
        thread2.start();
    }

    static class MyCounter {
        public void count() {
            // localValue 지역 변수는 스택 영역에 생성된다
            // 스택 영역은 각각의 스레드가 가지는 별도의 메모리 공간이다 이 공간은 다른 스레드와 공유하지 않는다
            // 지역 변수는 스레드의 개별 저장 공간인 스택 영역에 생성된다
            // 하나의 스레드가 하나의 지역 변수에 접근 하기 때문에 동시성 문제가 생기지 않는다
            int localValue = 0;
            for (int i = 0; i < 1000; i++) {
                localValue = localValue + 1;
            }
            log("결과: " + localValue);
        }

    }
}
