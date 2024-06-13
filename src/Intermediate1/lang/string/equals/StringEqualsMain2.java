package Intermediate1.lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("메서드 호출 비교1 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2 : " + isSame(str3, str4));

    }

    private static boolean isSame(String x, String y){
        // 파라메터로 String 객체를 생성한 변수가 들어올지, 문자열 풀에 들어있는 파라메터가 넘어올 지 모름
        // 그래서 문자열 비교는 무조건 equals
        // return x == y;
        return x.equals(y);

    }
}
