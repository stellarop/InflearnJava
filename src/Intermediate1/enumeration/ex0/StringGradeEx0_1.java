package Intermediate1.enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.disCount("BASIC", price);
        int GOLD = discountService.disCount("GOLD", price);
        int DIAMOND = discountService.disCount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + GOLD);
        System.out.println("DIAMOND 등급의 할인 금액 : " + DIAMOND);

    }
}
