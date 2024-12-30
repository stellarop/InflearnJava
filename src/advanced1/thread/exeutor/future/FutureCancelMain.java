package advanced1.thread.exeutor.future;

import java.util.concurrent.*;

import static advanced1.util.MyLogger.log;

public class FutureCancelMain {

    // private static boolean flag = true;
    private static boolean flag = false;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // ExecutorService 에 스레드 작업 공간 1 생성
        ExecutorService es = Executors.newFixedThreadPool(1);
        // ExecutorService.submit() 메서드에 Callable 삽입 후 Future 객체 리턴
        Future<String> future = es.submit(new MyTask());

        // 일정 시간 후 취소 시도
        Thread.sleep(3000);
        log("future.cancel(" + flag + ")");
        // future.cancel() true (Future 객체에 리턴 전에 취소 작업 실행)
        // true = 작업을 취소하고 그 다음 작업을 하지 않는다.
        // false = 작업을 취소하고 그 다음 작업을 계속 진행한다
        boolean cancelResult = future.cancel(flag);
        log("cancel(" + flag + ") cancelResult : " + cancelResult);

        // 결과 확인
        try{
            // future.cancel() 메서드 실행 시 future 에서 값을 꺼내는게 불가능
            log("future result : " + future.get());
        }catch (CancellationException e) {
            log("future 는 이미 취소 되었습니다.");
        }catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    static class MyTask implements Callable<String> {

        @Override
        public String call(){
            try {
                for (int i = 0; i < 10; i++) {
                    log("로그 출력 중 " + i);
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                log("인터럽트 발생");
                return "Interrupted";
            }

            return "Completed";
        }
    }
}
