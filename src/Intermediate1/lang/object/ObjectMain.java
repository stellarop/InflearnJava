package Intermediate1.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString 은 Object 클래스 메서드
        String str = child.toString();
        // 클래스명과 인스턴스에 대한 정보 제공
        System.out.println(str);
    }
}
