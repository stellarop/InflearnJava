package Intermediate1.exception.ex2;

public class NetworkClientV2 {
    // 접근할 외부 서버 주소
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if(connectError){
            // 예외는 객체로 넘길수 있기 때문에 에러코드를 생성자로 넣어준다
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2{

        if(sendError){
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);
            // 중간에 다른 예외가 발생했다고 가정하면
            // throw new RuntimeException("ex");
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
