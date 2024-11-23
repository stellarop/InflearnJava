package advanced1.thread.sync.test;

import advanced1.thread.sync.BankAccount;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class BankAccountV6 implements BankAccount {

    private int balance;
    // 비공정 모드 락
    // 대기중인 스레드 아무나 락을 획득한다
    // private final Lock lock = new ReentrantLock();

    // 공정모드 락
    // 오래 기다린 스레드가 먼저 실행된다
    private final Lock lock = new ReentrantLock(true);

    public BankAccountV6(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        // 현재 실행중인 클래스 명 호출
        log("거래 시작 : " + getClass().getSimpleName());

        // lock 획득 ture, 획득x false

        try {
            // 0.5 초간 대기 후 시간 내에 락을 획득하면 작업을 수행한다
            if(!lock.tryLock(500,  TimeUnit.MICROSECONDS)){
                log("[진입 실패] 이미 처리중인 작업이 존재합니다.");
                return false;
            }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


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
