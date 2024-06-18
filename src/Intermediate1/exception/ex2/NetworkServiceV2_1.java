package Intermediate1.exception.ex2;

public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        // 예외를 잡지않고 던졌기 때문에 스택 트레이스에 예외가 던져짐
        client.connect();
        client.send(data);
        client.disconnect();

    }
}
