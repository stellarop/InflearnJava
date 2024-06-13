package Intermediate1.lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper(기본형 -> 래퍼 클래스 변환)
        int value = 7;
        // 오토 박싱(Auto-boxing)
        Integer boxedValue = value;

        // Wrapper -> Primitive(래퍼 클래스 -> 기본형 변환)
        // 오토 언박싱(Auto-Unboxing)
        int unBoxedValue = boxedValue;

        System.out.println("boxedValue : " + boxedValue);
        System.out.println("unBoxedValue : " + unBoxedValue);
    }
}
