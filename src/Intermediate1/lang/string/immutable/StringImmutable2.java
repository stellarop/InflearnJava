package Intermediate1.lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        // String 은 불변 객체다. 변경이 필요하면 기존 값을 변경하지 않고 새로운 결과를 만들어서 리턴한다
        // str1  변수에는 hello 라는 문자열이 그대로 들어있음. 불변이기 때문에
        String str2 = str1.concat("java");

        System.out.println(str2);
    }
}
