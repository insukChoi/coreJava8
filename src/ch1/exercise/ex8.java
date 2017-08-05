package ch1.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 문자열을 읽어서 비어 있지 않는 부분 문자열을 모두 출력하는 프로그램을 작성하라.
 */
public class ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Loval Values
        String strVal = "";

        try{
            // Get String by User
            System.out.print("문자열을 입력하시오. : ");
            strVal = sc.nextLine();

            // 비어있지 않는 부분 문자열 출력
            System.out.println(strVal.replace("\u0020",""));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
