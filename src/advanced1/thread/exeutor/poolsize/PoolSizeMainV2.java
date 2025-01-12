package advanced1.thread.exeutor.poolsize;

import advanced1.thread.exeutor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static advanced1.thread.exeutor.ExecutorUtils.printState;
import static advanced1.util.MyLogger.log;

public class PoolSizeMainV2 {
    public static void main(String[] args) {
        // 고정 풀 전략 Executors.newFixedThreadPool()
        // 스레드 수가 고정되어 있기 때문에 CPU, 메모리 리소스가 어느정도 예측 가능한 안정된 방식
        // 큐 사이즈도 제한이 없어서 작업을 많이 담아두고 처리해도 문제가 없음

        // 스레드를 2개씩 처리 (요청은 무제한)
        ExecutorService es = Executors.newFixedThreadPool(2);

        log("pool 생성");
        printState(es);

        for (int i = 1; i <= 6 ; i++) {
            String taskNm = "task" + i;
            es.execute(new RunnableTask(taskNm));
            printState(es, taskNm);
        }
        es.shutdown();
        log("== shutdown ==");
    }
}
