package Intermediate1.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter innerOuter = new InnerOuter();
        // 내부 클래스에 접근하려면 인스턴스 생성 후 내부 클래스의 인스턴스를 생성 후 접근해야함
        InnerOuter.Inner inner = innerOuter.new Inner();

        inner.print();
        System.out.println("innerClass : " + inner.getClass());
    }
}
