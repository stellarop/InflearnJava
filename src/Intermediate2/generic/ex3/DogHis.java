package Intermediate2.generic.ex3;

import Intermediate2.generic.animal.Dog;

public class DogHis {
    private Dog animal;

    public void set(Dog animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target){
        // 동물 size 비교 후 더 큰 값의 인스턴스 리턴
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
