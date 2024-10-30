package advanced1.thread.control.join;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class JoinMainV4 {
    public static void main(String[] args) throws InterruptedException {
        log("start");

        // 스레드로 만들 인스턴스 객체 생성
        SumTask sumTask1 = new SumTask(1, 50);

        Thread thread1 = new Thread(sumTask1, "thread-1");

        // 스레드 2개 시작
        thread1.start();

        // join 을 사용하여 스레드가 종료될 때 까지 대기
        log("join() : main 스레드가 thread1이 종료될 때 까지 대기");

        // join()은 두 가지가 있다
        // 하나는 스레드가 끝날때까지 무기한 대기, 시간을 정한 대기
        thread1.join(1000);
        log("main 스레드 대기 완료");

        log("thread1.result : " + sumTask1.result);

        int sum = sumTask1.result;
        log("sum : " + sum);
        log("end");
    }

    static class SumTask implements Runnable {

        int startValue;
        int endValue;
        int result;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum = 0;
            for(int i = startValue; i <= endValue; i++){
                sum += i;
            }
            result = sum;
            log("작업 완료 sum : " + result);
        }
    }
}
