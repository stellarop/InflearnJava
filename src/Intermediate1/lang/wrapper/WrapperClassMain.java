package Intermediate1.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        // 래퍼 클래스는 전부 불변이기 때문에 동일성(==) 비교 말고 동등성(equals)로 진행
        Integer newInteger = new Integer(10);
        // 값을 새로운 객체에 담아서 리턴
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(1000);
        Double doubleObj = Double.valueOf(10000);

        System.out.println("newInteger : " + newInteger);
        System.out.println("integerObj : " + integerObj);
        System.out.println("longObj : " + longObj);
        System.out.println("doubleObj : " + doubleObj);

        System.out.println("내부 값 읽기");
        // 불변 필드의 값을 리턴
        int intValue = integerObj.intValue();
        Long longValue = longObj.longValue();
        Double doubleValue = doubleObj.doubleValue();

        System.out.println("intValue : " + intValue);
        System.out.println("longValue : " + longValue);
        System.out.println("doubleValue : " + doubleValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals() : " + (newInteger.equals(integerObj)));

    }
}
