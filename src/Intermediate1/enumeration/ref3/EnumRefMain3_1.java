package Intermediate1.enumeration.ref3;


public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        
        DiscountService discountService = new DiscountService();
        int BASIC = discountService.disCount(Grade.BASIC, price);
        int GOLD = discountService.disCount(Grade.GOLD, price);
        int DIAMOND = discountService.disCount(Grade.DIAMOND, price);

        System.out.println("BASIC : " + BASIC);
        System.out.println("GOLD : " + GOLD);
        System.out.println("DIAMOND : " + DIAMOND);

    }
}
