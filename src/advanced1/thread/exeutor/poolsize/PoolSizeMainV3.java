package advanced1.thread.exeutor.poolsize;

import advanced1.thread.exeutor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static advanced1.thread.exeutor.ExecutorUtils.printState;
import static advanced1.util.MyLogger.log;

public class PoolSizeMainV3 {
    public static void main(String[] args) {
        // 캐시 풀 전략 Executors.newCachedThreadPool()
        // 캐시 스레드 풀 전략은 매우 빠르고 유연하다
        // 기본 스레드가 없고 대기 큐에 작업이 쌓이지 않는다, 작업 요청이 오면 초과 스레드로 작업을 바로 처리
        // 초과 스레드 제한이 없기 때문에 CPU, 메모리가 허용하면 서버의 자원을 최대로 사용 할 수 있다
        // 초과 스레드는 60초간 생존하기 때문에 작업 수에 맞춰 적절한 수의 스레드가 재사용된다
        // 이런 특징 때문에 요청이 증가하면 스레드도 증가하고 요청이 줄어들면 스레드도 줄어든다
        ExecutorService es = Executors.newCachedThreadPool();

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
