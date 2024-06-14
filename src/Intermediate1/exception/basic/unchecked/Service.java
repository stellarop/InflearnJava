package Intermediate1.exception.basic.unchecked;

// UnChecked 예외는 예외를 잡거나 던지지 않아도 된다
// 예외를 잡지 않으면 자동으로 밖으로 던져진다
public class Service {
    Client client = new Client();

    // 필요한 경우 예외를 잡아서 처리
    public void callCatch(){
        try {
            client.call();
        }catch (MyUncheckedException e){
            System.out.println("예외 처리 : " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    // 언체크 예외는 예외를 잡지 않아도 됨
    // 체크 예외랑 다르게 throws 로 예외를 넘기지 않아도 자동으로 넘겨진다
    public void callThrow(){
        client.call();
    }
}
