package advanced1.thread.exeutor.future;

import advanced1.thread.exeutor.ExecutorUtils;

import java.util.Random;
import java.util.concurrent.*;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class CallableMainV1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // maxThread 1, coreSize 1
        ExecutorService es = Executors.newFixedThreadPool(1);
        // ExecutorService 가 제공하는 submit() 을 통해 callable 작업을 전달 할 수 있다.
        // 이때 new MyCallable() 인스턴스를 블로킹 큐에 전달 되어 스레드 풀의 스레드 중 하나가 이 작업을 실행한다.
        // 이때 리턴값은 바로 받는게 아니라 Future 인터페이스로 받을 수 있다.
        Future<Integer> future = es.submit(new MyCallable());
        Integer value = future.get();

        log("value : " + value);
        es.shutdown();
    }

    static class MyCallable implements Callable<Integer> {
        // Callable 인터페이스 안 call() 는 Runnable run() 과 달리 리턴 타입을 가진다
        @Override
        public Integer call() {
            log("Callable 시작");
            sleep(2000);
            int value = new Random().nextInt(10);
            log("create value : " + value);
            log("Callable 완료");
            return value;
        }
    }
}
