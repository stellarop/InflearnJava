package basic.poly1.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal animalList[] = { dog, cat, caw };

        for (Animal list : animalList) {
            System.out.println("동물 소리 테스트 시작");
            list.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }
}
