package Intermediate1.lang.wrapper.ex;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int lottoArr[] =  new int[6];

    public int[] lottoNumCreate(){

        for (int i = 0; i < 6; i++){
            // 랜덤 난수 변수에 넣어줌
            int num = random.nextInt(45) + 1;
            // 중복된 숫자 있는지 검증 없다면 배열에 난수 넣어줌
            if(isLottoArr(num)){
                lottoArr[i] = num;
            }else{
                System.out.println("중복 숫자 있음");
            }

        }

        return lottoArr;
    }

    // 내부 검증 메서드이므로 private
    private boolean isLottoArr(int num){
        for(int i = 0; i < lottoArr.length; i++){
            // 배열 == 넘긴 난수 비교
            if(lottoArr[i] == num){
                // 비교 후 중복된 값이 있다면 false
                return false;
            }
        }
        // 없으면 true
        return true;
    }


}
