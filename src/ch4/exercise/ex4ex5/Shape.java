package ch4.exercise.ex4ex5;

import ch4.exercise.ex1ex2ex3.Point;

public abstract class Shape implements Cloneable {

    private double dx;
    private double dy;
    private Point point = null;

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return (Shape)super.clone();
    }

    public Shape(){
        this.dx = 0;
        this.dy = 0;
        this.point = new Point(dx, dy);
    }

    public void moveBy(double dx, double dy){
        this.point = new Point(this.dx+dx, this.dy+dy);
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public abstract Point getCenter();
}
