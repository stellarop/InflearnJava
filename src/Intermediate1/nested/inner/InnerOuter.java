package Intermediate1.nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner{
        private int innerInstanceValue = 1;

        public void print(){
            // 외부에서 print() 메서드를 호출 시 바깥 클래스 인스턴스로 내부 클래스를 호출한다
            // 이때 바깥 클래스의 참조값을 보관하고 있기 때문에 바깥 클래스의 필드에 접근할 수 있다

            // 자기 자신에 접근
            System.out.println(innerInstanceValue);
            // 외부 클래스의 인스턴스 멤버에 접근 가능 private 도 가능
            System.out.println(outInstanceValue);
            // 외부 클래스의 클래스 멤버에 접근 가능 private 도 가능
            System.out.println(outClassValue);
        }
    }
}
