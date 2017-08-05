package ch1.exercise;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Scanner;

/**
 * 텍스트 한 줄을 읽고 아스키 외의 모든 문자를 유니코드 값과 함께 출력하는 프로그램을 작성하라.
 */
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loval Values
        String strVal = "";

        try{
            // Get String by User
            System.out.print("문자열을 입력하시오. : ");
            strVal = sc.nextLine();

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<strVal.length(); i++){
                char c = strVal.charAt(i);

                // Ascii 코드
                if((int) c >= 0 && (int) c <128){
                    sb.append(i + " 번째 문자 : "+ c + " = " +(int) c  +"\n");
                }
                // 유니코드
                else{
                    sb.append(i + " 번째 문자 : "+ c + " = " + String.format("\\u%04x", (int) c)  +"\n");
                }
            }
            System.out.println(sb.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
