package ch4.exercise.ex4ex5;

import ch4.exercise.ex1ex2ex3.Point;

public class Rectangle extends Shape {

    public Rectangle(Point topLeft, double width, double height){
        super.setPoint(topLeft);
        super.moveBy(width,height);
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }
}
