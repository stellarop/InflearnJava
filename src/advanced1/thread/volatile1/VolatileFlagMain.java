package advanced1.thread.volatile1;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {

        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");

        log("runFlag : " + task.runFlag);
        thread.start();

        sleep(1000);
        log("runFlag false 로 변경 시도");
        task.runFlag = false;
        // task.runFlag 를 false 로 변경 하였으나 while 문을 빠져나오지 못하고 계속 반복한다
        // main 스레드,task 스레드는 각각의 캐시 메모리를 가지고 있고 공통의 메인 메모리를 가지고 있다
        // runFlag 의 값을 변경 시 maim 스레드의 캐시메모리에 반영이 되고 task 스레드 캐시 메모리에는 반영이 되지 않는다
        // 결과적으로 task 스레드의 캐시 메모리상 task.runFlag 변수가 true 이기 때문에 계속 반복한다
        // 반복을 멈추려면 메인 메모리의 runFlag 값을 task 스레드의 반영을 해야 하는데 언제 되는지는 알 수 없다(cpu 마다 다르기 때문)

        // 메모리 가시성
        // 멀티 스레드 환경에서 한 스레드가 변경한 값이 다른 스레드에서 언제 보이는지에 대한 문제를 메모리 가시성 이라고 한다
        // 이름 그대로 메모리에 변경한 값이 보이는가 보이지 않는가의 문제
        log("runFlag : " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {

        // boolean runFlag = true;
        // 캐시 메모리 접근이 아닌 메인 메모리에 직접 접근한다.
        // 캐시 메모리가 메인 메모리보다 가까히 있어 속도는 빠르지만 언제 메인 메모리에 반영 되는지
        // 모르기 때문에 메인 메모리의 거리가 조금 멀더라도(성능이 떨어지더라도) 메인 메모리에 직접 접근하여 값 변경
        volatile boolean runFlag = true;

        @Override
        public void run(){
            log("task 시작");
            while (runFlag){
                // runFlag 가 false 면 빠져나옴
            }
            log("task 종료");
        }
    }
}
