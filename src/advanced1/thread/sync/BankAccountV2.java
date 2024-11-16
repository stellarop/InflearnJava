package advanced1.thread.sync;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class BankAccountV2 implements BankAccount{

    private int balance;

    public BankAccountV2(int balance) {
        this.balance = balance;
    }

    @Override
    // 임계 영역 (synchronized)
    // 하나의 스레드가 작업을 완료해야 다른 스레드가 접근 할 수 있어서 동시성 문제를 해결 가능
    // 하지만 성능이 굉장히 나빠지는 단점도 존재한다 이럴땐 메서드가 아닌 임계 영역에만 동시성을 해결할 수 있도록 한다
    public synchronized boolean withdraw(int amount) {
        // 현재 실행중인 클래스 명 호출
        log("거래 시작 : " + getClass().getSimpleName());

        // 임계 영역 시작
        log("[검증 시작] 출금액 : " + amount + ", 잔액 : " + balance);
        // 잔고가 출금액보다 적으면
        if(amount > balance){
            log("[검증 실패] 출금액 : " + amount + ", 잔액 : " + balance);
            return false;
        }
        // 잔고가 출금액보다 많으면 진행
        log("[검증 완료] 출금액 : " + amount + ", 잔액 : " + balance);
        sleep(1000);

        balance = balance - amount;

        log("[출금 완료] 출금액 : " + amount + ", 잔액 : " + balance);
        // 임계 영역 끝
        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
