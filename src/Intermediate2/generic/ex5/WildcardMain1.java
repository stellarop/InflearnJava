package Intermediate2.generic.ex5;

import Intermediate2.generic.animal.Animal;
import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("개1", 100));
        // 인스턴스를 그대로 리턴하기 때문에 toString 메서드 호출
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printGenericV3(dogBox);

        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        catBox.set(new Cat("고양이1", 70));

        // 제네릭 메서드와 와일드카드 차이점
        // 제네릭 메서드는 넘어간 파라메터의 타입을 리턴하거나 변경할 수 있지만
        // 와일드카드는 타입이 정해져 있기 때문에 리턴하거나 변경할 수 없다

        // 제네릭 메서드
        // 전달한 타입을 명확하게 리턴할 수 있다.
        Dog dog = WildcardEx.printGenericV3(dogBox);
        Cat cat = WildcardEx.printGenericV3(catBox);
        // 와일드카드
        // 전달한 타입을 명확하게 리턴할 수 없다.
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    }
}
