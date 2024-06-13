package basic.oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        // 절차지향 프로그래밍

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태 확인
        showStatus(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어 시작");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        if(data.isOn){
            System.out.println("음악 플레이어 켜짐");
        }else{
            System.out.println("음악 플레이어 꺼짐");
        }
    }
}
