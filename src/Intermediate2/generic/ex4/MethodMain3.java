package Intermediate2.generic.ex4;

import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("개1", 100);
        Cat cat = new Cat("고양이1", 70);

        ComplexBox<Dog> dogComplexBox = new ComplexBox<>();
        dogComplexBox.set(dog);

        Cat returnCat = dogComplexBox.printAndReturn(cat);
        System.out.println("returnCat : " + returnCat);
    }
}
