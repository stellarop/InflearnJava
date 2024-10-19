package advanced1.thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");
        DaemonThread daemonThread = new DaemonThread();
        // 데몬 스레드 여부(디폴트 false)
        // false 로 설정 시 10초 뒤에 데몬 스레드가 실행될때까지 대기하지만
        // true 로 설정 시 main 스레드 실행 후 기다리지않고 바로 종료된다
        daemonThread.setDaemon(true);
        // 데몬 스레드 실행
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + " : main() end");
    }

    static class DaemonThread extends Thread {

        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + " run()");

            try {
                Thread.sleep(10000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " run() end");
        }
    }
}
