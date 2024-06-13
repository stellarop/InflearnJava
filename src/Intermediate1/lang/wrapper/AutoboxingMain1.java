package Intermediate1.lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        // Primitive -> Wrapper(기본형 -> 래퍼 클래스 변환)
        int value = 7;
        // 박싱된 벨류
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive(래퍼 클래스 -> 기본형 변환)
        int unBoxedValue = boxedValue.intValue();

        System.out.println("boxedValue : " + boxedValue);
        System.out.println("unBoxedValue : " + unBoxedValue);
    }
}
