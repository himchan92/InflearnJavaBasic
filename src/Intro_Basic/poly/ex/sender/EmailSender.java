package Intro_Basic.poly.ex.sender;

public class EmailSender implements Sender {
    @Override
    public void sendMessage() {
        System.out.println("메일을 발송합니다.");
    }
}
