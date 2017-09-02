package ch3.exercise.ex1and2;

public class Employee implements Measurable{

    private String name = "";
    private double salary = 0.0;

    Employee(){ }

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    @Override
    public double getMeasure() {
        // 어떤 방법으로 측정...
        return this.salary;
    }

}
