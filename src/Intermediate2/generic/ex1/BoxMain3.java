package Intermediate2.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        // 생성 시점에 T 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        // Integer 타입 리턴 캐스팅 x
        Integer integer = integerBox.get();
        System.out.println("integer : " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str : " + str);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        // 컴파일러가 생략
        // GenericBox<Integer> integerBox2 = new GenericBox<>()
    }
}
