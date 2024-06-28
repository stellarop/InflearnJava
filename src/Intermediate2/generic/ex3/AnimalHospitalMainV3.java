package Intermediate2.generic.ex3;
import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHisV3<Dog> dogHis = new AnimalHisV3<>();
        AnimalHisV3<Cat> catHis = new AnimalHisV3<>();

        // 타입 매개변수 제한이 있기 때문에 Animal 타입만 제네릭으로 사용 가능
        // AnimalHisV3<String> string = new AnimalHisV3<String>()
        Dog dog = new Dog("개1", 100);
        Cat cat = new Cat("고양이1", 70);

        // 개 병원 비교
        dogHis.set(dog);
        dogHis.checkup();

        catHis.set(cat);
        catHis.checkup();

        // 제네릭으로 타입을 지정해줬기 때문에 다른 타입이 들어오면 컴파일 오류
        // dogHis.set(cat);

        Dog animal = dogHis.bigger(new Dog("개2", 300));
        System.out.println("bigger : " + animal);
    }
}
