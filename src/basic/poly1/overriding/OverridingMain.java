package basic.poly1.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("Value : " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value : " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        // 변수는 오버라이딩 x
        System.out.println("value : " + poly.value);
        // 메서드는 오버라이딩 o
        // 오버라이딩 된 메서드는 항상 우선권을 가지고 호출됨(하위 자식의 오버라이딩 된 메서드가 우선권을 가짐)
        poly.method();

        // 다형적참조 : 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능
        // 메서드 오버라이딩 : 기존 기능을 하위 타입에서 새로운 기능으로 재정의
    }
}
