package ch4.exercise.ex10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by admin on 2017-09-02.
 */
public class MethodPrinter {

    public static void methodsPrint(String className) throws ClassNotFoundException{
        Class<?> cl = Class.forName(className);
        while (cl != null){
            for (Method m : cl.getDeclaredMethods()){
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " +
                        m.getReturnType().getCanonicalName() + " " +
                        m.getName() +
                        Arrays.toString(m.getParameters())
                );
            }
            cl = cl.getSuperclass();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException{
        String className = int[].class.getName();

        MethodPrinter.methodsPrint(className);
    }
}
