package Intermediate1.nested.nested;

public class ShadowingMain {
    public int value = 1;

    class Inner {
        public int value = 2;

        void go(){
            int value = 3;
            // 지역 변수
            System.out.println("value : " + value);
            // 인스턴스 변수
            System.out.println("this.value : " + this.value);
            // 바깥 클래스 필드
            System.out.println("ShadowingMain.value : " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        Inner inner = shadowingMain.new Inner();
        inner.go();
    }
}
