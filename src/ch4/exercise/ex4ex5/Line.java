package ch4.exercise.ex4ex5;

import ch4.exercise.ex1ex2ex3.Point;

public class Line extends Shape {

    public Line(Point from, Point to){
        setPoint(new Point(to.getX() - from.getX(), to.getY() - from.getY()));
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }
}
