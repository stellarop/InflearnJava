package advanced1.thread.volatile1;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(1000);

        task.flag = false;
        log("flag : " + task.flag + ", count : " + task.count + " main");
    }

    static class MyTask implements Runnable {

        // 캐시 메모리에 접근
        //boolean flag = true;
        //long count;

        // 메인 메모리에 접근
        volatile boolean flag = true;
        volatile long count;

        @Override
        public void run() {
            while (flag) {
                count++;
                // 1억번에 한번씩 출력
                if(count % 100_000_000 == 0){
                    // 콘솔에 결과를 출력하면 컨택스트 스위칭이 발생하면서 캐시 메모리의 값이 갱신된다
                    // 환경에 따라 다름
                    log("flag : " + flag + ", count : " + count + " in while");
                }
            }
            log("flag : " + flag + ", count : " + count + " 종료");
        }
    }
}
