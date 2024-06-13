package Intermediate1.lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1),new MyInteger(0),
                new MyInteger(1), new MyInteger(2),new MyInteger(3)};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    // MyInteger 클래스 객체를 통해서 값 비교
    // 값 비교 후 값이 존재하면 해당 값 리턴
    // 값이 존재하지 않으면 클래스 객체이므로 null 리턴 가능
    private static MyInteger findValue(MyInteger[] intArr, int target){
        for(MyInteger myInteger : intArr){
            if(myInteger.getValue() == target){
                return myInteger;
            }
        }
        return null;
    }
}
