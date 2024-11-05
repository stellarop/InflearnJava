package advanced1.thread.control.yield;

import advanced1.thread.start.HelloRunnable;

import static advanced1.util.ThreadUtils.sleep;

public class YieldMain {

    static final int THREAD_COUNT = 1000;
    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run(){
            // 1. empty
            // 2. sleep
            // 3. yield
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-" + i);
                // sleep(1);
                Thread.yield();
            }

        }
    }
}
