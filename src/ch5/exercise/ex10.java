package ch5.exercise;

import java.math.BigInteger;

public class ex10 {
    /*
     * 팩토리얼 함수
     */
    public static BigInteger getFactorial(int val){
        // Stack Trace
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for(int i=0; i<elements.length; i++) {
            System.out.println(elements[i]);
        }
        // Factorial 구현부
        if (val == 1) return BigInteger.valueOf(1);
        else return BigInteger.valueOf(val).multiply(getFactorial(val - 1));
    }

    public static void main(String[] args) {
        System.out.print("팩토리얼 결과 = " + getFactorial(2));
    }
}
