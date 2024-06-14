package Intermediate1.exception.basic.checked;

// Exception 을 상속 받은 예외는 체크 예외가 된다
public class MyCheckException extends Exception{
    public MyCheckException(String message) {
        // 메시지를 Exception 메서드에 보관
        super(message);
    }
}
