package Intermediate1.enumeration.ex1;

public class DiscountService {
    public int disCount(String grade, int price){
        int discountPercent = 0;

        if(grade.equals(StringGrade.BASIC)){
            discountPercent = 10;
        }else if(grade.equals(StringGrade.GOLD)){
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        }else{
            System.out.println(grade + " : 할인x");
        }

        return price * discountPercent / 100;
    }
}
