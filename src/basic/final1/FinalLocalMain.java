package basic.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        // 최초 한번만 할당 가능 자바스크립트 const랑 같음
        data1 = 10;

        // final 지역 변수2
        final int data2 = 10;
        // data2 = 20;

        method(10);
    }
    static void method(final int param){
        // 파라메터로 넘겨받은 변수도 할당 불가능
        // param = 20;
    }
}
