package Intermediate2.generic.ex3;

import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHis dogHis = new DogHis();
        CatHis catHis = new CatHis();

        Dog dog = new Dog("개1", 100);
        Cat cat = new Cat("고양이1", 70);

        // 개 병원 비교
        dogHis.set(dog);
        dogHis.checkup();

        catHis.set(cat);
        catHis.checkup();

        // 문제1 : 개 병원에 고양이 타입 인스턴스를 전달
        // 공통된 제네릭 타입 병원을 만들어서 어떤 타입이던 받아서 처리하게 만듬
        // 문제2 : 특정 타입만 리턴
        // 개, 고양이 특정 타입만 반환한다. 이것도 공통 제네릭 클래스로 만들어서 처리

        Dog dog2 = dogHis.bigger(new Dog("개2", 300));
        System.out.println("bigger : " + dog2);
    }
}
