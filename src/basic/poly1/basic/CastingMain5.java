package basic.poly1.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain5 {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

    }

    private static void call(Parent parent){

        parent.parentMethod();

        // 다운캐스팅을 수행하기전 instanceof 를 사용해서 원하는 타입으로 변경 가능한지 확인 후 진행
        // instanceof 비교 시 인스턴스를 참조하면 true 반환 참조하지 않으면 false
        if(parent instanceof Child){
            System.out.println("Child 인스턴스 포함");
            Child child = (Child) parent;
            child.childMethod();
        }else{
            System.out.println("child 인스턴스 미포함");
        }
    }
}
