package advanced1.thread.exeutor.future;

import java.util.concurrent.*;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class FutureExceptionMain {
    public static void main(String[] args) {
         ExecutorService es = Executors.newFixedThreadPool(1);
        log("작업 전달");
        Future<Integer> future = es.submit(new ExCallable());
        sleep(1000);

        try {
            // future.get()은 작업의 결과값을 받을 수도 있고 예외를 받을 수도 있다
            Integer result = future.get();
            log("result : " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            log("e : " + e);
            // ExecutionException 발생한 원인 파악 가능 (원본 예외)
            Throwable cause = e.getCause();
            log("cause : " + cause);
        }

        es.shutdown();

    }

    static class ExCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            log("Callable 실행, 예외 발생");
            throw new IllegalStateException("ex!");
        }
    }
}
