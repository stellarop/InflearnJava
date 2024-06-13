package basic.static2.ex;

public class Car {
    private String carName;
    private static int count;

    public Car(String carName){
        count++;
        this.carName = carName;
    }

    static void carCount(){
        System.out.println("차 대수 : " + count);
    }
}
