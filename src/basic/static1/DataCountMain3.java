package basic.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        // 정적 변수는 인스턴스 영역이 아니라 메서드 영역에서 관리(공용으로 쓰는 변수)
        Data3 data1 = new Data3("A");
        System.out.println("A count : " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count : " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count : " + Data3.count);

        // 인스턴스를 통한 접근
        // 정적 변수의 경우 인스턴스를 통한 접근을 추천하지 않는다.
        // 코드를 읽을때 인스턴스 변수에 접근하는 것처럼 오해할 수 있기 때문
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        // 클래스를 통한 접근
        // 정적 변수는 클래스에서 공용으로 관리하기 때문에 클래스를 통해 접근하는 것이 더 명확하다
        System.out.println(Data3.count);
    }
}
