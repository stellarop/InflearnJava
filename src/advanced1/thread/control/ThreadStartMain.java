package advanced1.thread.control;

import static advanced1.util.MyLogger.log;

public class ThreadStartMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myThread");
        // 시작 전 상태 NEW
        log("myThread.state1 : " + thread.getState());
        log("myThread.start()");
        thread.start();
        // sleep 을 하면 체크 예외가 터진다. 이 예외는 무조건 잡거나 던져야 한다
        Thread.sleep(1000);
        // 자고 있는 스레드(myThread)는 다른 스레드(main)로 찍어야 상태값이 나온다.
        // 자고 있는 스레드를 깨우는 인터럽트도 존재한다
        // 대기 상태 TIMED_WAITING
        log("myThread.state3 : " + thread.getState());
        Thread.sleep(4000);
        // 스레드가 실행을 마친 상태 TERMINATED
        log("myThread.state5 : " + thread.getState());


    }

    static class MyRunnable implements Runnable{

        @Override
        public void run() {

            try {
                log("start");
                // 실행 중인 상태 RUNNABLE
                log("myThread.state2 : " + Thread.currentThread().getState());
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                // 깨어나면 RUNNABLE 상태로 진입
                log("myThread.state4 : " + Thread.currentThread().getState());
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
