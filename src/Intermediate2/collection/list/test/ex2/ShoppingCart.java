package Intermediate2.collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> list = new ArrayList<>();

    public void addItem(Item item){
       list.add(item);
    }

    public void displayItems(){
        int total = 0;
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i <list.size(); i++) {
            System.out.println("상품명 : " + list.get(i).getName() + ", 합계 : " + list.get(i).getTotalPrice());
            total += list.get(i).getTotalPrice();
        }

        System.out.println("전체 가격 합 : " + total);
    }
}
