package Intermediate1.lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = "hello java";
        String str3 = "Hello World";

        // 문자열 비교
        System.out.println("str1 equals str2" + str1.equals(str2));
        // 문자열 비교 + 대소문자 무시
        System.out.println("str1 equals str2" + str1.equalsIgnoreCase(str2));
        // 문자열을 사전 순으로 계산
        System.out.println("'b compareTo 'a' : " + "b".compareTo("a"));
        System.out.println("'str1' compareTo 'str2' : " + str1.compareTo(str2));
        // 문자열을 사전 순으로 계산 + 대소문자 무시
        System.out.println("'str1' compareTo 'str2' : " + str1.compareToIgnoreCase(str2));

    }
}
