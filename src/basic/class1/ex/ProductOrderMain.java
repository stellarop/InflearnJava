package basic.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "책상";
        productOrder1.price = 50000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "의자";
        productOrder2.price = 65000;
        productOrder2.quantity = 1;

        ProductOrder[] productOrders = new ProductOrder[2];
        productOrders[0] = productOrder1;
        productOrders[1] = productOrder2;


        // 지역 변수 0으로 초기화
        int sumPrice = 0;

        for(ProductOrder po : productOrders){
            // 가격 * 수량 지역 변수에 더하기
            sumPrice += po.price * po.quantity;
            System.out.println("상품명 : " + po.productName + ", 가격 : " + po.price + ", 수량 : " + po.quantity);
        }
        // 최종 금액 출력
        System.out.println("최종 금액 : " + sumPrice);
    }
}
