package oop1;

public class MusicPlayer2Main {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        musicOn(data);

        volumeUp(data);

        volumeUp(data);

        volumeDown(data);

        volumeChk(data);

        musicOff(data);
    }

    private static void musicOff(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 종료");
    }

    private static void volumeChk(MusicPlayerData data) {
        System.out.println("음악 상태");
        if(data.isOn) {
            System.out.println("현재 " + data.volume);
        }
        else {
            System.out.println("종료");
        }
    }

    private static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("감소" + data.volume);
    }

    private static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("증가" + data.volume);
    }

    private static void musicOn(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 시작");
    }
}
