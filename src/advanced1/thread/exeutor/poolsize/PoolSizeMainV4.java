package advanced1.thread.exeutor.poolsize;

import advanced1.thread.exeutor.ExecutorUtils;
import advanced1.thread.exeutor.RunnableTask;

import java.util.concurrent.*;

import static advanced1.util.MyLogger.log;

public class PoolSizeMainV4 {

    // 일반
    // static final int TASK_SIZE = 1100;
    // 긴급
    //static final int TASK_SIZE = 1200;
    // 거절
    static final int TASK_SIZE = 1201;

    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(100, 200,
                60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));

        ExecutorUtils.printState(es);

        long startMs = System.currentTimeMillis();

        for (int i = 1; i <= TASK_SIZE; i++) {
            String taskNm = "task" + i;

            try {
                es.execute(new RunnableTask(taskNm));
                ExecutorUtils.printState(es, taskNm);
            } catch (RejectedExecutionException e){
                log(taskNm + " -> " + e);
            }
        }

        es.shutdown();
        long endMs = System.currentTimeMillis();
        log("time : " + (endMs - startMs));

    }
}
