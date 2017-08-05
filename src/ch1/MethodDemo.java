package ch1;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by admin on 2017-08-01.
 */
public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!".length());
        System.out.println(new Random().nextInt());

        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());

        // int 표현 범위
        System.out.println("Integer.MIN_VALUE = "+Integer.MIN_VALUE);

        // Unsigned type
        byte b = -2; // byte 표현범위는 -128 to 127
        System.out.println("Unsigned byte = " + Byte.toUnsignedInt(b));
        System.out.println("Unsigned byte = " + (((int) b) & 0xff));

        // 무한대 & 음의 무한대
        System.out.println("Double.POSITIVE_INFINITY = " + Double.POSITIVE_INFINITY);
        System.out.println("Double.NEGATIVE_INFINITY = " + Double.NEGATIVE_INFINITY);

        // Double 메소드를 활용한 Number 인지 확인
        int intVal = 123;
        System.out.println("is Number ? "+ !Double.isNaN(123));

        // 상수 System.out은 개문자를 쓰지 않는 몇 안되는 예다.
        System.out.println("");

        // 합법적인 변환이지만 정보를 손실 할 수 있다.
        float f = 123456789; // float 의 유효자리는 6~7 자리
        System.out.println("f = "+f);

        // 부동소수점과 BigDecimal 차이
        System.out.println("부동소수점 뺄셈 = " + (2.0 - 1.1));
        System.out.println("BigDecimal 뺄셈 = " + BigDecimal.valueOf(2,0).subtract(BigDecimal.valueOf(11,1)));

        
    }
}
