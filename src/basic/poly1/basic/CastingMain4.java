package basic.poly1.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        // parent1 변수에 부모 타입(Parent)에는 자식 클래스(Child) 대입 후
        // 객체를 생성해주었기 때문에 부모 클래스, 자식 클래스에 있는 메서드를 모두 호출할 수 있고
        // 다운캐스팅을 할 수 있음
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        // parent2 변수에 부모 타입(Parent)에는 부모 클래스(Parent)를 대입했기 때문에
        // 부모 클래스에 있는 메서드를 호출할 수 있다.
        // 따라서 Child 다운캐스팅은 오류가 발생한다.
        Child child2 = (Child) parent2; // ClassCastException
        child2.childMethod();
    }
}
