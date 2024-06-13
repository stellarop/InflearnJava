package Intermediate1.enumeration.ref1;


import static Intermediate1.enumeration.ref1.ClassGrade.*;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.disCount(BASIC, price);
        int gold = discountService.disCount(GOLD, price);
        int diamond = discountService.disCount(DIAMOND, price);

        System.out.println("basic : " + basic);
        System.out.println("gold : " + gold);
        System.out.println("diamond : " + diamond);



    }
}
