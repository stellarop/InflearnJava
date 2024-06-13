package Intermediate1.enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // 열거형은 생성자 앞 private 이 생략
    Grade(int discountPercent){
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public int disCount(int price){
        return price * discountPercent / 100;
    }
}
