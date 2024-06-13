package basic.poly1.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);

    }

    private static void soundAnimal(InterfaceAnimal list) {
        System.out.println("동물 소리 테스트 시작");
        list.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
