package basic.extends1.access.child;

import basic.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        // 상속 관계 or 같은 패키지
        protectedValue = 1;
        // 다른 패키지 접근 불가
        // defaultValue = 1;
        // 외부 호출 접근 불가
        // privateValue = 1;

        publicMedhod();
        protectedMedhod();
        // defaultMedhod();
        // privateMedhod();
        print();
    }
}
