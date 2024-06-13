package basic.static1;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "java";
        System.out.println("be : " + s);
        // static 메서드는 인스턴스 접근 없이 바로 클래스로 메서드 접근 가능
        System.out.println("af : " + DecoUtil2.deco(s));
    }
}
