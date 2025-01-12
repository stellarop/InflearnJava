package advanced1.thread.exeutor.poolsize;

import advanced1.thread.exeutor.ExecutorUtils;
import advanced1.thread.exeutor.RunnableTask;

import java.util.concurrent.*;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class PoolSizeMainV1 {
    public static void main(String[] args) {


        BlockingQueue<Runnable> workQueue =  new ArrayBlockingQueue<>(2);

        // 작업을 보관할 블로킹 큐의 구현체로 ArrayBlockingQueue 사용 사이즈를 2로 설정했으므로 최대 작업은 2개
        // corePoolSize = 2, maximumPoolSize = 4, 를 사용해서 기본 스레드 2개, 최대 스레드는 4개로 지정
        // 스레드 풀에 기본 2개의 스레드를 운영한다 요청이 많아질경우 최대 4개까지 스레드를 증가시켜서 사용한다
        // 3000, TimeUnit.MILLISECONDS, 초과 스레드가 생존할 수 있는 시간 이 시간동안 스레드가 처리할
        // 작업이 없다면 초과 스레드는 제거된다
        ExecutorService es = new ThreadPoolExecutor(2,
                4, 3000, TimeUnit.MILLISECONDS, workQueue);
        ExecutorUtils.printState(es);

        es.execute(new RunnableTask("task1"));
        ExecutorUtils.printState(es, "task1");

        es.execute(new RunnableTask("task2"));
        ExecutorUtils.printState(es, "task2");

        es.execute(new RunnableTask("task3"));
        ExecutorUtils.printState(es, "task3");

        es.execute(new RunnableTask("task4"));
        ExecutorUtils.printState(es, "task4");

        es.execute(new RunnableTask("task5"));
        ExecutorUtils.printState(es, "task5");

        es.execute(new RunnableTask("task6"));
        ExecutorUtils.printState(es, "task6");

        try {
            es.execute(new RunnableTask("task7"));
            ExecutorUtils.printState(es, "task7");
        }catch (RejectedExecutionException e) {
            log("task7 실행 거절 예외 발생 : " + e);
        }

        sleep(3000);
        log("== 작업 수행 완료 ==");
        ExecutorUtils.printState(es);

        sleep(3000);
        log("== maxPoolSize 대기 시간 초과 ==");
        ExecutorUtils.printState(es);

        es.shutdown();
        log("== shutdown ==");
        ExecutorUtils.printState(es);
    }
}
