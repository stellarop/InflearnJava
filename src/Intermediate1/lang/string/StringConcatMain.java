package Intermediate1.lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";

        // 자바에서 문자열을 더할때 concat() 제공(다른 언어나 쿼리에서도 제공)
        String result1 = str1.concat(str2);

        // 자바에선 주소값을 더하는건 안된다
        // 문자열을 더하는 연산은 자주 이뤄지기 때문에 퍈의상 + 연산 제공
        String result2 = str1 + str2;

        System.out.println(result1);
        System.out.println(result2);

    }
}
