package ch1.exercise;

/**
 * int의 최댓값보다 큰 double을 int 타입으로 변환하면 무슨 일이 일어나는가? 직접 시도해보자.
 */
public class ex5 {
    public static void main(String[] args) {
        double dVal = Integer.MAX_VALUE + 1.0;
        int resultVal = (int)dVal;

        System.out.println("원래 double 값 "+dVal);
        System.out.println("무슨일이 벌어지나? "+resultVal);
    }
}
