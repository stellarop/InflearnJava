package advanced1.thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {

        // main 스레드가 HelloThread 인스턴스를 생성 스레드의 이름을 부여하지 않으면 임의에 이름 부여
        // start 메서드 호출 시 Thread-0 스레드가 시작되면서 Thread 스레드가 run() 메서드 호출
        // main 스레드가 run() 메서드를 실행 하는게 아닌 Thread-0 스레드가 run() 메서드를 호출한다
        // main 스레드는 단지 start() 메서드를 통해 Thread-0 스레드에게 실행을 지시할 뿐이다.
        // main 스레드는 다른 스레드에게 일을 시작하라고 지시 후 바로 start() 메서드를 빠져나온다
        // 이제 main 스레드와 Thread-0 스레드는 동시에 실행된다

        // main 스레드 실행
        System.out.println(Thread.currentThread().getName() + " : main() start");

        // helloThread 스레드 인스턴스 생성
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 전");
        // main 스레드 -> helloThread 스레드 실행하라고 명령
        // 이때 main 스레드는 helloThread 스레드가 실행될때 까지 기다리지 않는다 계속 진전
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 후");

        // main 스레드 종료
        System.out.println(Thread.currentThread().getName() + " : main() end");
    }
}
