package Intermediate2.generic.ex2;

import Intermediate2.generic.animal.Animal;
import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        // 타입 파라메터엔 참조형 타입 외에 클래스 객체도 지정 가능하다(클래스 객체도 참조형의 일환)
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("개", 100);
        Cat cat = new Cat("고양이", 70);

        Box<Animal> animalBox = new Box<>();
        // 당연하게도 Animal 타입의 제네릭은 자식 인스턴스를 넘길 수 있다
        animalBox.setValue(dog);
        animalBox.setValue(cat);
        animalBox.setValue(animal);

        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal : " + findAnimal);

    }
}
