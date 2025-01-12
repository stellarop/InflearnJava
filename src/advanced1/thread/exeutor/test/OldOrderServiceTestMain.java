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
        OldOrderService inventoryResult
                = new OldOrderService("재고 업데이트", orderNo);
        OldOrderService shippingResult
                = new OldOrderService("배송 시스템 업데이트", orderNo);
        OldOrderService accountingResult
                = new OldOrderService("회계 시스템 업데이트", orderNo);

        // 스레드 인스턴스를 List 에 삽입한다
        List<OldOrderService> orderList
                = List.of(inventoryResult, shippingResult, accountingResult);
        // Future 객체 생성
        List<Future<Boolean>> futures = es.invokeAll(orderList);

        for (Future<Boolean> future : futures) {
            // 스레드 3개의 결과값을 모두 리턴
            boolean result = future.get();

            if(!result){
                log("일부 작업이 실패했습니다.");
                return;
            }
        }
        log("모든 주문 처리가 성공적으로 완료되었습니다.");

        // ExecutorService 종료
        es.shutdown();
    }
}
