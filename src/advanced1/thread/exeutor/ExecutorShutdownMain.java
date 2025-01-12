package advanced1.thread.exeutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static advanced1.util.MyLogger.log;

public class ExecutorShutdownMain {
    public static void main(String[] args) {
        // 스레드 풀 공간 2개 생성
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new RunnableTask("task-1"));
        es.execute(new RunnableTask("task-2"));
        es.execute(new RunnableTask("task-3"));
        es.execute(new RunnableTask("longTask", 100_000));

        log("shutdown 시작");
        shutdownAndAwaitTermination(es);
        log("shutdown 완료");

    }

    private static void shutdownAndAwaitTermination(ExecutorService es) {
        // non-blocking
        // 더 이상 새로운 작업을 받지 않는다
        // 처리 중이거나, 큐에 이미 대기중인 작업은 처리한다 이후에 풀의 스레드를 종료한다
        es.shutdown();

        try {
            // 이미 대기중인 작업들을 모두 완료할 때 까지 10초 대기
            if(!es.awaitTermination(10, TimeUnit.SECONDS)){
                log("서비스 정상 종료 실패 -> 강제 종료 시도");
                // 작업 취소
                es.shutdownNow();
                // 작업이 취소될 때 까지 대기
                if(!es.awaitTermination(10, TimeUnit.SECONDS)) {
                    log("서비스가 종료되지 않았습니다.");
                }


            }
        } catch (InterruptedException e) {
            // awaitTermination() 으로 대기중인 현재 스레드가 인터럽트 될 수 있다
            es.shutdownNow();
        }
    }
}
