package ch1.exercise;

import java.util.Random;

/**
 * 임의의 long 값을 생성한 후 36진수로 출력해서 임의의 글자와 숫자로 구성된 문자열을 만들어내는
 * 프로그램을 작성하라.
 */
public class ex10 {
    public static void main(String[] args) {
        // Random Valuable
        long val = new Random().nextLong();

        System.out.println("임의의 값의 36진수 = " + Long.toUnsignedString(val, 36));
    }

}
