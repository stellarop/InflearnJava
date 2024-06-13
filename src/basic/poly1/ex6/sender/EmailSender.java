package basic.poly1.ex6.sender;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String str) {
        System.out.println("메일을 발송합니다 : " + str);
    }
}
