package basic.static1;

public class Data3 {

    // 인스턴스 변수 static이 붙지 않은 필드 변수
    // static이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용 가능 인스턴스에 소속
    public String name;
    // 멤버(필드) 변수에 static이 붙으면 statit 변수, 정적 변수, 클래스 변수라고 함
    // 클래스 변수
    // static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용 가능
    // 클래스 자체에 소속되어 있다
    public static int count;

    public Data3(String name){
        this.name = name;
        count++;
    }
}
