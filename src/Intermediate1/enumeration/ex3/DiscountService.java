package Intermediate1.enumeration.ex3;


import static Intermediate1.enumeration.ex3.Grade.*;

public class DiscountService {
    public int disCount(Grade classGrade, int price){
        int discountPercent = 0;

        // ClassGrade 의 참조값을 넘겨서 비교
        if(classGrade == BASIC){
            discountPercent = 10;
        } else if (classGrade == GOLD) {
            discountPercent = 20;
        }else if (classGrade == DIAMOND){
            discountPercent = 30;
        }else{
            System.out.println("할인 X");
        }


        return price * discountPercent / 100;
    }
}
