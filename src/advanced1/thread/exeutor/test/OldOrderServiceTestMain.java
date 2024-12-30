package advanced1.thread.exeutor.test;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static advanced1.util.MyLogger.log;

public class OldOrderServiceTestMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String orderNo = "Order#1234";  // 예시 주문 번호
        // ExecutorService 작업 공간 3개 생성
        ExecutorService es = Executors.newFixedThreadPool(3);

        // 스레드 생성
        OldOrderService oldOrderService1
                = new OldOrderService("재고 업데이트", orderNo);
        OldOrderService oldOrderService2
                = new OldOrderService("배송 시스템 업데이트", orderNo);
        OldOrderService oldOrderService3
                = new OldOrderService("회계 시스템 업데이트", orderNo);

        // 스레드 인스턴스를 List 에 삽입한다
        List<OldOrderService> orderList
                = List.of(oldOrderService1, oldOrderService2, oldOrderService3);
        // Future 객체 생성
        List<Future<String>> futures = es.invokeAll(orderList);

        for (Future<String> future : futures) {
            // 스레드 3개의 결과값을 모두 리턴
            String value = future.get();
            log(value);
        }

        // ExecutorService 종료
        es.shutdown();
    }
}
