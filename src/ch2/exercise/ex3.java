package ch2.exercise;

import java.util.Arrays;

/**
 * void 외의 것을 반환하는 변경자 메서드가 있을 수 있는가?
 * void 를 반환하는 접근자 메서드가 있을 수 있는가?
 * 가능하면 예를 제시하라.
 */
public class ex3 {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.getPlusCNT());

        B b = new B();
        b.cut();

    }

}


class A{
    private int CNT = 0;

    public int getPlusCNT(){
        return CNT ++;
    }
}


class B{
    private Arrays array;

    public void cut(){
        B newObject = new B();
        newObject.array = this.array;
        newObject = this;
    }
}