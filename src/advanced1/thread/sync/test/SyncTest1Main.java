package advanced1.thread.sync.test;

public class SyncTest1Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("결과: " + counter.getCount());
    }
    static class Counter {
        private int count = 0;

        // 스레드가 동시에 increment 메서드에 접근을 하면서 공유 자원에 두 개의 스레드가
        // 접근하면서 공유 자원의 값이 꼬이는 문제가 발생
        // synchronized 붙혀주면서 하나의 스레드만 접근하도록 수정
        public synchronized void increment() {
            count = count + 1;
        }

        public int getCount() {
            return count;
        }
    }
}
