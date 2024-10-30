package advanced1.thread.control;

import advanced1.thread.start.HelloRunnable;

import static advanced1.util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread : " + mainThread);
        log("mainThread.getId() : " + mainThread.getId());
        log("mainThread.getName() : " + mainThread.getName());
        // 스레드 우선 순위
        log("mainThread.getPriority() : " + mainThread.getPriority());
        //
        log("mainThread.getThreadGroup() : " + mainThread.getThreadGroup());
        // 스레드 현재 상태
        log("mainThread.getState() : " + mainThread.getState());

        System.out.println("==============================================" +
                "=========================================================");
        // 스레드 생성
        // 스레드를 생성할 때 실행할 Runnable 인터페이스 구현체와 스레드의 이름 전달
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        // 스레드 객체 정보
        // 스레드 객체를 문자열로 변환하여 출력
        // Thread 클래스의 toString() 메서드는 스레드 id, 스레드 이름, 우선순위, 스레드 그룹을
        // 포함한 문자열을 반환
        log("myThread : " + myThread);
        // 스레드 id
        // 스레드의 고유 식별자를 반환하는 메서드 id는 스레드가 생성될 때 할당되며 직접 지정 할 수 없다
        log("myThread.getId() : " + myThread.getId());
        // 스레드 name
        // 스레드 생성 시 생성자에서 스레드의 이름을 지정했기 때문에 지정한 이름이 반환된다(스레드 이름은 중복가능)
        log("myThread.getName() : " + myThread.getName());
        // 스레드 우선순위
        // 스레드의 우선순위를 반환하는 메서드 우선순위 1(가장 낮음)에서 10(가장 높음)까지의 값으로 설정 가능
        // 기본값은 5이다 settPriority() 메서드를 통해 우선순위 설정 가능
        log("myThread.getPriority() : " + myThread.getPriority());
        // 스레드 그룹
        // 스레드가 속한 스레드 그룹을 반환하는 메서드
        // 스레드 그룹은 스레드를 그룹화하여 관리할 수 있는 기능을 제공한다
        // 스레드 그룹은 여러 스레드를 하나의 그룹으로 묶어서 특정 작업(일괄종료, 우선순위 설정)등을 수행한다
        // 부모 스레드(Parent Thread) : 새로운 스레드를 생성하는 스레드를 의미한다
        // 스레드는 기본적으로 다른 스레드에 의해 생성된다. 이런 생성 관계에서 새로 생성된 스레드를 부모로 간주한다
        // main 스레드에 의해 my 스레드가 생성되었으므로 main 스레드가 부모 스레드
        // main 스레드는 기본으로 제공되는 main 스레드 그룹에 소속되어 있다
        // 따라서 my 스레드도 부모 스레드인 main 스레드의 그룹인 main 스레드 그룹에 소속된다
        log("myThread.getThreadGroup() : " + myThread.getThreadGroup());
        // 스레드 상태
        // 스레드의 현재 상태를 반환하는 메서드, 반환 값은 Thread,State 열거형에 정의된 상수 중 하나이다
        // NEW : 스레드가 시작되기 전 상태
        // RUNNABLE : 스레드가 실행 중이거나 실행될 준비를 마친 상태
        // BLOCKED : 스레드가 동기화 락을 기다리는 상태
        // WAITING : 스레드가 다른 스레드의 특정 작업이 완료되기를 기다리는 상태
        // TIMED_WAITING : 일정 시간 동안 기다리는 상태
        // TERMINATED : 스레드가 실행을 마친 상태
        log("myThread.getState() : " + myThread.getState());
    }
}
