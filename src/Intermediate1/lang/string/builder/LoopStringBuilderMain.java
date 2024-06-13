package Intermediate1.lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        // 문자열을 합칠때 대부분 최적화가 되므로 + 연산 사용
        // StringBuilder 를 직접 사용하면 좋은 경우
        // 1. 반복문에서 반복해서 문자를 연결할 때
        // 2. 조건문을 통해 동적으로 문자열을 조합할 때
        // 3. 복잡한 문자열의 특정 부분을 변경할 때
        // 4. 매우 긴 대용량의 문자열을 다룰때
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 100000; i++){

            sb.append("Hello Java");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result : " + sb);
        System.out.println("time : " + (endTime - startTime) + "ms");
    }
}
