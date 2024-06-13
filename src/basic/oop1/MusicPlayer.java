package basic.oop1;

public class MusicPlayer {
    int volume;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어 시작");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

     void showStatus(){
        if(isOn){
            System.out.println("음악 플레이어 켜짐");
        }else{
            System.out.println("음악 플레이어 꺼짐");
        }
    }
}
