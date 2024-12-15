package advanced1.thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

import static advanced1.util.MyLogger.log;

public class CasMainV2 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value : " + atomicInteger.get());

        // incrementAndGet() 값 하나 증가
        //int result = atomicInteger.incrementAndGet();
        //System.out.println("result : " + result);

        //int result2 = atomicInteger.incrementAndGet();
        //System.out.println("result2 : " + result2);

        // incrementAndGet 구현
        int resultValue = incrementAndGet(atomicInteger);
        System.out.println("resultValue : " + resultValue);

        int resultValue2 = incrementAndGet(atomicInteger);
        System.out.println("resultValue2 : " + resultValue2);
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {

        int getValue;
        boolean result;

        do{
            // atomicInteger 에서 값을 가져온다
            getValue = atomicInteger.get();
            log("getValue : " + getValue);

            // atomicInteger 값과 입력한 값이 일치하면 + 1
            // 기존 값이 계속 유지가 되면 값을 변경, 중간에 값이 바뀌면 반복
            result = atomicInteger.compareAndSet(getValue, getValue + 1);
            log("result : " + result);
        }while (!result);

        return getValue + 1;
    }
}
