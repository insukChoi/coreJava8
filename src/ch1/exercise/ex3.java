package ch1.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 조건 연산자만 사용해서 정수 세 개를 읽고 최댓값을 출력하는 프로그램을 작성하라.
 * Math.max를 사용해서 같은 프로그램을 작성하라.
 */
public class ex3 {
    public static void main(String[] args) {

        final int TOTL_NUM_CNT = 3;
        Scanner sc = new Scanner(System.in);

        // Loval Values
        int[] numVals = new int[TOTL_NUM_CNT];

        try{
            // Get number by User
            for (int i=0; i<numVals.length; i++){
                System.out.print((i+1)+"번째 정수를 입력하시오. : ");
                numVals[i] = sc.nextInt();
            }

            System.out.println("연산자를 이용한 최댓값 = " + getMaxVal(numVals));
            System.out.println("Math.max 를 이용한 최댓값 = " + getMaxValUsingMath(numVals));

        }catch (InputMismatchException e){
            System.out.print("정수만 입력해주세요.");
        }
    }
    /*
     * 조건 연산자만 사용하여 Max 값 구하는 함수
     */
    public static int getMaxVal(int... vals) {
        int max = Integer.MIN_VALUE;

        for (int val : vals) {
            if (val > max) max = val;
        }

        return max;
    }
    /*
     * Math.max를 사용하여 Max 값 구하는 함수
     */
    public static int getMaxValUsingMath(int... vals) {
        int max = Integer.MIN_VALUE;

        for (int val : vals) {
            max = Math.max(val, max);
        }

        return max;
    }
}
