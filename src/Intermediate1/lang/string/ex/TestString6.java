package Intermediate1.lang.string.ex;

public class TestString6 {
    public static void main(String[] args) {
       String str = "start java hello spring hello jsp";
       String key = "hello";

       String strMain = new StringBuilder(str).toString();
       System.out.println(str.indexOf(key));
    } 
}
