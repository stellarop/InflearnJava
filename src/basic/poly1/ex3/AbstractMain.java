package basic.poly1.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스 생성 불가
        // AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);

    }

    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
