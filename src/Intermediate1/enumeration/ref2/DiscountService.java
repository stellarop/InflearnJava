package Intermediate1.enumeration.ref2;



public class DiscountService {
    public int disCount(Grade grade, int price){
        return price * grade.getDiscountPercent() / 100;
    }
}
