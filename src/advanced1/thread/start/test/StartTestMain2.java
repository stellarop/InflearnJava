package advanced1.thread.start.test;

import static advanced1.util.MyLogger.log;

public class StartTestMain2 {
    public static void main(String[] args) {

        Thread thread = new Thread(new CountRunnable(), "counter");
        thread.start();

    }

    static class CountRunnable implements Runnable{

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
