package Intermediate1.exception.ex2;

public class NetworkClientExceptionV2 extends Exception{
    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        // message 받아서 부모 생성자에 삽입
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
