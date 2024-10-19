package advanced1.thread.start.test;

import static advanced1.util.MyLogger.log;

public class StartTestMain3 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new PrintWork("A", 1000));
        Thread thread2 = new Thread(new PrintWork("B", 500));
        thread1.start();
        thread2.start();

    }
    static class PrintWork implements Runnable{

        private String content;
        private int sleepMs;

        public PrintWork(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {

            while (true){
                try {
                    Thread.sleep(sleepMs);
                    log(content);
                }catch (Exception e){
                    System.out.println("error : " + e.getMessage());
                }


            }
        }
    }
}
