package Intermediate1.exception.ex4;


import Intermediate1.exception.ex4.exception.ConnectExceptionV4;
import Intermediate1.exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {
    // 접근할 외부 서버 주소
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect(){
        if(connectError){
            // 오류 코드로 분류하는게 아닌 예외 그 자체로 어떤 오류가 발생했는지 알 수 있음
            // 예외를 계층화(자식으로 만들었기 때문)
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data){

        if(sendError){
            // throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패: " + data);
            throw new RuntimeException("RuntimeException");
        }

        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }
    
    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data){
        if (data.contains("error1")){
            connectError = true;
        }
        if (data.contains("error2")){
            sendError = true;
        }
    }
}
