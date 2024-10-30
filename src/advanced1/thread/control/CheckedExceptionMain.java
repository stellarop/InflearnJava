package advanced1.thread.control;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        // 일반적인 예외는 밖으로 던져서 처리할 수 있음
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        // 자바 문법에 맞지 않아서 체크 예외를 밖으로 던질 수 없다
        // 부모 메서드가 체크 예외를 던지지 않는 경우 재정의한 자식도 던지지 못한다
        // 던지더라도 자식 메서드는 부모 메서드가 던지는 하위 예외만 던질 수 있다
        // 상속 받는 Runnable 인터페이스가 예외를 던지지 않아서 재정의한 run() 메서드와
        // 자식 클래스인 CheckedRunnable 클래스도 예외를 던지지 못한다
        public void run() /*throw Exception*/ {
            // throw new Exception();
        }
    }
}
