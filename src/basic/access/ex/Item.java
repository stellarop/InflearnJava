package basic.access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

   public int itemInfo(){
       System.out.println("상품명 : " + name + ", 합계 : " + price * quantity);
       return price * quantity;
   }

}
