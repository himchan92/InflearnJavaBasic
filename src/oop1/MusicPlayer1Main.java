package oop1;

public class MusicPlayer1Main {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 켭니다.");

        volume++;
        System.out.println(volume);
        volume++; //볼륨 증가
        System.out.println(volume);
        volume--; //볼륨 감소
        System.out.println(volume);

        System.out.println("상태 확인");
        if(isOn) {
            System.out.println(volume);
        }
        else {
            System.out.println("음악 Off");
        }

        isOn = false;
        System.out.println("음악 플레이어 끄기");
    }
}
