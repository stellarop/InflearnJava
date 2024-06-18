package Intermediate1.exception.ex3.excption;

public class SendExceptionV3 extends NetworkClientExceptionV3{
    private final String sendData;

    public SendExceptionV3(String message, String sendData) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
