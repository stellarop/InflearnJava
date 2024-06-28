package Intermediate2.generic.ex3;

import Intermediate2.generic.animal.Animal;

// 타입 매개변수 제한
// 제네릭 타입을 지정 후 Animal 타입으로만 제한한다
public class AnimalHisV3<T extends Animal> {
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        // T의 타입을 정의하기 전까진 T 타입의 메서드를 사용할 수 없다
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
