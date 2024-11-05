package advanced1.thread.control.interrupt;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class ThreadStopMainV2 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(1000);
        log("작업 중단 지시 thread.interrupt");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1 : " + thread.isInterrupted());

    }

    static class MyTask implements Runnable {
        @Override
        public void run(){
            try {
                while (true){
                    log("작업 중");
                    // 스레드에 예외가 발생하면 catch 로 이동
                    // 인터럽트 시 sleep 상태 스레드가 바로 예외로 넘어간다
                    // 예외로 넘어간 후 스레드 인터럽트가 풀리게 된다
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                log("work 스레드 인터럽트 상태2 : " + Thread.currentThread().
                        isInterrupted());
                log("interrupt message : " + e.getMessage());
                log("state : " + Thread.currentThread().getState());
            }

            log("자원 정리");
            log("자원 종료");
        }
    }
}
