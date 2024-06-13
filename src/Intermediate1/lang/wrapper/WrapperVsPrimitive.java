package Intermediate1.lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        // 반복 횟수 설정 10억회
        int iterations = 1_000_000_000;
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();

        for(int i = 0; i < iterations; i++){
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive : " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime) + "ms");


        // 래퍼 클래스 long 사용
        // 기본형 long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();

        for(int i = 0; i < iterations; i++){
            // 오토 박싱 발생
            sumWrapper += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper : " + sumWrapper);
        System.out.println("래퍼형 long 실행 시간 : " + (endTime - startTime) + "ms");

        // 기본형 연산이 래퍼 클래스보다 훨씬 빠르다.
        // 기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지한다.
        // 래퍼 클래스의 인스턴스는 내부의 필드로 가지고 있는 기본형의 값 뿐만 아니라
        // 자바에서 객체를 다루는데 필요한 메타 데이터를 포함하므로 더 많은 메모리를 사용한다
        // 불변 객체를 더해서 계속 새로운 값을 리턴해주는것과 비슷한거 같음
    }
}
