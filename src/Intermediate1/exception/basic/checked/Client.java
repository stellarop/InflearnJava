package Intermediate1.exception.basic.checked;

public class Client{
    public void call() throws MyCheckException{
        // 문제 상황
        throw new MyCheckException("ex");
    }
}
