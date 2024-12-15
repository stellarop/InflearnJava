package advanced1.thread.cas.spinlock;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class SpinLockBad {
    // 락 사용 여부를 위한 플레그
    private volatile boolean lock = false;

    public void lock(){
        log("락 획득 시도");
        while (true) {
            // 락 사용 여부
            if(!lock) {
                sleep(100);
                // 락의 값 변경
                lock = true;
                break;
            }else{
                // 락 획득할때까지 대기
                log("락 획득 실패 - 대기");
            }
        }
        log("락 획득 완료");
    }

    public void unlock(){
        lock = false;
        log("락 반납 완료");
    }
}
