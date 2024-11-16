package advanced1.thread.sync;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class BankAccountV1 implements BankAccount{

    private int balance;

    public BankAccountV1(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        // 현재 실행중인 클래스 명 호출
        log("거래 시작 : " + getClass().getSimpleName());
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
        log("거래 종료");
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
