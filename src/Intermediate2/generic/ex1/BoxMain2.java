package Intermediate2.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {

        // object 타입은 모든 타입의 부모
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer : " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str : " + str);

        // Object 를 통해 다형성으로 중복 해결을 하였지만
        // 모든 타입이 들어올 수 있다는 문제점이 있다 (타입 안정성 x)
        integerBox.set("str");
    }
}
