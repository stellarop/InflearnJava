package basic.poly1.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 자식의 기능을 호출할 수 없다
        // poly.childMethod();

        // 다운캐스팅(부모타입 -> 자식타입)
        // 자식 인스턴스를 참조한 부모 변수의 인스턴스를 자식 타입 변수에 할당
        Child child = (Child) poly;
        child.childMethod();


    }
}
