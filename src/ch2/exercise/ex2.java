package ch2.exercise;

import java.util.Random;
import java.util.Scanner;

/**
 * Scanner 클래스의 nextInt 메서드를 생각해보자. 이 메서드는 접근자인가 변경자인가?
 * 그 이유는 무엇인가? Random 클래스의 nextInt 메서드는 어떤가?
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Scanner.nextInt 는 접근자? 변경자 ? ");
        int intVal = sc.nextInt();
        System.out.println(intVal);
        /* return Integer.parseInt(s, radix);
         * 새로운 객체를 return 하므로 접근자다.
         */

        int intRandomVal = new Random().nextInt();
        System.out.println(intRandomVal);
        /* Random() 객체의 seed를 변경하지 않고 this.seed로
         * 계산하여 int 값을 반환함으로 접근자다.
         */
    }
}
