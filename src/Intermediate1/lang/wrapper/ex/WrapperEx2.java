package Intermediate1.lang.wrapper.ex;

public class WrapperEx2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0;

        for(String arr : array){
            sum += Double.parseDouble(arr);
        }

        System.out.println("sum : " + sum);
    }
}
