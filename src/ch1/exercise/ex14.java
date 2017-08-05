package ch1.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 2차원 정수 배열을 읽고 매직 스퀘어(즉, 모든 행과 열, 대각선의 합이 같은 사각형)인지 판별하는 프로그램을 작성하라.
 * 프로그램은 입력 행들을 받아서 개별 정수로 분리하고, 사용자가 공백 행을 입력할 때 중단된다.
 * 예를 들어 입력이 아래와 같으면 프로그램은 긍정으로 응답해야 한다.
 */
public class ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Loval Values
        String strVal = "";
        int[][] squareArr = new int[4][4];
        String[] tempArr = new String[4];

        try{
            // 사용자가 공백 행을 입력할때 동안 계속 행을 입력받는다!
            for(int i=0; i<squareArr.length; i++){

                // Get String by User
                System.out.print("행을 입력하세요. : ");
                strVal = sc.nextLine();

                tempArr = strVal.split("\u0020");

                // 공백 행인지 검사
                if(tempArr.length <= 1) break;

                for(int j=0; j<tempArr.length; j++){
                    squareArr[i][j] = Integer.parseInt(tempArr[j]);
                }
            }

            System.out.println(Arrays.deepToString(squareArr));
            System.out.println("이것은 Magic Square 가 "
                    + (isMagicSquare(squareArr) ? "맞습니다." : "아닙니다"));

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /*
     * 매직사각형인지 아닌지 판단하는 함수
     */
    public static boolean isMagicSquare(int[][] arr){

        int magicSum = 0;
        int tempSum = 0;
        int wrongCnt = 0;

        // 행의 합 검증
        for(int[] row : arr){
            for(int elem : row){
                tempSum += elem;
            }
            if(magicSum != tempSum){
                wrongCnt ++;
                magicSum = tempSum;
            }
            tempSum = 0;
            if(wrongCnt > 1) break;
        }
        if(wrongCnt > 1) return false;

        // 열의 합 검증
        for (int col=0; col < arr.length; col++){
            for (int row=0; row < arr[col].length ; row++){
                tempSum += arr[row][col];
            }
            if(magicSum != tempSum){
                wrongCnt ++;
            }
            tempSum = 0;
            if(wrongCnt > 1) break;
        }
        if(wrongCnt > 1) return false;

        // 대각선 합 검증
        for(int i=0; i<arr.length; i++){
            tempSum += arr[i][i];
        }
        if(magicSum != tempSum){
            wrongCnt ++;
        }
        tempSum = 0;
        if(wrongCnt > 1) return false;

        for(int i=0; i<arr.length; i++){
            tempSum += arr[i][arr.length-(i+1)];
        }
        if(magicSum != tempSum){
            wrongCnt ++;
        }
        if(wrongCnt > 1) return false;


        return true;

    }

}
