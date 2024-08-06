package Intermediate2.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> map = new HashMap<>();

    public void add(Product product, int quantity){
        Integer orDefault = map.getOrDefault(product, 0);
        map.put(product, orDefault + quantity);
    }

    public void minus(Product product, int quantity){
        // getOrDefault() : key 가 존재하면 value 의 값을 리턴하고
        // 없으면 defaultValue(두번째 파라메터 값)을 리턴한다
        Integer orDefault = map.getOrDefault(product, 0);

        int newQuantity = orDefault - quantity;
        if(quantity <= 0){
            map.remove(product);
        }

        map.put(product, newQuantity);
    }

    public void printAll(){

        for(Map.Entry<Product, Integer> entry : map.entrySet()){
            System.out.println("상품명 : " + entry.getKey() + ", 상품 수량 : " + entry.getValue());
        }


    }
}
