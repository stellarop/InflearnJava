package Intermediate2.generic.ex4;

import Intermediate2.generic.animal.Animal;

public class ComplexBox <T extends Animal>{
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z){
        // 제네릭 클래스 타입
        System.out.println("animal.className : " + animal.getClass().getName());
        // 제네릭 메서드 타입
        System.out.println("t.className : " + z.getClass().getName());
        return z;
    }
}
