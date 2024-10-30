package advanced1.thread.control.join;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class JoinMainV0 {
    public static void main(String[] args) {
        log("start");
        Thread thread1 = new Thread(new Job(), "thread-1");
        Thread thread2 = new Thread(new Job(), "thread-2");

        // main 스레드는 thread1, thread2 를 실행하고 다음 코드를 실행한다.
        // thread1, thread2가 끝날때까지 기다리지 않고 바로 end 를 찍는다
        thread1.start();
        thread2.start();

        log("end");
    }

    static class Job implements Runnable {
        @Override
        public void run(){
            log("작업 시작");
            sleep(2000);
            log("작업 완료");
        }
    }
}
