package Intermediate1.enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        // 존재하지 않는 등급
        int vip = discountService.disCount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 : " + vip);

        // 오타
        int diamondd = discountService.disCount("DIAMONDD", price);
        System.out.println("diamondd 등급의 할인 금액 : " + vip);

        // 소문자
        int gold = discountService.disCount("gold", price);
        System.out.println("gold 등급의 할인 금액 : " + gold);
    }
}
