package basic.poly1.ex6.pay;

public class PayService {
    public void processPay(String option, int price){

        boolean result;


        InterfacePay [] interfacePay = {new KakaoPay(),  new NaverPay()};

        if(option == null || option == ""){
            result(false);
        }

        System.out.println("결제를 시작합니다 : option : " + option + ", price : " + price);

        for (InterfacePay payList : interfacePay){
            result(result = payList.pay(price));
        }

    }

    private void result(boolean bln){
        if(bln){
            System.out.println("결제에 성공 했습니다.");
        }else{
            System.out.println("결제 수단이 없습니다.");
        }

    }
}
