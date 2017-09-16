package ch5.exercise;

import java.util.Arrays;

public class ex12 {
    public int min(int[] values){
        if(values.length == 0) return 0;
        int minVal = values[0];
        for (int tempVal : values){
            minVal = minVal > tempVal ? tempVal : minVal;
        }
        final int fixedMinVal = minVal;
        // 단정
        assert (Arrays.stream(values).allMatch(a -> fixedMinVal <= a));
        return minVal;
    }

    public static void main(String[] args) {
        ex12 ex12 = new ex12();
        int[] values = {3,4,5,6,7,8,10};
        System.out.println(ex12.min(values));
    }
}
