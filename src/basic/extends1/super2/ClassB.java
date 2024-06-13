package basic.extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a){
        // 기본 생성자 생략 가능
        super();
        System.out.println("ClassB 생성자 a : " + a);
    }

    public ClassB(int a, int b){
        // 기본 생성자 생략 가능
        super();
        System.out.println("ClassB 생성자 a : " + a + " b : " + b);
    }
}
