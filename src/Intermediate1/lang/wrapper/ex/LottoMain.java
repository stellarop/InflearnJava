package Intermediate1.lang.wrapper.ex;

import java.util.Arrays;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        System.out.println(Arrays.toString(lottoGenerator.lottoNumCreate()));

    }
}
