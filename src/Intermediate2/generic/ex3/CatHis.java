package Intermediate2.generic.ex3;

import Intermediate2.generic.animal.Cat;

public class CatHis {
    private Cat animal;

    public void set(Cat animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target){
        // 동물 size 비교 후 더 큰 값의 인스턴스 리턴
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
