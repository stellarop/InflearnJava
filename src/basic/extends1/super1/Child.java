package basic.extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("child.hello");
    }

    public void call(){
        System.out.println("this value : " + this.value);
        System.out.println("super value : " + super.value);

        // this 는 자기 자신의 메서드를 호출
        this.hello();
        // super 는 부모 클래스의 메서드를 호출
        super.hello();
    }

}
