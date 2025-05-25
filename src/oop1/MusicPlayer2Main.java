package oop1;

public class MusicPlayer2Main {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("음악 시작");

        data.volume++;
        System.out.println("증가" + data.volume);

        data.volume++;
        System.out.println("증가" + data.volume);

        data.volume--;
        System.out.println("감소" + data.volume);

        System.out.println("음악 상태");
        if(data.isOn) {
            System.out.println("현재 " + data.volume);
        }
        else {
            System.out.println("종료");
        }

        data.isOn = false;
        System.out.println("음악 종료");
    }
}
