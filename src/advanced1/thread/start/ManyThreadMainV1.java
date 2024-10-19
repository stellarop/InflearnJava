package advanced1.thread.start;

import static advanced1.util.MyLogger.log;

public class ManyThreadMainV1 {
    public static void main(String[] args) {
        log("main() start");
        HelloRunnable runnable = new HelloRunnable();

        // 스레드 3개를 생성하는데 같은 runnable 인스턴스를 가진다.
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

        Thread thread3 = new Thread(runnable);
        thread3.start();

        log("main end");
    }
}
