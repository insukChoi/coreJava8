package ch1.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1~49 사이의 서로 다른 숫자 여섯 개를 골라서 복권의 숫자 조합을 출력하는 프로그램을 작성하라.
 * 서로 다른 숫자 여섯 개를 고르기 위해 먼저 1,...49로 채워진 배열 리스트를 만든다.
 * 임의의 인덱스(색인)을 골라서 해당하는 요소를 제거한다.
 * 이 작업을 여섯 번 반복한다. 그런 다음 결과를 출력한다.
 */
public class ex13 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> resultList = new ArrayList<Integer>();

        // Array List 초기화
        for(int i=0; i< 49; i++){
            arrayList.add(i, i+1);
        }

        // 랜덤으로 섞기
        Collections.shuffle(arrayList);

        resultList.add(0, arrayList.get(0));
        resultList.add(1, arrayList.get(1));
        resultList.add(2, arrayList.get(2));
        resultList.add(3, arrayList.get(3));
        resultList.add(4, arrayList.get(4));
        resultList.add(5, arrayList.get(5));

        // 순차 정렬
        Collections.sort(resultList);

        System.out.println(resultList.toString());
    }
}
