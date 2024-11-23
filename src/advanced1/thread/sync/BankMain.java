package advanced1.thread.sync;

import advanced1.thread.sync.test.BankAccountV4;
import advanced1.thread.sync.test.BankAccountV5;
import advanced1.thread.sync.test.BankAccountV6;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {

        // BankAccountV1 account = new BankAccountV1(10000);


        // 임계 영역 메서드 설정
        // 객체의 인스턴스는 각자의 락을 가지고 있다(모니터 락)
        // t1 스레드 접근 시 인스턴스의 락을 획득해야만 접근할 수 있다
        // t2 스레드는 인스턴스의 락이 없으므로 실행 단계(RUNNABLE) -> 대기 상태(BLOCKED)로 변한다
        // 이때 대기 상태에서는 락을 획득할때까지 무한정 대기한다
        // t1 스레드가 작업을 완료하면 t2 스레드에서 락을 획득 후 실행 단계(RUNNABLE)로 변하여 실행한다
        // BankAccountV2 account = new BankAccountV2(10000);

        // 임계 영역을 메서드가 아닌 코드 블록에만 설정
        // BankAccountV3 account = new BankAccountV3(10000);
        // BankAccountV4 account = new BankAccountV4(10000);
        // BankAccountV5 account = new BankAccountV5(10000);
        BankAccountV6 account = new BankAccountV6(10000);
        Thread t1 = new Thread(new WithdrawTask(account, 8000), "t1");
        Thread t2 = new Thread(new WithdrawTask(account, 8000), "t2");
        // t1 스레드 시작
        t1.start();
        t2.start();

        sleep(500);
        log("t1 state : " + t1.getState());
        log("t2 state : " + t2.getState());

        // t1 스레드가 실행될때까지 대기
        t1.join();
        t2.join();

        // 스레드 2개를 이용하여 동시에 출금하면 검증 로직을 건너뛰고 -가 된다
        // t1 검증로직을 통과 후 출금이 되기전 t2 검증로직 통과
        log("최종 잔액 : " + account.getBalance());

    }
}
