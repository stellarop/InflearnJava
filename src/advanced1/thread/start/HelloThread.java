package advanced1.thread.start;

public class HelloThread extends Thread{

    // Thread 상속 받은 후 run 메서드 재정의
    @Override
    public void run(){
        // 해당 코드에서 실행하는 스레드 객체와 이름을 조회
        System.out.println(Thread.currentThread().getName() + " : run()");
    }
}
