package Intermediate1.exception.ex2;

public class NetworkServiceV2_4 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);


        try {
            client.connect();
            // 런타임 예외는 catch 로 잡지 못하기 때문에 밖으로 던져진다.
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류 코드] : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        }
        client.disconnect();
    }
}
