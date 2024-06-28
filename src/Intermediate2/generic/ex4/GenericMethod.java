package Intermediate2.generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj){
        System.out.println("Object print : " + obj);
        return obj;
    }

    // 제네릭도 메서드로 사용 가능
    public static <T> T genericMethod(T t){
        System.out.println("Object print : " + t);
        return t;
    }

    // 타입 지정도 가능하다
    public static <T extends String> T stringMethod(T t){
        System.out.println("String print : " + t);
        return t;
    }
}
