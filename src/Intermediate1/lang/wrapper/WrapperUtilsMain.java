package Intermediate1.lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        // 숫자 래퍼 객체 변환
        Integer i1 = Integer.valueOf(10);
        // 문자열 -> 래퍼 객체로 변환 가능
        Integer i2 = Integer.valueOf("10");
        // 문자열을 기본형으로 변환
        int intValue = Integer.parseInt("10");

        // valueOf()는 래퍼 타입을 반환
        // parseInt()는 기본형을 반환
        // 비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult : " + compareResult);

        // 산술 연산
        System.out.println("sum : " + Integer.sum(10,20));
        System.out.println("min : " + Integer.min(10,20));
        System.out.println("max : " + Integer.max(10,20));
    }
}
