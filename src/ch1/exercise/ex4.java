package ch1.exercise;

/**
 * double 타입인 양수 값 중 가장 작은 값과 가장 큰 값을 출력하는 프로그램을 작성하라.
 * (힌트: 자바 API에서 Math.nextUp을 찾아보자)
 */
public class ex4 {
    public static void main(String[] args) {
        System.out.println("Math.nextUp 을 이용한 양수 중 가장 작은 값 = "+Math.nextUp(0.0)); // MIN_VALUE
        System.out.println("Math.nextUp 을 이용한 양수 중 가장 큰 값 = "+Math.nextUp(Double.MAX_VALUE));
    }
}
