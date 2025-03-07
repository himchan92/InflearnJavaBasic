package middle1.exception.ex0;

public class NetworkClientVO {
    private final String address;

    public NetworkClientVO(String address) {
        this.address = address;
    }

    public String connect() {
        //연결 성공
        System.out.println(address + " 연결 성공");
        return "success";
    }

    public String send(String data) {
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
}
