package advanced1.thread.sync.test;

import advanced1.thread.sync.BankAccount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class BankAccountV4 implements BankAccount {

    private int balance;
    private final Lock lock = new ReentrantLock();

    public BankAccountV4(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        // 현재 실행중인 클래스 명 호출
        log("거래 시작 : " + getClass().getSimpleName());

        // 임계 영역 시작
        // ReentrantLock 을 이용하여 lock 걸기
        // lock() -> unlock() 까지는 안전한 임계영역이 된다
        // 임계 영역이 끝나면 반드시 락을 반납해야한다 반납하지 않으면 대기하는 스레드가 락을 획득 못하여 무한대기
        // unlock()은 finally 블럭에 무조건 작성해야한다
        // 검증에 실패하거나 return 을 호출해도 unlock() 은 반드시 호출
        lock.lock();

        try{
            log("[검증 시작] 출금액 : " + amount + ", 잔액 : " + balance);
            // 잔고가 출금액보다 적으면
            if (amount > balance) {
                log("[검증 실패] 출금액 : " + amount + ", 잔액 : " + balance);
                return false;
            }
            // 잔고가 출금액보다 많으면 진행
            log("[검증 완료] 출금액 : " + amount + ", 잔액 : " + balance);
            sleep(1000);

            balance = balance - amount;

            log("[출금 완료] 출금액 : " + amount + ", 잔액 : " + balance);
        }finally {
            // unlock 실행 시 대기중인 스레드가 락을 획득
            lock.unlock();
        }
        log("거래 종료");
        return true;


    }

    @Override
    public int getBalance() {
        lock.lock();
        try {
            return balance;
        }finally {
            lock.unlock();
        }


    }
}
