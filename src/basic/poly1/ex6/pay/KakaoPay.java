package basic.poly1.ex6.pay;

public class KakaoPay implements InterfacePay{
    @Override
    public boolean pay(int price) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(price + "원 결제를 시도합니다");
        return true;
    }
}
