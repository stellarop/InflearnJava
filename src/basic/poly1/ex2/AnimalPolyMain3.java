package basic.poly1.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal animalList[] = {new Dog(), new Cat(), new Caw()};

        for(Animal list : animalList){
            soundAnimal(list);
        }

    }

    private static void soundAnimal(Animal list) {
        System.out.println("동물 소리 테스트 시작");
        list.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
