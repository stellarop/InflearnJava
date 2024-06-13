package basic.access.ex;

public class ShoppingCart {
    private Item[] items = new Item[2];
    private int itemCount;

    // 장바구니에 상품 추가 메서드 Item 클래스 객체를 파라메터로 받는다
    public void addItem(Item item){

        if(itemCount < items.length){
            items[itemCount] = item;
            itemCount++;
        }else{
            System.out.println("장바구니가 가득 차서 상품을 추가할 수 없습니다.");
        }
    }

    // 전체 가격 출력 메서드
    public void displayItems(){

        int totalCount = 0;

        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < items.length; i++){
            totalCount += items[i].itemInfo();
        }

        System.out.println("전체 가격 합 : " + totalCount);
    }
}
