package advanced1.thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasMainV1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value : " + atomicInteger.get());

        // atomicInteger 에 들어있는 값이 0이면 새로운 값(newValue) 으로 치환
        boolean result1 = atomicInteger.compareAndSet(0, 1);
        System.out.println("result1 : " + result1 + ", value : " + atomicInteger.get());

        // atomicInteger 에 들어있는 값이 0이 아니면 false 를 반환하고 값 변경 x
        boolean result2 = atomicInteger.compareAndSet(0, 1);
        System.out.println("result2 : " + result2 + ", value : " + atomicInteger.get());

    }
}
