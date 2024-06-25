package Intermediate2.generic.ex2;

import Intermediate2.generic.animal.Animal;
import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("개", 100);
        Cat cat = new Cat("고양이", 70);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);

        Dog findDog = dogBox.getValue();
        System.out.println("findDog : " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        Cat findCat = catBox.getValue();
        System.out.println("findCat : " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal : " + findAnimal);

    }
}
