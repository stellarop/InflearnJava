package Intermediate1.lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";

        for(int i = 0; i < 100000; i++){
            // 반복 횟수만큼 객체를 생성해야 되기 때문에 시간이 오래 걸린다.
            // 반복문 내에서 문자열 연결은 런타임에 연결할 문자열의 개수와 내용이 결정됨
            result += "Hello Java";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result : " + result);
        System.out.println("time : " + (endTime - startTime) + "ms");
    }
}
