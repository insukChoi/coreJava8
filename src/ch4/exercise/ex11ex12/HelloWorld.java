package ch4.exercise.ex11ex12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by admin on 2017-09-02.
 */
public class HelloWorld {
    public static void main(String[] args) throws Exception{

        // 리플렉션을 이용한 메서드 호출
        long startTime = System.nanoTime();

        Class<?> systemClass = java.lang.Class.forName("java.lang.System");
        Field outField = systemClass.getDeclaredField("out");

        Class<?> printStreamClass = outField.getType();
        Method printlnMethod = printStreamClass.getDeclaredMethod("println", String.class);
        Object object = outField.get(null);
        printlnMethod.invoke(object, "Hello World !");

        long endTime = System.nanoTime();
        System.out.println("reflection total time = " + (endTime - startTime));


        // 일반 메서드 호출
        startTime = System.nanoTime();
        System.out.println("Hello World");
        endTime = System.nanoTime();
        System.out.println("pojo total time = " + (endTime - startTime));
    }

}
