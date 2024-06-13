package Intermediate1.lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder ad = new ValueAdder();
        ValueAdder ad1 = ad.add(1);
        ValueAdder ad2 = ad.add(2);
        ValueAdder ad3 = ad.add(3);

        int sum = ad3.getValue();
        System.out.println("sum : " + sum);

        System.out.println("ad1 : " + ad1.getValue());
        System.out.println("ad2 : " + ad2.getValue());
        System.out.println("ad3 : " + ad3.getValue());
    }
}
