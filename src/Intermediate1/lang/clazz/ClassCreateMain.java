package Intermediate1.lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        Class helloClass = Hello.class;
        // Class helloClass2 = Class.forName("lang.clazz.Heloo");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello : " + hello);
        System.out.println("result : " + result);

    }
}
