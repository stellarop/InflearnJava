package Intermediate2.generic.ex3;
import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHisV1 dogHis = new AnimalHisV1();
        AnimalHisV1 catHis = new AnimalHisV1();

        Dog dog = new Dog("개1", 100);
        Cat cat = new Cat("고양이1", 70);


        // 개 병원 비교
        dogHis.set(dog);
        dogHis.checkup();

        catHis.set(cat);
        catHis.checkup();

        // 문제1 : 개 병원에 고양이 타입 인스턴스를 전달
        // Animal 타입의 다형성으로 해결하려고 하면 개 병원에 고양이 타입이 들어가는 문제가 발생함
        dogHis.set(cat);

        // 문제2 : 특정 타입만 리턴
        // 이건 Animal 클래스 타입의 다형성을 이용하여 해결()

        Dog animal = (Dog) dogHis.bigger(new Dog("개2", 300));
        System.out.println("bigger : " + animal);
    }
}
