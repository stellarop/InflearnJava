package Intermediate1.lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("개이름1", 2);
        Dog dog2 = new Dog("개이름2", 5);

        // println 은 내부에 toString 을 호출한다
        // 인스턴스 내부에 toString 메서드가 오버라이딩 되어 있다면 오버라이딩 된 메서드 호출

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        // 우리가 일반적으로 보는 참조값
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue : " + refValue);
    }
}
