 package advanced1.thread.start;

import static advanced1.util.MyLogger.log;

public class InnerRunnableMainV2 {
    public static void main(String[] args) {
        log("main() start");

        // 익명 클래스로 Runnable 구현
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                log(Thread.currentThread().getName() + " : run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();


        log("main() end");
    }


}
