package Intermediate1.enumeration.ex0;

public class DiscountService {
    public int disCount(String grade, int price){
        int discountPercent = 0;

        if(grade.equals("BASIC")){
            discountPercent = 10;
        }else if(grade.equals("GOLD")){
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        }else{
            System.out.println(grade + " : 할인x");
        }

        return price * discountPercent / 100;
    }
}
