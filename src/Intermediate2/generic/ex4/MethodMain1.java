package Intermediate2.generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 제네릭 타입을 object 로 지정하면 모든 타입을 다 받을 수 있지만
        // 넘기는 인자의 타입으로 캐스팅 해야 함
        Integer integer = (Integer) GenericMethod.objMethod(i);

        // 타입 인자 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result : " + result);

        // 타입 인자를 String 으로 제한했기 때문에 다른 타입의 인자를 전달할 수 없음
        String string = GenericMethod.stringMethod("hello");
        System.out.println("string : " + string);
    }
}
