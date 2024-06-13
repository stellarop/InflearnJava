package Intermediate1.lang.object.ex;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(100, 20);
        Rectangle rectangle2 = new Rectangle(100, 20);

        // System.out.println 을 실행하면 toString() 메서드가 실행된다.(클래스 이름, 객체의 참조값 등등)
        // toString 메서드를 오버라이딩 후 출력
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        // 두 객체의 참조값이 동일한지 확인
        System.out.println(rectangle1 == rectangle2);
        // equals() 메서드 오버라이딩 후 두 객체의 필드 값이 동등한지 확인
        System.out.println(rectangle1.equals(rectangle2));
    }
}
