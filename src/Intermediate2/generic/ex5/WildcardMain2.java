package Intermediate2.generic.ex5;

import Intermediate2.generic.animal.Animal;
import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);
        // Animal 하위 타입이여서 컴파일 오류
        // writeBox(dogBox);
        // writeBox(catBox);

        Animal animal = animalBox.get();
        System.out.println("animal : " + animal);

    }

    // <? super Animal> = Animal 보다 상위 타입 Animal 포함
    // <? extends Animal> = Animal 보다 하위 타입 Animal 포함

    // 와일드카드 타입이 Animal 보다 상위 타입
    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("개1", 100));
    }
}
