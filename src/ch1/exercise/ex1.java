package ch1.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 정수를 읽어서 2진수, 8진수, 16진수로 프로그램을 작성하라.
 * 역수를 16진 부동소수점 수로 출력하라.
 */
public class ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Loval Values
        int numVal = 0;

        try{
            // Get number by User
            System.out.print("정수를 입력하시오. : ");
            numVal = sc.nextInt();

            System.out.println("2 진수 = " + Integer.toBinaryString(numVal));
            System.out.println("8 진수 = "+ Integer.toOctalString(numVal));
            System.out.println("16 진수 = "+ Integer.toHexString(numVal));
            System.out.printf("역수의 16 진 부동소수점 수 = %a", 1.0F/numVal);

        }catch (InputMismatchException e){
            System.out.print("정수만 입력해주세요.");
        }
    }
}
