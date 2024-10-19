package advanced1.thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");
        // helloRunnable 인스턴스 생성
        HelloRunnable runnable = new HelloRunnable();
        // Thread 생성자는 Runnable 인스턴스를 인자로 받음
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println(Thread.currentThread().getName() + " : main() end");
    }
}
