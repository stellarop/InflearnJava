package Intermediate2.generic.ex4;

import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("개1", 100);
        Cat cat = new Cat("고양이1", 70);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog bigDog = new Dog("큰개", 250);
        Dog bigger = AnimalMethod.bigger(dog, bigDog);
        System.out.println("bigger : " + bigger);
    }
}
