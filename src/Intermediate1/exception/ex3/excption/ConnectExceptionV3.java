package Intermediate1.exception.ex3.excption;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {
    private final String address;

    public ConnectExceptionV3(String message, String address) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
