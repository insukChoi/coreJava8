package ch2.exercise;

import java.util.ArrayList;
import java.util.Random;

/**
 * RandomNumbers 클래스 안에 정적 메서드 randomElement 두 개를 구현하라.
 * randomElement는 정수의 배열이나 배열 리스트로부터 임의의 요소를 얻는다.
 * (해당 배열이나 배열 리스트가 비어 있으면 0을 반환한다.)
 * 이 메서드들을 int[]나 ArrayList<Integer>의 인스턴스 메서드로 만들 수 없는 이유는 무엇인가?
 */
public class ex10 {

    // 질문 : 이 메서드들을 int[]나 ArrayList<Integer>의 인스턴스 메서드로 만들 수 없는 이유는 무엇인가?
    /* 답변 : 리턴 타입인 int 는 primitive type 이고 클래스가 아니므로 인스턴스 메서드가 될 수 없다
              또한, 임의의 배열요소를 얻는 것이 목적인데 RandomNumbers 클래스의 인스턴스를 사용할 필요가 딱히 없다.
    */

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(0,2);
        b.add(0,4);
        b.add(0,6);
        b.add(0,8);

        System.out.println("a = "+ex10.randomElement(a));
        System.out.println("b = "+ex10.randomElement(b));

    }


    /**
     * Random element int.
     *
     * @param vals the int[]
     * @return the int
     */
    public static int randomElement(int... vals){
        if(vals.length == 0) return 0;
        int randomIndex = new Random().nextInt(vals.length);
        return vals[randomIndex];
    }

    /**
     * Random element int.
     *
     * @param vals the ArrayList
     * @return the int
     */
    public static int randomElement(ArrayList vals){
        if(vals.size() == 0) return 0;
        int randomIndex = new Random().nextInt(vals.size());
        return (Integer) vals.get(randomIndex);
    }

}
