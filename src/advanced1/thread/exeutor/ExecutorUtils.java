package advanced1.thread.exeutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static advanced1.util.MyLogger.log;

public abstract class ExecutorUtils {

    public static void printState(ExecutorService executorService){
        // executorService 구현체가 ThreadPoolExecutor 일때 실행
        if (executorService instanceof ThreadPoolExecutor poolExecutor){
            // 현재 생성된 스레드 개수
            int pool = poolExecutor.getPoolSize();
            // 실제 작업중인 스레드 개수
            int active = poolExecutor.getActiveCount();
            // 큐에 작업이 몇개 들어가 있는지
            int queued = poolExecutor.getQueue().size();
            // 작업을 완료한 스레드가 몇개인지
            long completedTask = poolExecutor.getCompletedTaskCount();

            log("[pool : " + pool + ", active : " + active + ", queued : "
                    + queued + ", completedTask : " + completedTask);
        }else{
            log(executorService);
        }
    }

    public static void printState(ExecutorService executorService, String taskName){
        // executorService 구현체가 ThreadPoolExecutor 일때 실행
        if (executorService instanceof ThreadPoolExecutor poolExecutor){
            // 현재 생성된 스레드 개수
            int pool = poolExecutor.getPoolSize();
            // 실제 작업중인 스레드 개수
            int active = poolExecutor.getActiveCount();
            // 큐에 작업이 몇개 들어가 있는지
            int queued = poolExecutor.getQueue().size();
            // 작업을 완료한 스레드가 몇개인지
            long completedTask = poolExecutor.getCompletedTaskCount();

            log(taskName + " -> "  + "[pool : " + pool + ", active : " + active + ", queued : "
                    + queued + ", completedTask : " + completedTask);
        }else{
            log(executorService);
        }
    }
}
