package advanced1.thread.cas.increment;

public class IncrementPerformanceMain {

    // 1억번
    public static final long COUNT = 100_000_000;

    public static void main(String[] args) {
        // 캐시 메모리에 접근하여 처리하기 때문에 가장 빠르다 멀티 스레드 상황에선 사용 x
        test(new BasicInteger());
        // 메인 메모리에 접근하여 처리하기 때문에 느리다 멀티 스레드 상황에선 사용 x
        test(new VolatileInteger());
        // synchronized 사용한 임계 영역에 있기 때문에 멀티 스레드 상황에서 안전하게 사용 가능
        test(new SyncInteger());
        // Java 가 제공하는 AtomicInteger 사용 멀티 스레드 상황에서 안전하게 사용 가능
        // synchronized, lock 보다 빠르다
        // AtomicInteger 에 incrementAndGet() 메서드는 락을 사용하지 않고 원자적 연산을 만들어 낸다
        test(new MyAtomicInteger());
    }

    private static void test(IncrementInteger incrementInteger){
        long startMs = System.currentTimeMillis();

        for (int i = 0; i < COUNT; i++) {
            incrementInteger.increment();
        }

        long endMs = System.currentTimeMillis();

        System.out.println(incrementInteger.getClass().getSimpleName() + " : ms " + (endMs - startMs));

    }
}
