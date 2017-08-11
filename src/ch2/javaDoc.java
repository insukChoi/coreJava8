package ch2;

/**
 * 연습용 클래스 입니다
 *
 * @author insuk
 */
public class javaDoc {

    /**
     * 출력용 메소드 입니다.
     *
     * @param str the str
     * @param x   the x
     * @return String re OK or Failed
     */
    public static void disp(String str, int x) {
         System.out.println("display");
     }

    /**
     * 테스트 메소드 입니다.
     *
     * @return String string
     */
    public String good() {
        System.out.println("display");
        return null;
    }

}
