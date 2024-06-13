package Intermediate1.enumeration.ref1;


public class DiscountService {
    public int disCount(ClassGrade classGrade, int price){
        return price * classGrade.getDiscountPercent() / 100;
    }
}
