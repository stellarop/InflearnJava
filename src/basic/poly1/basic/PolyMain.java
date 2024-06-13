package basic.poly1.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        // 부모 타입은 자식 인스턴스를 참조 가능하다.
        // 하지만 자식 메서드에는 접근하지 못한다. (접근하려면 캐스팅이 필요하다)
        // 타입이 부모 클래스 타입이므로 부모 타입의 메서드부터 찾기 때문이다(아래로는 내려갈 수 없음)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
    }
}
