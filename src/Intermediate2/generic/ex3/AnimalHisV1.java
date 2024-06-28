package Intermediate2.generic.ex3;

import Intermediate2.generic.animal.Animal;

public class AnimalHisV1 {
    private Animal animal;

    public void set(Animal animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target){
        // 동물 size 비교 후 더 큰 값의 인스턴스 리턴
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
