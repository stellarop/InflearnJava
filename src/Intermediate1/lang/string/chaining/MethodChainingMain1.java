package Intermediate1.lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder ad = new ValueAdder();
        ad.add(1);
        ad.add(2);
        ad.add(3);

        int sum = ad.getValue();
        System.out.println("sum : " + sum);

    }
}
