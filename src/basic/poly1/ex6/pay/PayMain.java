package basic.poly1.ex6.pay;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();

        String option1 = "kakao";
        int price1 = 10000;
        payService.processPay(option1, price1);

        String option2 = "naver";
        int price2 = 20000;
        payService.processPay(option2, price2);


    }
}
