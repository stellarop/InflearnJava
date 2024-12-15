package advanced1.thread.cas.spinlock;

import java.util.concurrent.atomic.AtomicBoolean;

import static advanced1.util.MyLogger.log;

public class SpinLock {
    // 락 사용 여부를 위한 플레그
    private final AtomicBoolean lock = new AtomicBoolean(false);

    public void lock() {
        log("락 획득 시도");

        // 락이 false 면 true 로  변경
        while (!lock.compareAndSet(false, true)) {
            log("락 획득 실패 - 스핀 대기");

        }
        log("락 획득 완료");
    }

    public void unlock () {
        lock.set(false);
        log("락 반납 완료");
    }
}
