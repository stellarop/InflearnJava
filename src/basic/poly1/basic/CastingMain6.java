package basic.poly1.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain6 {
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

        // Child 인스턴스인 경우 childMethod() 메서드 실행
        // java 16 부터 인스턴스에 변수를 선언할 수 있어서 다운캐스팅 생략 가능
        if(parent instanceof Child child){
            System.out.println("Child 인스턴스 포함");
            child.childMethod();
        }else{
            System.out.println("child 인스턴스 미포함");
        }
    }
}
