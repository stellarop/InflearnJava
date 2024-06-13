package basic.ref;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ArrayList<ProductOrder2> productList = new ArrayList();
        productList.add(createOrder("옷장", 70000, 2));
        productList.add(createOrder("책상", 40000, 1));
        productList.add(createOrder("의자", 50000, 3));

        printList(productList);
        int sum = sumPrice(productList);
        System.out.println("총 합계 : " + sum);
    }

    static ProductOrder2 createOrder(String productName , int price, int quantity){
        ProductOrder2 productOrder2 = new ProductOrder2();
        productOrder2.productName = productName;
        productOrder2.price = price;
        productOrder2.quantity = quantity;

        return productOrder2;
    }

    static void printList(List<ProductOrder2> productList){
        for(int i = 0; i < productList.size(); i++){
            System.out.println("상품 : " + productList.get(i).productName
                    + " 가격 : " + productList.get(i).price + " 수량 : " +
                    productList.get(i).quantity);
        }
    }

    static int sumPrice(List<ProductOrder2> productList){
        int sumProduct = 0;

        for(int i = 0; i < productList.size(); i++){
            sumProduct += productList.get(i).price * productList.get(i).quantity;
        }
        return sumProduct;
    }
}

