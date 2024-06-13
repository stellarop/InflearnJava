package Intermediate1.enumeration.ex3;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.disCount(Grade.BASIC, price);
        int gold = discountService.disCount(Grade.GOLD, price);
        int diamond = discountService.disCount(Grade.DIAMOND, price);

        System.out.println("basic : " + basic);
        System.out.println("gold : " + gold);
        System.out.println("diamond : " + diamond);



    }
}
