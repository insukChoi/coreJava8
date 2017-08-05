package ch1.exercise;

/**
 * 1.5.3 문자열 비교에는 s.equals(t)지만, s != t인 두 문자열 s와 t를 비교하는 예제가 있다.
 * 부분 문자열을 사용하지 않는 다른 예를 제시하라.
 */
public class ex9 {
    public static void main(String[] args) {

        String strVal = "Good Game";
        String strVal2 = "Good Game";

        System.out.println("두 문자열이 같은가요? "+ (strVal.compareTo(strVal2) == 0 ? "네 같아요." : "다릅니다."));

    }
}
