package Intermediate2.generic.ex4;

import Intermediate2.generic.animal.Animal;

public class AnimalMethod {
    public static <T extends Animal> void checkup(T t){
        // T의 타입을 정의하기 전까진 T 타입의 메서드를 사용할 수 없다
        System.out.println("동물 이름 : " + t.getName());
        System.out.println("동물 크기 : " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1, T t2){
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
