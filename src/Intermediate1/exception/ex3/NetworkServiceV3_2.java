package Intermediate1.exception.ex3;

import Intermediate1.exception.ex3.NetworkClientV3;
import Intermediate1.exception.ex3.excption.ConnectExceptionV3;
import Intermediate1.exception.ex3.excption.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data);


        try {
            client.connect();
            client.send(data);
            // 연결 예외 캐치
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
            // 그 외 네트워크 오류
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지 : " + e.getMessage());
            // 그 외 예외
        } catch (Exception e){
            System.out.println("[알 수 없는 오류] 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }

    }
}
