package Intermediate2.generic.ex5;

import Intermediate2.generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box){
        System.out.println("T : " + box.get());
    }

    // <?> = 와일드카드는 모든 타입이 들어올 수 있다
    static void printWildcardV1(Box<?> box){
        System.out.println("? : " + box.get());
    }

    // 와일드카드도 타입 제한을 걸 수 있다
    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("? : " + animal.getName());
    }


    static<T extends Animal> void printGenericV2(Box<T> box){
        // 제네릭 메서드 타입은 파라메터로 받은 제네릭 타입을 받을 수 있음
        T t = box.get();
        System.out.println("이름 : " + t.getName());
    }

    static<T extends Animal> T printGenericV3(Box<T> box){
        // 제네릭 메서드 타입은 파라메터로 받은 제네릭 타입을 받을 수 있음
        T t = box.get();
        System.out.println("이름 : " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        // 제네릭 메서드 타입은 파라메터로 받은 제네릭 타입을 받을 수 있음
        Animal animal = box.get();
        System.out.println("이름 : " + animal.getName());
        return animal;
    }
}
