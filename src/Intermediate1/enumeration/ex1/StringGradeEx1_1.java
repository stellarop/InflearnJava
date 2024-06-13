package Intermediate1.enumeration.ex1;


public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

       DiscountService discountService = new DiscountService();

        int basic = discountService.disCount(StringGrade.BASIC, price);
        int GOLD = discountService.disCount(StringGrade.GOLD, price);
        int DIAMOND = discountService.disCount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + GOLD);
        System.out.println("DIAMOND 등급의 할인 금액 : " + DIAMOND);

    }
}
