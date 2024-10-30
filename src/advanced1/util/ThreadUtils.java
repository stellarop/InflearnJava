package advanced1.util;

import static advanced1.util.MyLogger.log;

public abstract class ThreadUtils {
    public static void sleep(long millis){
       try {
           // 초를 인자로 받아서 슬립
           Thread.sleep(millis);
       }catch (InterruptedException e){
           // 예외가 발생하면
           log("인터럽트 발생, " + e.getMessage());
           // 런타임으로 던진다
           throw new RuntimeException(e);
       }
    }
}
