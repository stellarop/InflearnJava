package Intermediate1.lang.wrapper.ex;

public class WrapperEx3 {
    public static void main(String[] args) {
        String str = "100";
        int str1 = Integer.valueOf(str);
        String str2 = Integer.toString(str1);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }
}
