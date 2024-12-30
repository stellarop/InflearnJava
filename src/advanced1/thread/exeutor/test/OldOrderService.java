package advanced1.thread.exeutor.test;

import java.util.concurrent.Callable;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

// Callable 상속 제네릭 타입은 String
public class OldOrderService implements Callable<String> {

    // 시스템 이름
    private String system;
    // 주문 번호
    private String orderNo;


    // 생성자로 필드 인자를 받아준다
    public OldOrderService(String system, String orderNo){
        this.system = system;
        this.orderNo = orderNo;
    }

    // Callable 상속 후 call() 메서드 재정의 (스레드의 리턴 값!)
    @Override
    public String call(){
        return system + " : " + orderNo;
    }

    // 기존 소스
    /*
    public void order(String orderNo) {
        InventoryWork inventoryWork = new InventoryWork(orderNo);
        ShippingWork shippingWork = new ShippingWork(orderNo);
        AccountingWork accountingWork = new AccountingWork(orderNo);
        // 작업 요청
        Boolean inventoryResult = inventoryWork.call();
        Boolean shippingResult = shippingWork.call();
        Boolean accountingResult = accountingWork.call();
        // 결과 확인
        if (inventoryResult && shippingResult && accountingResult) {
            log("모든 주문 처리가 성공적으로 완료되었습니다.");
        }
        else {
            log("일부 작업이 실패했습니다.");
        }
    }
    static class InventoryWork {
        private final String orderNo;
        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }
        public Boolean call() {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }
    static class ShippingWork {
        private final String orderNo;
        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }
        public Boolean call() {
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }
    static class AccountingWork {
        private final String orderNo;
        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }
        public Boolean call() {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }
    */
}
