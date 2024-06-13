package Intermediate1.enumeration.ex2;

public class DiscountService {
    public int disCount(ClassGrade classGrade, int price){
        int discountPercent = 0;

        // ClassGrade 의 참조값을 넘겨서 비교
        if(classGrade == ClassGrade.BASIC){
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        }else if (classGrade == ClassGrade.DIAMOND){
            discountPercent = 30;
        }else{
            System.out.println("할인 X");
        }


        return price * discountPercent / 100;
    }
}
