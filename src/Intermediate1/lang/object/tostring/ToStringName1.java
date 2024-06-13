package Intermediate1.lang.object.tostring;

public class ToStringName1 {
    public static void main(String[] args) {
        Object obj = new Object();
        String str = obj.toString();

        // toString() 반환 값 출력
        System.out.println(str);

        // object 직접 출력
        System.out.println(obj);
    }
}
