package Intermediate1.exception.ex0;

public class NetworkClientV0 {
    // 접근할 외부 서버 주소
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect(){
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data){
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
    }
    
    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }
}
