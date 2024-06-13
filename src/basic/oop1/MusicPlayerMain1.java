package basic.oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어 시작");

        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
        // 볼륨 증가
        System.out.println("음악 플레이어 볼륨 : " + volume);
        // 볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 음악 플레이어 상태 확인
        if(isOn){
            System.out.println("음악 플레이어 켜짐");
        }else{
            System.out.println("음악 플레이어 꺼짐");
        }
    }
}
