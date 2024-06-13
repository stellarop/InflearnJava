package basic.poly1.ex6.sender;

public class SendMain {
    public static void main(String[] args) {
        // sender 타입 배열에는 sender 인터페이스를 상속받는 자식 클래스 인스턴스가 들어간다.
        Sender [] sender = {new EmailSender(),new SmsSender(), new FaceBookSender()};

        for (Sender senderList : sender){
            senderList.sendMessage("환영합니다.");
        }
    }
}
