package advanced1.thread.control.interrupt;

import static advanced1.util.MyLogger.log;

public class ThreadStopMainV4 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        log(4000);
        log("작업 중단 지시 thread.interrupt");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1 : " + thread.isInterrupted());

    }

    static class MyTask implements Runnable {
        @Override
        public void run(){

            // 인터럽트가 발생하면 인터럽트 상태를 true 로 변경 후
            // 현재 스레드의 인터럽트 상태를 false 로 변경한다
            while (!Thread.interrupted()){
                log("작업 중");
            }

            // 스레드가 자원을 처리중 예외를 만나게 되면 인터럽트 상태가 false(정상)으로 변경된다
            // 스레드의 인터럽트 상태를 정상으로 돌리지 않으면 이후에도 계속 인터럽트가 발생한다
            // 인터럽트의 목적을 달성하면 인터럽트 상태를 다시 정상으로 되돌려 두어야 한다
            log("work 스레드 인터럽트 상태2 : " + Thread.currentThread().
                    isInterrupted());
            log("자원 정리");
            log("자원 종료");
        }

        // volatile boolean runFlag = true;


    }
}
