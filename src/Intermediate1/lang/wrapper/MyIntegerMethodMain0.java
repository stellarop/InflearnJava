package Intermediate1.lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        // 기본형의 한계
        // 자바의 기본형 타입은 객체가 아니기 때문에 한계가 있다.
        // 객체가 아니기 때문에 oop 의 장점을 살릴 수 없다.
        // 메서드 사용, 컬렉션 사용, 제네릭 사용x

        // null 값을 가질 수 없음
        // 기본형은 항상 값을 가진다.

        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    public static int compareTo(int value, int target){
        if(value < target){
            return -1;
        }else if(value > target){
            return 1;
        }else{
            return 0;
        }
    }
}
