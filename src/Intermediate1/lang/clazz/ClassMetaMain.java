package Intermediate1.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        // Class 조회

        // 1. 클래스에서 조회
        Class clazz = String.class;
        // 2. 인스턴스에서 조회
        Class clazz1 = new String().getClass();
        // 문자열로 조회
        Class clazz2 = Class.forName("java.lang.String");

        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields){
            System.out.println("field : " + field.getType() + " " + field.getName());
        }

        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method : " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("Superclass : " + clazz.getSuperclass());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println("Interfaces" + anInterface.getName());
        }
    }
}
