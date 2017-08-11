package ch2.exercise;

import org.omg.CORBA.IntHolder;
import org.omg.CORBA.portable.InputStream;

import java.io.BufferedInputStream;

/**
 * 자바에서 두 int 변수의 내용을 맞바꾸는 메서드를 구현할 수 없는 이유는 무엇인가?
 * 대신 두 IntHolder 객체의 내용을 맞바꾸는 메서드를 작성하라. (API 문서에서 잘 알려지지 않은 IntHolder 클래스를 찾아보자).
 * 두 Integer 객체의 내용을 맞바꿀 수 있는가?
 */
public class ex4 {
    public static void main(String[] args) {

        // 질문 : 자바에서 두 int 변수의 내용을 맞바꾸는 메서드를 구현할 수 없는 이유는 무엇인가?
        // 답변 : Call by value 이기 때문에 메서드 유효범위가 끝나면 int 변수의 값은 변하지 않는다.


        // 질문 : 두 IntHolder 객체의 내용을 맞바꾸는 메서드를 작성하라.
        IntHolder intHd = new IntHolder(1);
        IntHolder intHd2 = new IntHolder(2);

        changeIntVal(intHd, intHd2);

        System.out.println("intHd 값 : "+intHd.value);
        System.out.println("intHd2 값 : "+intHd2.value);

    }

    public static void changeIntVal(IntHolder intHd, IntHolder intHd2){
        int temp = intHd.value;
        intHd.value = intHd2.value;
        intHd2.value = temp;
    }
}
