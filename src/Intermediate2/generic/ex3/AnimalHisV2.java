package Intermediate2.generic.ex3;

public class AnimalHisV2<T> {
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        // T의 타입을 정의하기 전까진 T 타입의 메서드를 사용할 수 없다
        // System.out.println("동물 이름 : " + animal.getName());
        // System.out.println("동물 크기 : " + animal.getSize());
        //animal.sound();
    }

    public T bigger(T target){
        // return animal.getSize() > target.getSize() ? animal : target;
        return target;
    }
}
