package ch1.exercise;

/**
 * average 메서드를 개선하여 파라미터를 적어도 한 개 이상 전달받으며 호출되게 하라.
 */
public class ex16 {
    public static void main(String[] args) {

        System.out.println(
                average(1.2, 1.3, 2.3, 2.6)
        );
    }
    /*
     * 평균 구하는 함수
     */
    public static double average(double... vals){
        double sum = 0.0;
        for (double d : vals) sum += d;
        return sum/vals.length;
    }
}
