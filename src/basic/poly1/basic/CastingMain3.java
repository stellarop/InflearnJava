package basic.poly1.basic;

// 업캐스팅 vs 다운캐스팅
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        // 부모 타입은 자식 참조 변수를 담을 수 있음
        // 다른 타입으로 변경할 경우 캐스팅을 해야함(업캐스팅은 생략 가능)
        Parent parent1 = (Parent) child;
        // 업캐스팅 생략
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
