package basic.access.b;

public class BankAccount {
    private int balance;

    public BankAccount(){
        balance = 0;
    }

    // public 메서드 입금 관련
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액");
        }

    }

    // public 메서드 출금 관련
    public void withdraw(int amount){
        // 금액이 0보다 크고 잔고 - 출금금액이 0이거나 0보다 커야함
        if(isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        }else{
            System.out.println("잔액 부족");
        }
    }

    // public 메서드 잔액 관련
    public int getBalance(){
        return balance;
    }

    // 캡슐화 메서드
    // 내부 검증 로직을 가진 메서드는 외부에서 접근을 막아야 함
    private boolean isAmountValid(int amount){
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
