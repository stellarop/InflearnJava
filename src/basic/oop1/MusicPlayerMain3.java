package basic.oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        // 절차지향 프로그래밍은 객체 안에서 속성과 기능을 조작하였지만
        // 객체지향 프로그래밍은 musicPlayer 를 객체로 만들어서 속성과 기능을 조작

        MusicPlayer musicPlayer = new MusicPlayer();

        // 음악 플레이어 켜기
        musicPlayer.on();

        // 볼륨 증가
        musicPlayer.volumeUp();
        // 볼륨 증가
        musicPlayer.volumeUp();
        // 볼륨 감소
        musicPlayer.volumeDown();

        // 음악 플레이어 상태 확인
        musicPlayer.showStatus();
    }


}
