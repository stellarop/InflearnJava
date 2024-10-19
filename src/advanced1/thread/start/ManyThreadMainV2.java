package advanced1.thread.start;

import static advanced1.util.MyLogger.log;

public class ManyThreadMainV2 {
    public static void main(String[] args) {
        log("main() start");
        HelloRunnable runnable = new HelloRunnable();

        // 스레드 3개를 생성하는데 같은 runnable 인스턴스를 가진다.
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        log("main end");
    }
}
