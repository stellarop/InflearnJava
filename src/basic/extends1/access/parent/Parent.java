package basic.extends1.access.parent;

public class Parent {

    // 모든 외부 호출 허용
    public int publicValue;
    // 같은 패키지에서 호출 허용 패키지가 다르더라도 상속 관계일 시 호출 허용
    protected int protectedValue;
    // 같은 패키지에서 호출 허용
    int defaultValue;
    // 모든 외부 호출 막음
    private int privateValue;

    public void publicMedhod(){
        System.out.println("Parent.publicValue");
    }

    protected void protectedMedhod(){
        System.out.println("Parent.protectedMedhod");
    }

    void defaultMedhod(){
        System.out.println("Parent.default");
    }

    private void privateMedhod(){
        System.out.println("Parent.privateMedhod");
    }

    public void print(){
        System.out.println("==print==");
        System.out.println("publicValue : " + publicValue);
        System.out.println("protectedValue : " + protectedValue);
        System.out.println("defaultValue : " + defaultValue);
        System.out.println("privateValue : " + privateValue);

        // 부모 메서드 안에서 모드 접근 가능
        defaultMedhod();
        privateMedhod();
    }
}
