package Intermediate1.nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 정적 중첩 클래스
    // 정적 중첩 클래스는 바깥 클래스의 정적 필드에 접근할 수 있다.
    // 하지만 바깥 클래스가 만든 인스턴스 필드에는 접근할 수 없다 바깥 인스턴스의 참조가 없기 때문
    static class Nested{
        private int nestedInstanceValue = 1;

        public void print(){
            // 자신의 필드에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 필드에 접근 불가능
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 필드에는 접근 할 수 있다
            System.out.println(outClassValue);
        }
    }
}
