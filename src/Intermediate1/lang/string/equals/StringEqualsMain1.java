package Intermediate1.lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        // 두 객체의 주소값이 달라서 false
        System.out.println("new String() == 비교 " + (str1 == str2));
        System.out.println("new String() equals 비교 " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";
        // 같은 문자열이면 문자열 풀에 두 개의 문자열을 저장하는게 아닌 하나의 문자열만 풀에 저장해놈
        // 두 개의 주소값을 참조하는게 아닌 하나의 주소값을 참조함
        // 결과적으로 자바 메모리 관리에 도움이 됨 그래서 == 비교가 ture
        System.out.println("리터럴 == 비교 " + (str3 == str4));
        System.out.println("리터럴 equals 비교 " + (str3.equals(str4)));

    }
}
