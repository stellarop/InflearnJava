package advanced1.thread.exeutor.future;

import advanced1.thread.exeutor.CallableTask;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static advanced1.util.MyLogger.log;

public class InvokeAllMain  {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 스레드 작업 공간 10개 생성
        ExecutorService es = Executors.newFixedThreadPool(10);

        // 작업 스레드 3개 생성 1초, 2초, 3초
        CallableTask task1 = new CallableTask("task1", 1000);
        CallableTask task2 = new CallableTask("task2", 2000);
        CallableTask task3 = new CallableTask("task3", 3000);

        // Callable 작업 스레드 인스턴스 List 에 삽입
        List<CallableTask> tasks = List.of(task1,task2,task3);

        // 스레드 3개의 작업을 한꺼번에 리턴한다 (tasks 에 있는 작업이 모두 끝나야 리턴)
        List<Future<Integer>> futures =  es.invokeAll(tasks);

        // 반복하면서 futures 에 리턴된 스레드의 결과값을 하나씩 출력한다
        for (Future<Integer> future : futures) {
            Integer value = future.get();
            log("value : " + value);
        }

        //
        es.shutdown();
    }
}
