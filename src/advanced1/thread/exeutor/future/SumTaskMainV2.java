package advanced1.thread.exeutor.future;

import java.util.concurrent.*;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class SumTaskMainV2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 두 개의 Callable 인스턴스 생성
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);

        // ExecutorService 를 이용해서 2개의 스레드 작업공간을 생성
        ExecutorService es = Executors.newFixedThreadPool(2);

        // 결과를 Future 로 리턴
        Future<Integer> future1 = es.submit(task1);
        Future<Integer> future2 = es.submit(task2);

        // 스레드에서 리턴된 값을 Future 내부에서 꺼낸다(바로 꺼내거나, 결과값을 리턴 받을때까지 대기하고 꺼내거나)
        Integer sum1 = future1.get();
        Integer sum2 = future2.get();

        log("task1 : " + sum1);
        log("task2 : " + sum2);

        int sumAll = sum1 + sum2;
        log("sumAll : " + sumAll);
        log("end");

        // ExecutorService close
        es.shutdown();
    }

    static class SumTask implements Callable<Integer> {

        int startValue;
        int endValue;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() throws Exception {
            log("작업 시작");
            Thread.sleep(2000);

            int sum = 0;

            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }

            log("작업 완료 value : " + sum);
            return sum;
        }
    }
}
