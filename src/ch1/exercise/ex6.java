package ch1.exercise;

import java.math.BigInteger;

/**
 * BigInteger를 사용해 팩토리얼 n! = 1 x 2 x ... x n을 계산하는 프로그램을 작성하라.
 * 그리고 프로그램을 이용해 1,000 팩토리얼을 계산하라.
 */
public class ex6 {
    public static void main(String[] args) {
        int val = 1000;

        System.out.print("팩토리얼 결과 = " + getFactorial(val));
    }
    /*
     * 팩토리얼 함수
     */
    public static BigInteger getFactorial(int val){
        if (val == 1) return BigInteger.valueOf(1);
        else return BigInteger.valueOf(val).multiply(getFactorial(val - 1));
    }
}
