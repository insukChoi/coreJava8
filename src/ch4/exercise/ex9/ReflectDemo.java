package ch4.exercise.ex9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by admin on 2017-09-02.
 */
public class ReflectDemo {

    private String id ;
    private String name ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        String className = getClass().getName();
        try {
            Class<?> cl = Class.forName(className);
            while (cl != null){
                for (Field f : cl.getDeclaredFields()){
                    sb.append(
                            Modifier.toString(f.getModifiers()) + " " +
                            f.getName() + "\n"
                    );
                }
                cl = cl.getSuperclass();
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ReflectDemo reflectDemo = new ReflectDemo();
        System.out.println(reflectDemo.toString());
    }
}
