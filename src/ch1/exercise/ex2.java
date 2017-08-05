package ch1.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 정수(양의 정수 또는 음의 정수)로 각도를 읽고 0 ~359도 사이의 값으로 정규화하는 프로그램을 작성하라.
 * 먼저 % 연산자를 이용해 만들어본 다음, floorMod 메서드를 이용해 만들어본다.
 */
public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Loval Values
        int numVal = 0;
        int angle = 360;

        try{
            // Get number by User
            System.out.print("정수를 입력하시오. : ");
            numVal = sc.nextInt();

            System.out.println("% 를 이용 = " +  ((numVal % angle) + angle) % angle );
            System.out.println("floorMod 를 이용 = " +   Math.floorMod(numVal, angle) );

        }catch (InputMismatchException e){
            System.out.print("정수만 입력해주세요.");
        }
    }
}
