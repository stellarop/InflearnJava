package advanced1.thread.exeutor.future;

import java.util.Random;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable task = new MyRunnable();

        Thread thread1 = new Thread(task, "t-1");
        thread1.start();
        thread1.join();
        int value = task.value;

        System.out.println("value : " + value);
    }

    static class MyRunnable implements Runnable{

        int value;

        @Override
        public void run() {
            log("Runnable 시작");
            sleep(2000);
            value = new Random().nextInt(10);
            log("create value : " + value);
            log("Runnable 완료");
        }
    }
}
