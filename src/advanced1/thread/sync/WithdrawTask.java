package advanced1.thread.sync;

public class WithdrawTask implements Runnable{

    private BankAccount bankAccount;
    private int amount;

    // 계좌 인스턴스, 출금액을 인자로 받는다
    public WithdrawTask(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}
