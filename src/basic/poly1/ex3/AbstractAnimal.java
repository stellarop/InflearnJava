package basic.poly1.ex3;

// 추상 클래스 ex) 동물 > 추상 클래스 | 사자 -> 구현 클래스
public abstract class AbstractAnimal {

    // 추상 메서드 자식 클래스에서 오버라이딩 필수
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직인다.");
    }
}
