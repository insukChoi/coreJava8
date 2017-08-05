package ch1.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 지정한 숫자 n의 파스칼 삼각형을 ArrayList<ArrayList<Integer>>에 저장하는 프로그램을 작성하라.
 */
public class ex15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList> resultArrayList = new ArrayList<ArrayList>();

        try{
            System.out.print("n의 파스칼 삼각형의 n을 입력하시오. : ");
            int nValue = sc.nextInt();

            int[][] pascal = new int[nValue][nValue];
            if(nValue > 0)
                pascal[0][0] = 1;
            if(nValue > 1){
                pascal[1][0] = 1;
                pascal[1][1] = 1;
            }
            if(nValue > 2){
                for(int i = 2 ; i < nValue; ++i) {
                    for(int j = 0 ; j <= i; ++j) {
                        if(j == 0 || j == i)
                            pascal[i][j] = 1;
                        else
                            pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                    }
                }
            }

            // ArrayList 에 담기
            ArrayList<Integer> tempArrayList = null;
            for(int i = 0 ; i < nValue; ++i) {
                tempArrayList = new ArrayList<Integer>();
                for(int j = 0 ; j < nValue; ++j) {
                    if (pascal[i][j] != 0) {
                        tempArrayList.add(pascal[i][j]);
                    }
                }
                resultArrayList.add(tempArrayList);
            }

            System.out.println(resultArrayList.toString());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
