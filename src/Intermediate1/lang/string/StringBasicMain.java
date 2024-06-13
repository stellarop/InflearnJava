package Intermediate1.lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // 대문자로 시작하는 타입은 객체, 클래스이다(참조형)
        // 참조형 변수에는 해당 인스턴스가 있는 주소값이 들어가야한다.
        // String 클래스는 문자열을 대입받는다(?) 왜 이렇게 되지?
        String str1 = "hello"; // 기존
        // 인스턴스 생성 후 파라메터로 문자열을 넘길수도 있음
        String str2 = new String("hello"); // 자주 사용되기때문에 기존에서 이렇게 변경된다

        System.out.println(str1);
        System.out.println(str2);

    }
}
