package ch1.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 0~65,535 사이의 숫자 두 개를 읽어서 short 변수에 저장한 후 int로 변환하지 않은 채로
 * 부호 없는 합계, 차이, 곱, 몫, 나머지를 계산하는 프로그램을 작성하라.
 */
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loval Values
        int numVal = 0;
        int numVal2 = 0;
        short shortNum = 0;
        short shortNum2 = 0;

        try{
            // Get number by User
            System.out.print("0~65,535 사이의 첫번째 숫자를 입력하시오. : ");
            numVal = sc.nextInt();
            if(!isChecked(numVal)) throw new InputMismatchException();

            System.out.print("0~65,535 사이의 첫번째 숫자를 입력하시오. : ");
            numVal2 = sc.nextInt();
            if(!isChecked(numVal2)) throw new InputMismatchException();

            // int to short
            shortNum = (short) numVal;
            shortNum2 = (short) numVal2;

            // print result
            System.out.println("** 부호없는 결과값 **");
            System.out.println("합계 = " + (Short.toUnsignedInt(shortNum) +  Short.toUnsignedInt(shortNum2)));
            System.out.println("차이 = " + (Short.toUnsignedInt(shortNum) -  Short.toUnsignedInt(shortNum2)));
            System.out.println("곱 = " + (Short.toUnsignedInt(shortNum) *  Short.toUnsignedInt(shortNum2)));
            System.out.println("몫 = " + (Short.toUnsignedInt(shortNum) /  Short.toUnsignedInt(shortNum2)));
            System.out.println("나머지 = " + (Short.toUnsignedInt(shortNum) % Short.toUnsignedInt(shortNum2)));

        }catch (InputMismatchException e){
            System.out.print("0~65,535 사이의 숫자만 입력해주세요.");
        }
    }
    /*
     * 0~65,535 사이의 숫자인지 검증
     */
    public static boolean isChecked(int val){
        if( val > 0 && val <= 65535 ) return true;
        else return false;
    }

}
