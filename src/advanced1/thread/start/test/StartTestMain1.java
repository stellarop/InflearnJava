package advanced1.thread.start.test;

import static advanced1.util.MyLogger.log;

public class StartTestMain1 {
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();

    }
    static class CounterThread extends Thread {

        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                try {
                    Thread.sleep(1000);
                    log("value : " + i);
                } catch (Exception e) {
                    System.out.println("error : " + e.getMessage());
                }

            }
        }
    }
}

