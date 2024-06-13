package Intermediate1.enumeration.ref3;


public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        System.out.println("BASIC : " + Grade.BASIC.disCount(price));
        System.out.println("GOLD : " + Grade.GOLD.disCount(price));
        System.out.println("DIAMOND : " + Grade.DIAMOND.disCount(price));

    }
}
