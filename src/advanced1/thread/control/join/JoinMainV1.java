package advanced1.thread.control.join;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class JoinMainV1 {
    public static void main(String[] args) {
        log("start");

        // 스레드로 만들 인스턴스 객체 생성
        SumTask sumTask1 = new SumTask(1, 50);
        SumTask sumTask2 = new SumTask(51, 100);

        // 스레드 2개 생성
        Thread thread1 = new Thread(sumTask1, "thread-1");
        Thread thread2 = new Thread(sumTask2, "thread-2");

        // 스레드 2개 시작
        thread1.start();
        thread2.start();

        // 스레드에서 계산된 값 출력
        // 당연한 이야기지만 0이 나온다 sleep 으로 대기하는 시간동안 값이 출력되기 때문
        log("thread1.result : " + sumTask1.result);
        log("thread2.result : " + sumTask2.result);

        // 두 스레드의 결과값
        int sum = sumTask1.result + sumTask2.result;
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
