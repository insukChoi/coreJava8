package ch4.exercise.ex4ex5;

import ch4.exercise.ex1ex2ex3.Point;

public class Cicle extends Shape {

    private double radius = 0;
    private final double PI = 3.14159;

    public Cicle(){
        this.radius = 0.0;
    }

    public Cicle(Point center, double radius){
        setPoint(center);
        this.radius = radius;
    }

    public double getArea(){
        return this.PI * this.radius * this.radius;
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }
}
