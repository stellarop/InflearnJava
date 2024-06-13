package Intermediate1.lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        // Object 인스턴스도 생성 가능
        Object obj = new Object();

        Object[] objArr = {dog, car, obj};

        size(objArr);
    }

    private static void size(Object[] objArr){
        System.out.println("전달된 객체의 수 : " + objArr.length);
    }

}
