package basic.static1;

public class DecoData {

    private int inValue;
    private static int stValue;


    public static void staticCall(){

        // inValue++; 인스턴스 변수 접근
        // inMethod(); 인스턴스 메서드 접근

        // 정적 변수 접근
        stValue++;
        // 정적 메서드 접근
        stMethod();
    }

    public void instanceCall(){
        // 인스턴스 변수 접근
        inValue++;
        // 인스턴스 메서드 접근
        inMethod();
        // 정적 변수 접근
        stValue++;
        // 정적 메서드 접근
        stMethod();
    }

    private void inMethod(){
        System.out.println("inMethod : " + inValue);
    }

    private static void stMethod(){
        System.out.println("stMethod : " + stValue);
    }
}
